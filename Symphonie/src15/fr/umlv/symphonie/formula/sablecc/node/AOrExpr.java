/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.umlv.symphonie.formula.sablecc.node;

import java.util.*;
import fr.umlv.symphonie.formula.sablecc.analysis.*;

public final class AOrExpr extends PExpr
{
    private PExpr _expr_;
    private TOr _or_;
    private PExprLowPriority _exprLowPriority_;

    public AOrExpr()
    {
    }

    public AOrExpr(
        PExpr _expr_,
        TOr _or_,
        PExprLowPriority _exprLowPriority_)
    {
        setExpr(_expr_);

        setOr(_or_);

        setExprLowPriority(_exprLowPriority_);

    }
    public Object clone()
    {
        return new AOrExpr(
            (PExpr) cloneNode(_expr_),
            (TOr) cloneNode(_or_),
            (PExprLowPriority) cloneNode(_exprLowPriority_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOrExpr(this);
    }

    public PExpr getExpr()
    {
        return _expr_;
    }

    public void setExpr(PExpr node)
    {
        if(_expr_ != null)
        {
            _expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr_ = node;
    }

    public TOr getOr()
    {
        return _or_;
    }

    public void setOr(TOr node)
    {
        if(_or_ != null)
        {
            _or_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _or_ = node;
    }

    public PExprLowPriority getExprLowPriority()
    {
        return _exprLowPriority_;
    }

    public void setExprLowPriority(PExprLowPriority node)
    {
        if(_exprLowPriority_ != null)
        {
            _exprLowPriority_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _exprLowPriority_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_expr_)
            + toString(_or_)
            + toString(_exprLowPriority_);
    }

    void removeChild(Node child)
    {
        if(_expr_ == child)
        {
            _expr_ = null;
            return;
        }

        if(_or_ == child)
        {
            _or_ = null;
            return;
        }

        if(_exprLowPriority_ == child)
        {
            _exprLowPriority_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(_or_ == oldChild)
        {
            setOr((TOr) newChild);
            return;
        }

        if(_exprLowPriority_ == oldChild)
        {
            setExprLowPriority((PExprLowPriority) newChild);
            return;
        }

    }
}
