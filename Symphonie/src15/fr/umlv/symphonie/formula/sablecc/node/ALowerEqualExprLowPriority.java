/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.umlv.symphonie.formula.sablecc.node;

import java.util.*;
import fr.umlv.symphonie.formula.sablecc.analysis.*;

public final class ALowerEqualExprLowPriority extends PExprLowPriority
{
    private PExprLowPriority _exprLowPriority_;
    private TLteq _lteq_;
    private PExprNormalPriority _exprNormalPriority_;

    public ALowerEqualExprLowPriority()
    {
    }

    public ALowerEqualExprLowPriority(
        PExprLowPriority _exprLowPriority_,
        TLteq _lteq_,
        PExprNormalPriority _exprNormalPriority_)
    {
        setExprLowPriority(_exprLowPriority_);

        setLteq(_lteq_);

        setExprNormalPriority(_exprNormalPriority_);

    }
    public Object clone()
    {
        return new ALowerEqualExprLowPriority(
            (PExprLowPriority) cloneNode(_exprLowPriority_),
            (TLteq) cloneNode(_lteq_),
            (PExprNormalPriority) cloneNode(_exprNormalPriority_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALowerEqualExprLowPriority(this);
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

    public TLteq getLteq()
    {
        return _lteq_;
    }

    public void setLteq(TLteq node)
    {
        if(_lteq_ != null)
        {
            _lteq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lteq_ = node;
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
            + toString(_lteq_)
            + toString(_exprNormalPriority_);
    }

    void removeChild(Node child)
    {
        if(_exprLowPriority_ == child)
        {
            _exprLowPriority_ = null;
            return;
        }

        if(_lteq_ == child)
        {
            _lteq_ = null;
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

        if(_lteq_ == oldChild)
        {
            setLteq((TLteq) newChild);
            return;
        }

        if(_exprNormalPriority_ == oldChild)
        {
            setExprNormalPriority((PExprNormalPriority) newChild);
            return;
        }

    }
}