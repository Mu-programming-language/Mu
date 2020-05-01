/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAskBlock extends PAskBlock
{
    private TAsk _ask_;
    private TColumn _column_;
    private PAskInstructionList _askInstructionList_;

    public AAskBlock()
    {
        // Constructor
    }

    public AAskBlock(
        @SuppressWarnings("hiding") TAsk _ask_,
        @SuppressWarnings("hiding") TColumn _column_,
        @SuppressWarnings("hiding") PAskInstructionList _askInstructionList_)
    {
        // Constructor
        setAsk(_ask_);

        setColumn(_column_);

        setAskInstructionList(_askInstructionList_);

    }

    @Override
    public Object clone()
    {
        return new AAskBlock(
            cloneNode(this._ask_),
            cloneNode(this._column_),
            cloneNode(this._askInstructionList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAskBlock(this);
    }

    public TAsk getAsk()
    {
        return this._ask_;
    }

    public void setAsk(TAsk node)
    {
        if(this._ask_ != null)
        {
            this._ask_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ask_ = node;
    }

    public TColumn getColumn()
    {
        return this._column_;
    }

    public void setColumn(TColumn node)
    {
        if(this._column_ != null)
        {
            this._column_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._column_ = node;
    }

    public PAskInstructionList getAskInstructionList()
    {
        return this._askInstructionList_;
    }

    public void setAskInstructionList(PAskInstructionList node)
    {
        if(this._askInstructionList_ != null)
        {
            this._askInstructionList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._askInstructionList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ask_)
            + toString(this._column_)
            + toString(this._askInstructionList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ask_ == child)
        {
            this._ask_ = null;
            return;
        }

        if(this._column_ == child)
        {
            this._column_ = null;
            return;
        }

        if(this._askInstructionList_ == child)
        {
            this._askInstructionList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ask_ == oldChild)
        {
            setAsk((TAsk) newChild);
            return;
        }

        if(this._column_ == oldChild)
        {
            setColumn((TColumn) newChild);
            return;
        }

        if(this._askInstructionList_ == oldChild)
        {
            setAskInstructionList((PAskInstructionList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}