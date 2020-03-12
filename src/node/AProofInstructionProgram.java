/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AProofInstructionProgram extends PProgram
{
    private TProof _proof_;
    private TColumn _column_;
    private PProofInstruction _proofInstruction_;

    public AProofInstructionProgram()
    {
        // Constructor
    }

    public AProofInstructionProgram(
        @SuppressWarnings("hiding") TProof _proof_,
        @SuppressWarnings("hiding") TColumn _column_,
        @SuppressWarnings("hiding") PProofInstruction _proofInstruction_)
    {
        // Constructor
        setProof(_proof_);

        setColumn(_column_);

        setProofInstruction(_proofInstruction_);

    }

    @Override
    public Object clone()
    {
        return new AProofInstructionProgram(
            cloneNode(this._proof_),
            cloneNode(this._column_),
            cloneNode(this._proofInstruction_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProofInstructionProgram(this);
    }

    public TProof getProof()
    {
        return this._proof_;
    }

    public void setProof(TProof node)
    {
        if(this._proof_ != null)
        {
            this._proof_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._proof_ = node;
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

    public PProofInstruction getProofInstruction()
    {
        return this._proofInstruction_;
    }

    public void setProofInstruction(PProofInstruction node)
    {
        if(this._proofInstruction_ != null)
        {
            this._proofInstruction_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._proofInstruction_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._proof_)
            + toString(this._column_)
            + toString(this._proofInstruction_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._proof_ == child)
        {
            this._proof_ = null;
            return;
        }

        if(this._column_ == child)
        {
            this._column_ = null;
            return;
        }

        if(this._proofInstruction_ == child)
        {
            this._proofInstruction_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._proof_ == oldChild)
        {
            setProof((TProof) newChild);
            return;
        }

        if(this._column_ == oldChild)
        {
            setColumn((TColumn) newChild);
            return;
        }

        if(this._proofInstruction_ == oldChild)
        {
            setProofInstruction((PProofInstruction) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
