/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.umlv.symphonie.formula.sablecc.node;

import java.util.*;
import fr.umlv.symphonie.formula.sablecc.analysis.*;

public final class APluginsKeyWordsBloc extends PBloc
{
    private TDollar _dollar_;
    private TFunctionKeyName _functionKeyName_;

    public APluginsKeyWordsBloc()
    {
    }

    public APluginsKeyWordsBloc(
        TDollar _dollar_,
        TFunctionKeyName _functionKeyName_)
    {
        setDollar(_dollar_);

        setFunctionKeyName(_functionKeyName_);

    }
    public Object clone()
    {
        return new APluginsKeyWordsBloc(
            (TDollar) cloneNode(_dollar_),
            (TFunctionKeyName) cloneNode(_functionKeyName_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPluginsKeyWordsBloc(this);
    }

    public TDollar getDollar()
    {
        return _dollar_;
    }

    public void setDollar(TDollar node)
    {
        if(_dollar_ != null)
        {
            _dollar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _dollar_ = node;
    }

    public TFunctionKeyName getFunctionKeyName()
    {
        return _functionKeyName_;
    }

    public void setFunctionKeyName(TFunctionKeyName node)
    {
        if(_functionKeyName_ != null)
        {
            _functionKeyName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _functionKeyName_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_dollar_)
            + toString(_functionKeyName_);
    }

    void removeChild(Node child)
    {
        if(_dollar_ == child)
        {
            _dollar_ = null;
            return;
        }

        if(_functionKeyName_ == child)
        {
            _functionKeyName_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_dollar_ == oldChild)
        {
            setDollar((TDollar) newChild);
            return;
        }

        if(_functionKeyName_ == oldChild)
        {
            setFunctionKeyName((TFunctionKeyName) newChild);
            return;
        }

    }
}