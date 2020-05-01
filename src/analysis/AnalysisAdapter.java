/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInstructions(AInstructions node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStatementBlock(AStatementBlock node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAskBlock(AAskBlock node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProofBlock(AProofBlock node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStatementInstructionList(AStatementInstructionList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAdditionalStatementInstruction(AAdditionalStatementInstruction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclarationStatementInstruction(ADeclarationStatementInstruction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignmentStatementInstruction(AAssignmentStatementInstruction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefinitionStatementInstruction(ADefinitionStatementInstruction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAskInstructionList(AAskInstructionList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAdditionalAskInstruction(AAdditionalAskInstruction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAskInstruction(AAskInstruction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProofInstructionList(AProofInstructionList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAdditionalProofInstruction(AAdditionalProofInstruction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProofInstruction(AProofInstruction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADemonstration(ADemonstration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPropositionPropositionList(APropositionPropositionList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConclusionPropositionList(AConclusionPropositionList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAImplicationAdditionalProposition(AImplicationAdditionalProposition node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEquivalenceAdditionalProposition(AEquivalenceAdditionalProposition node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressionProposition(AExpressionProposition node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAForAllProposition(AForAllProposition node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExistProposition(AExistProposition node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpression(AExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALogicalOrAndExpression(ALogicalOrAndExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALogicalAndAndExpression(ALogicalAndAndExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressionOrExpression(AExpressionOrExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALogicalOrOrExpression(ALogicalOrOrExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressionSimpleExpression(AExpressionSimpleExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASetExpressionSimpleExpression(ASetExpressionSimpleExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElementExpressionSimpleExpression(AElementExpressionSimpleExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComparisonSetExpression(AComparisonSetExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArithmeticSetComparison(AArithmeticSetComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqualToSetComparison(AEqualToSetComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotEqualToSetComparison(ANotEqualToSetComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubsetOfSetComparison(ASubsetOfSetComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotASubsetOfSetComparison(ANotASubsetOfSetComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASupersetOfSetComparison(ASupersetOfSetComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotASupersetOfSetComparison(ANotASupersetOfSetComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFactorSetArithmetic(AFactorSetArithmetic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusSetArithmetic(APlusSetArithmetic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeprivedOfSetArithmetic(ADeprivedOfSetArithmetic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnionSetArithmetic(AUnionSetArithmetic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntersectionSetArithmetic(AIntersectionSetArithmetic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermSetFactor(ATermSetFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultSetFactor(AMultSetFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermSetExponent(ATermSetExponent node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpSetExponent(AExpSetExponent node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdentifierSetTerm(AIdentifierSetTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElementSetTerm(AElementSetTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressionSetTerm(AExpressionSetTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComparisonElementExpression(AComparisonElementExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArithmeticElementComparison(AArithmeticElementComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqualToElementComparison(AEqualToElementComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotEqualToElementComparison(ANotEqualToElementComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGreaterThanElementComparison(AGreaterThanElementComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotGreaterThanElementComparison(ANotGreaterThanElementComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALessThanElementComparison(ALessThanElementComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotLessThanElementComparison(ANotLessThanElementComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGreaterThanOrEqualToElementComparison(AGreaterThanOrEqualToElementComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANeitherGreaterThanNorEqualToElementComparison(ANeitherGreaterThanNorEqualToElementComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALessThanOrEqualToElementComparison(ALessThanOrEqualToElementComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANeitherLessThanNorEqualToElementComparison(ANeitherLessThanNorEqualToElementComparison node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFactorElementArithmetic(AFactorElementArithmetic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusElementArithmetic(APlusElementArithmetic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusElementArithmetic(AMinusElementArithmetic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermElementFactor(ATermElementFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplicationElementFactor(AMultiplicationElementFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivisionElementFactor(ADivisionElementFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModuloElementFactor(AModuloElementFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumberElementTerm(ANumberElementTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElementElementTerm(AElementElementTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressionElementTerm(AExpressionElementTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCategory(TCategory node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProof(TProof node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStatement(TStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAsk(TAsk node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLet(TLet node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDone(TDone node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTShow(TShow node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTThus(TThus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDeprivedOf(TDeprivedOf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEmptySet(TEmptySet node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMultiplication(TMultiplication node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivision(TDivision node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTModulo(TModulo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPower(TPower node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTForAll(TForAll node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTExist(TExist node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSuchAs(TSuchAs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColumn(TColumn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTHashtag(THashtag node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTImplicationSign(TImplicationSign node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEquivalenceSign(TEquivalenceSign node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLogicalAnd(TLogicalAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLogicalOr(TLogicalOr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTUnion(TUnion node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIntersection(TIntersection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSubsetOf(TSubsetOf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSupersetOf(TSupersetOf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNotASubsetOf(TNotASubsetOf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNotASupersetOf(TNotASupersetOf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElementOf(TElementOf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTContainsAsMember(TContainsAsMember node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNotAnElementOf(TNotAnElementOf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoesNotContainAsMember(TDoesNotContainAsMember node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeftBrace(TLeftBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRightBrace(TRightBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeftParenthesis(TLeftParenthesis node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRightParenthesis(TRightParenthesis node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLelftBracket(TLelftBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRightBracket(TRightBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEqualTo(TEqualTo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreaterThan(TGreaterThan node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLessThan(TLessThan node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreaterThanOrEqualTo(TGreaterThanOrEqualTo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLessThanOrEqualTo(TLessThanOrEqualTo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNotEqualTo(TNotEqualTo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNotGreaterThan(TNotGreaterThan node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNotLessThan(TNotLessThan node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNeitherGreaterThanNorEqualTo(TNeitherGreaterThanNorEqualTo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNeitherLessThanNorEqualTo(TNeitherLessThanNorEqualTo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSetIdentifier(TSetIdentifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElementIdentifier(TElementIdentifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTShortComment(TShortComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLongComment(TLongComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
