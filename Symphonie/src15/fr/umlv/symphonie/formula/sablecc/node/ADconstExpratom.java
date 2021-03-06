/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.umlv.symphonie.formula.sablecc.node;

import java.util.*;
import fr.umlv.symphonie.formula.sablecc.analysis.*;

public final class ADconstExpratom extends PExpratom
{
    private TDconst _dconst_;

    public ADconstExpratom()
    {
    }

    public ADconstExpratom(
        TDconst _dconst_)
    {
        setDconst(_dconst_);

    }
    public Object clone()
    {
        return new ADconstExpratom(
            (TDconst) cloneNode(_dconst_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADconstExpratom(this);
    }

    public TDconst getDconst()
    {
        return _dconst_;
    }

    public void setDconst(TDconst node)
    {
        if(_dconst_ != null)
        {
            _dconst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _dconst_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_dconst_);
    }

    void removeChild(Node child)
    {
        if(_dconst_ == child)
        {
            _dconst_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_dconst_ == oldChild)
        {
            setDconst((TDconst) newChild);
            return;
        }

    }
}
