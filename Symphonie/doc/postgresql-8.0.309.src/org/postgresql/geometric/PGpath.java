/*-------------------------------------------------------------------------
*
* Copyright (c) 2003-2005, PostgreSQL Global Development Group
*
* IDENTIFICATION
*   $PostgreSQL: pgjdbc/org/postgresql/geometric/PGpath.java,v 1.13 2005/01/11 08:25:45 jurka Exp $
*
*-------------------------------------------------------------------------
*/
package org.postgresql.geometric;

import org.postgresql.util.GT;
import org.postgresql.util.PGobject;
import org.postgresql.util.PGtokenizer;
import org.postgresql.util.PSQLException;
import org.postgresql.util.PSQLState;

import java.io.Serializable;
import java.sql.SQLException;

/**
 *     This implements a path (a multiple segmented line, which may be closed)
 */
public class PGpath extends PGobject implements Serializable, Cloneable
{
    /**
     * True if the path is open, false if closed
     */
    public boolean open;

    /**
     * The points defining this path
     */
    public PGpoint points[];

    /**
     * @param points the PGpoints that define the path
     * @param open True if the path is open, false if closed
     */
    public PGpath(PGpoint[] points, boolean open)
    {
        this();
        this.points = points;
        this.open = open;
    }

    /**
     * Required by the driver
     */
    public PGpath()
    {
        setType("path");
    }

    /**
     * @param s definition of the path in PostgreSQL's syntax.
     * @exception SQLException on conversion failure
     */
    public PGpath(String s) throws SQLException
    {
        this();
        setValue(s);
    }

    /**
     * @param s Definition of the path in PostgreSQL's syntax
     * @exception SQLException on conversion failure
     */
    public void setValue(String s) throws SQLException
    {
        // First test to see if were open
        if (s.startsWith("[") && s.endsWith("]"))
        {
            open = true;
            s = PGtokenizer.removeBox(s);
        }
        else if (s.startsWith("(") && s.endsWith(")"))
        {
            open = false;
            s = PGtokenizer.removePara(s);
        }
        else
            throw new PSQLException(GT.tr("Cannot tell if path is open or closed: {0}.", s), PSQLState.DATA_TYPE_MISMATCH);

        PGtokenizer t = new PGtokenizer(s, ',');
        int npoints = t.getSize();
        points = new PGpoint[npoints];
        for (int p = 0;p < npoints;p++)
            points[p] = new PGpoint(t.getToken(p));
    }

    /**
     * @param obj Object to compare with
     * @return true if the two paths are identical
     */
    public boolean equals(Object obj)
    {
        if (obj instanceof PGpath)
        {
            PGpath p = (PGpath)obj;

            if (p.points.length != points.length)
                return false;

            if (p.open != open)
                return false;

            for (int i = 0;i < points.length;i++)
                if (!points[i].equals(p.points[i]))
                    return false;

            return true;
        }
        return false;
    }

    public int hashCode() {
        // XXX not very good..
        int hash = 0;
        for (int i = 0; i < points.length && i < 5; ++i)
        {
            hash = hash ^ points[i].hashCode();
        }
        return hash;
    }

    public Object clone()
    {
        PGpoint ary[] = new PGpoint[points.length];
        for (int i = 0;i < points.length;i++)
            ary[i] = (PGpoint)points[i].clone();
        return new PGpath(ary, open);
    }

    /**
     * This returns the path in the syntax expected by org.postgresql
     */
    public String getValue()
    {
        StringBuffer b = new StringBuffer(open ? "[" : "(");

        for (int p = 0;p < points.length;p++)
        {
            if (p > 0)
                b.append(",");
            b.append(points[p].toString());
        }
        b.append(open ? "]" : ")");

        return b.toString();
    }

    public boolean isOpen()
    {
        return open;
    }

    public boolean isClosed()
    {
        return !open;
    }

    public void closePath()
    {
        open = false;
    }

    public void openPath()
    {
        open = true;
    }
}
