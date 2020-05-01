/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ALogicalAndAndExpression extends PAndExpression
{
    private PAndExpression _andExpression_;
    private TLogicalAnd _logicalAnd_;
    private POrExpression _orExpression_;

    public ALogicalAndAndExpression()
    {
        // Constructor
    }

    public ALogicalAndAndExpression(
        @SuppressWarnings("hiding") PAndExpression _andExpression_,
        @SuppressWarnings("hiding") TLogicalAnd _logicalAnd_,
        @SuppressWarnings("hiding") POrExpression _orExpression_)
    {
        // Constructor
        setAndExpression(_andExpression_);

        setLogicalAnd(_logicalAnd_);

        setOrExpression(_orExpression_);

    }

    @Override
    public Object clone()
    {
        return new ALogicalAndAndExpression(
            cloneNode(this._andExpression_),
            cloneNode(this._logicalAnd_),
            cloneNode(this._orExpression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALogicalAndAndExpression(this);
    }

    public PAndExpression getAndExpression()
    {
        return this._andExpression_;
    }

    public void setAndExpression(PAndExpression node)
    {
        if(this._andExpression_ != null)
        {
            this._andExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._andExpression_ = node;
    }

    public TLogicalAnd getLogicalAnd()
    {
        return this._logicalAnd_;
    }

    public void setLogicalAnd(TLogicalAnd node)
    {
        if(this._logicalAnd_ != null)
        {
            this._logicalAnd_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._logicalAnd_ = node;
    }

    public POrExpression getOrExpression()
    {
        return this._orExpression_;
    }

    public void setOrExpression(POrExpression node)
    {
        if(this._orExpression_ != null)
        {
            this._orExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._orExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._andExpression_)
            + toString(this._logicalAnd_)
            + toString(this._orExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._andExpression_ == child)
        {
            this._andExpression_ = null;
            return;
        }

        if(this._logicalAnd_ == child)
        {
            this._logicalAnd_ = null;
            return;
        }

        if(this._orExpression_ == child)
        {
            this._orExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._andExpression_ == oldChild)
        {
            setAndExpression((PAndExpression) newChild);
            return;
        }

        if(this._logicalAnd_ == oldChild)
        {
            setLogicalAnd((TLogicalAnd) newChild);
            return;
        }

        if(this._orExpression_ == oldChild)
        {
            setOrExpression((POrExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}