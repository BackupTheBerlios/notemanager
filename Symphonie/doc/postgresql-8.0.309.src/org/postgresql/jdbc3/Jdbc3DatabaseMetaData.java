/*-------------------------------------------------------------------------
*
* Copyright (c) 2004-2005, PostgreSQL Global Development Group
*
* IDENTIFICATION
*   $PostgreSQL: pgjdbc/org/postgresql/jdbc3/Jdbc3DatabaseMetaData.java,v 1.5 2005/01/11 08:25:47 jurka Exp $
*
*-------------------------------------------------------------------------
*/
package org.postgresql.jdbc3;


public class Jdbc3DatabaseMetaData extends org.postgresql.jdbc3.AbstractJdbc3DatabaseMetaData implements java.sql.DatabaseMetaData
{

    public Jdbc3DatabaseMetaData(Jdbc3Connection conn)
    {
        super(conn);
    }

}
