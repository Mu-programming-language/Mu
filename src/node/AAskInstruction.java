/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAskInstruction extends PAskInstruction
{
    private THashtag _hashtag_;
    private TNumber _number_;
    private TColumn _column_;
    private TShow _show_;
    private PSetExpression _setExpression_;

    public AAskInstruction()
    {
        // Constructor
    }

    public AAskInstruction(
        @SuppressWarnings("hiding") THashtag _hashtag_,
        @SuppressWarnings("hiding") TNumber _number_,
        @SuppressWarnings("hiding") TColumn _column_,
        @SuppressWarnings("hiding") TShow _show_,
        @SuppressWarnings("hiding") PSetExpression _setExpression_)
    {
        // Constructor
        setHashtag(_hashtag_);

        setNumber(_number_);

        setColumn(_column_);

        setShow(_show_);

        setSetExpression(_setExpression_);

    }

    @Override
    public Object clone()
    {
        return new AAskInstruction(
            cloneNode(this._hashtag_),
            cloneNode(this._number_),
            cloneNode(this._column_),
            cloneNode(this._show_),
            cloneNode(this._setExpression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAskInstruction(this);
    }

    public THashtag getHashtag()
    {
        return this._hashtag_;
    }

    public void setHashtag(THashtag node)
    {
        if(this._hashtag_ != null)
        {
            this._hashtag_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._hashtag_ = node;
    }

    public TNumber getNumber()
    {
        return this._number_;
    }

    public void setNumber(TNumber node)
    {
        if(this._number_ != null)
        {
            this._number_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._number_ = node;
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

    public TShow getShow()
    {
        return this._show_;
    }

    public void setShow(TShow node)
    {
        if(this._show_ != null)
        {
            this._show_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._show_ = node;
    }

    public PSetExpression getSetExpression()
    {
        return this._setExpression_;
    }

    public void setSetExpression(PSetExpression node)
    {
        if(this._setExpression_ != null)
        {
            this._setExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._setExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._hashtag_)
            + toString(this._number_)
            + toString(this._column_)
            + toString(this._show_)
            + toString(this._setExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._hashtag_ == child)
        {
            this._hashtag_ = null;
            return;
        }

        if(this._number_ == child)
        {
            this._number_ = null;
            return;
        }

        if(this._column_ == child)
        {
            this._column_ = null;
            return;
        }

        if(this._show_ == child)
        {
            this._show_ = null;
            return;
        }

        if(this._setExpression_ == child)
        {
            this._setExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._hashtag_ == oldChild)
        {
            setHashtag((THashtag) newChild);
            return;
        }

        if(this._number_ == oldChild)
        {
            setNumber((TNumber) newChild);
            return;
        }

        if(this._column_ == oldChild)
        {
            setColumn((TColumn) newChild);
            return;
        }

        if(this._show_ == oldChild)
        {
            setShow((TShow) newChild);
            return;
        }

        if(this._setExpression_ == oldChild)
        {
            setSetExpression((PSetExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
