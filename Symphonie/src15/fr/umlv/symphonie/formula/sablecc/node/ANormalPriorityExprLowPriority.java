/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.umlv.symphonie.formula.sablecc.node;

import java.util.*;
import fr.umlv.symphonie.formula.sablecc.analysis.*;

public final class ANormalPriorityExprLowPriority extends PExprLowPriority
{
    private PExprNormalPriority _exprNormalPriority_;

    public ANormalPriorityExprLowPriority()
    {
    }

    public ANormalPriorityExprLowPriority(
        PExprNormalPriority _exprNormalPriority_)
    {
        setExprNormalPriority(_exprNormalPriority_);

    }
    public Object clone()
    {
        return new ANormalPriorityExprLowPriority(
            (PExprNormalPriority) cloneNode(_exprNormalPriority_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANormalPriorityExprLowPriority(this);
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
            + toString(_exprNormalPriority_);
    }

    void removeChild(Node child)
    {
        if(_exprNormalPriority_ == child)
        {
            _exprNormalPriority_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_exprNormalPriority_ == oldChild)
        {
            setExprNormalPriority((PExprNormalPriority) newChild);
            return;
        }

    }
}
