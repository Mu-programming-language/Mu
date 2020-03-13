/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ATermElementFactor extends PElementFactor
{
    private PElementTerm _elementTerm_;

    public ATermElementFactor()
    {
        // Constructor
    }

    public ATermElementFactor(
        @SuppressWarnings("hiding") PElementTerm _elementTerm_)
    {
        // Constructor
        setElementTerm(_elementTerm_);

    }

    @Override
    public Object clone()
    {
        return new ATermElementFactor(
            cloneNode(this._elementTerm_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermElementFactor(this);
    }

    public PElementTerm getElementTerm()
    {
        return this._elementTerm_;
    }

    public void setElementTerm(PElementTerm node)
    {
        if(this._elementTerm_ != null)
        {
            this._elementTerm_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elementTerm_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._elementTerm_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._elementTerm_ == child)
        {
            this._elementTerm_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._elementTerm_ == oldChild)
        {
            setElementTerm((PElementTerm) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}