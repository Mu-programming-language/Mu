/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ADefinitionStatementInstruction extends PStatementInstruction
{
    private TLet _let_;
    private TSetIdentifier _setIdentifier_;
    private TEqualTo _equalTo_;
    private PSet _set_;

    public ADefinitionStatementInstruction()
    {
        // Constructor
    }

    public ADefinitionStatementInstruction(
        @SuppressWarnings("hiding") TLet _let_,
        @SuppressWarnings("hiding") TSetIdentifier _setIdentifier_,
        @SuppressWarnings("hiding") TEqualTo _equalTo_,
        @SuppressWarnings("hiding") PSet _set_)
    {
        // Constructor
        setLet(_let_);

        setSetIdentifier(_setIdentifier_);

        setEqualTo(_equalTo_);

        setSet(_set_);

    }

    @Override
    public Object clone()
    {
        return new ADefinitionStatementInstruction(
            cloneNode(this._let_),
            cloneNode(this._setIdentifier_),
            cloneNode(this._equalTo_),
            cloneNode(this._set_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADefinitionStatementInstruction(this);
    }

    public TLet getLet()
    {
        return this._let_;
    }

    public void setLet(TLet node)
    {
        if(this._let_ != null)
        {
            this._let_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._let_ = node;
    }

    public TSetIdentifier getSetIdentifier()
    {
        return this._setIdentifier_;
    }

    public void setSetIdentifier(TSetIdentifier node)
    {
        if(this._setIdentifier_ != null)
        {
            this._setIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._setIdentifier_ = node;
    }

    public TEqualTo getEqualTo()
    {
        return this._equalTo_;
    }

    public void setEqualTo(TEqualTo node)
    {
        if(this._equalTo_ != null)
        {
            this._equalTo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._equalTo_ = node;
    }

    public PSet getSet()
    {
        return this._set_;
    }

    public void setSet(PSet node)
    {
        if(this._set_ != null)
        {
            this._set_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._set_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._let_)
            + toString(this._setIdentifier_)
            + toString(this._equalTo_)
            + toString(this._set_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._let_ == child)
        {
            this._let_ = null;
            return;
        }

        if(this._setIdentifier_ == child)
        {
            this._setIdentifier_ = null;
            return;
        }

        if(this._equalTo_ == child)
        {
            this._equalTo_ = null;
            return;
        }

        if(this._set_ == child)
        {
            this._set_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._let_ == oldChild)
        {
            setLet((TLet) newChild);
            return;
        }

        if(this._setIdentifier_ == oldChild)
        {
            setSetIdentifier((TSetIdentifier) newChild);
            return;
        }

        if(this._equalTo_ == oldChild)
        {
            setEqualTo((TEqualTo) newChild);
            return;
        }

        if(this._set_ == oldChild)
        {
            setSet((PSet) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
