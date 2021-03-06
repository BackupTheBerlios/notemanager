/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.umlv.symphonie.formula.sablecc.node;

import java.util.*;
import fr.umlv.symphonie.formula.sablecc.analysis.*;

public final class AHighPriorityExprNormalPriority extends PExprNormalPriority
{
    private PExprHighPriority _exprHighPriority_;

    public AHighPriorityExprNormalPriority()
    {
    }

    public AHighPriorityExprNormalPriority(
        PExprHighPriority _exprHighPriority_)
    {
        setExprHighPriority(_exprHighPriority_);

    }
    public Object clone()
    {
        return new AHighPriorityExprNormalPriority(
            (PExprHighPriority) cloneNode(_exprHighPriority_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAHighPriorityExprNormalPriority(this);
    }

    public PExprHighPriority getExprHighPriority()
    {
        return _exprHighPriority_;
    }

    public void setExprHighPriority(PExprHighPriority node)
    {
        if(_exprHighPriority_ != null)
        {
            _exprHighPriority_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _exprHighPriority_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_exprHighPriority_);
    }

    void removeChild(Node child)
    {
        if(_exprHighPriority_ == child)
        {
            _exprHighPriority_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_exprHighPriority_ == oldChild)
        {
            setExprHighPriority((PExprHighPriority) newChild);
            return;
        }

    }
}
