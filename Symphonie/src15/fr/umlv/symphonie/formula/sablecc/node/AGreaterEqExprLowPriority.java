/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.umlv.symphonie.formula.sablecc.node;

import java.util.*;
import fr.umlv.symphonie.formula.sablecc.analysis.*;

public final class AGreaterEqExprLowPriority extends PExprLowPriority
{
    private PExprLowPriority _exprLowPriority_;
    private TGteq _gteq_;
    private PExprNormalPriority _exprNormalPriority_;

    public AGreaterEqExprLowPriority()
    {
    }

    public AGreaterEqExprLowPriority(
        PExprLowPriority _exprLowPriority_,
        TGteq _gteq_,
        PExprNormalPriority _exprNormalPriority_)
    {
        setExprLowPriority(_exprLowPriority_);

        setGteq(_gteq_);

        setExprNormalPriority(_exprNormalPriority_);

    }
    public Object clone()
    {
        return new AGreaterEqExprLowPriority(
            (PExprLowPriority) cloneNode(_exprLowPriority_),
            (TGteq) cloneNode(_gteq_),
            (PExprNormalPriority) cloneNode(_exprNormalPriority_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGreaterEqExprLowPriority(this);
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

    public TGteq getGteq()
    {
        return _gteq_;
    }

    public void setGteq(TGteq node)
    {
        if(_gteq_ != null)
        {
            _gteq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _gteq_ = node;
    }

    public PExprNormalPriority getExprNormalPriority()
    {
        return _exprNormalPriority_;
    }

    public void setExprNormalPriority(PExprNormalPriority node)
    {
        if(_exprNormalPriority_ != null)
        {
            _exprNormalPriority_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _exprNormalPriority_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_exprLowPriority_)
            + toString(_gteq_)
            + toString(_exprNormalPriority_);
    }

    void removeChild(Node child)
    {
        if(_exprLowPriority_ == child)
        {
            _exprLowPriority_ = null;
            return;
        }

        if(_gteq_ == child)
        {
            _gteq_ = null;
            return;
        }

        if(_exprNormalPriority_ == child)
        {
            _exprNormalPriority_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_exprLowPriority_ == oldChild)
        {
            setExprLowPriority((PExprLowPriority) newChild);
            return;
        }

        if(_gteq_ == oldChild)
        {
            setGteq((TGteq) newChild);
            return;
        }

        if(_exprNormalPriority_ == oldChild)
        {
            setExprNormalPriority((PExprNormalPriority) newChild);
            return;
        }

    }
}
