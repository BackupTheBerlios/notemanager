/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.umlv.symphonie.formula.sablecc.analysis;

import java.util.*;
import fr.umlv.symphonie.formula.sablecc.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(Node node)
    {
    }

    public void defaultOut(Node node)
    {
    }

    public void caseStart(Start node)
    {
        inStart(node);
        node.getPFormule().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAExprFormule(AExprFormule node)
    {
        defaultIn(node);
    }

    public void outAExprFormule(AExprFormule node)
    {
        defaultOut(node);
    }

    public void caseAExprFormule(AExprFormule node)
    {
        inAExprFormule(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAExprFormule(node);
    }

    public void inALowPriorityExpr(ALowPriorityExpr node)
    {
        defaultIn(node);
    }

    public void outALowPriorityExpr(ALowPriorityExpr node)
    {
        defaultOut(node);
    }

    public void caseALowPriorityExpr(ALowPriorityExpr node)
    {
        inALowPriorityExpr(node);
        if(node.getExprLowPriority() != null)
        {
            node.getExprLowPriority().apply(this);
        }
        outALowPriorityExpr(node);
    }

    public void inAAndExpr(AAndExpr node)
    {
        defaultIn(node);
    }

    public void outAAndExpr(AAndExpr node)
    {
        defaultOut(node);
    }

    public void caseAAndExpr(AAndExpr node)
    {
        inAAndExpr(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getAnd() != null)
        {
            node.getAnd().apply(this);
        }
        if(node.getExprLowPriority() != null)
        {
            node.getExprLowPriority().apply(this);
        }
        outAAndExpr(node);
    }

    public void inAOrExpr(AOrExpr node)
    {
        defaultIn(node);
    }

    public void outAOrExpr(AOrExpr node)
    {
        defaultOut(node);
    }

    public void caseAOrExpr(AOrExpr node)
    {
        inAOrExpr(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getOr() != null)
        {
            node.getOr().apply(this);
        }
        if(node.getExprLowPriority() != null)
        {
            node.getExprLowPriority().apply(this);
        }
        outAOrExpr(node);
    }

    public void inANormalPriorityExprLowPriority(ANormalPriorityExprLowPriority node)
    {
        defaultIn(node);
    }

    public void outANormalPriorityExprLowPriority(ANormalPriorityExprLowPriority node)
    {
        defaultOut(node);
    }

    public void caseANormalPriorityExprLowPriority(ANormalPriorityExprLowPriority node)
    {
        inANormalPriorityExprLowPriority(node);
        if(node.getExprNormalPriority() != null)
        {
            node.getExprNormalPriority().apply(this);
        }
        outANormalPriorityExprLowPriority(node);
    }

    public void inALowerThanExprLowPriority(ALowerThanExprLowPriority node)
    {
        defaultIn(node);
    }

    public void outALowerThanExprLowPriority(ALowerThanExprLowPriority node)
    {
        defaultOut(node);
    }

    public void caseALowerThanExprLowPriority(ALowerThanExprLowPriority node)
    {
        inALowerThanExprLowPriority(node);
        if(node.getExprLowPriority() != null)
        {
            node.getExprLowPriority().apply(this);
        }
        if(node.getLt() != null)
        {
            node.getLt().apply(this);
        }
        if(node.getExprNormalPriority() != null)
        {
            node.getExprNormalPriority().apply(this);
        }
        outALowerThanExprLowPriority(node);
    }

    public void inALowerEqualExprLowPriority(ALowerEqualExprLowPriority node)
    {
        defaultIn(node);
    }

    public void outALowerEqualExprLowPriority(ALowerEqualExprLowPriority node)
    {
        defaultOut(node);
    }

    public void caseALowerEqualExprLowPriority(ALowerEqualExprLowPriority node)
    {
        inALowerEqualExprLowPriority(node);
        if(node.getExprLowPriority() != null)
        {
            node.getExprLowPriority().apply(this);
        }
        if(node.getLteq() != null)
        {
            node.getLteq().apply(this);
        }
        if(node.getExprNormalPriority() != null)
        {
            node.getExprNormalPriority().apply(this);
        }
        outALowerEqualExprLowPriority(node);
    }

    public void inAGreaterThanExprLowPriority(AGreaterThanExprLowPriority node)
    {
        defaultIn(node);
    }

    public void outAGreaterThanExprLowPriority(AGreaterThanExprLowPriority node)
    {
        defaultOut(node);
    }

    public void caseAGreaterThanExprLowPriority(AGreaterThanExprLowPriority node)
    {
        inAGreaterThanExprLowPriority(node);
        if(node.getExprLowPriority() != null)
        {
            node.getExprLowPriority().apply(this);
        }
        if(node.getGt() != null)
        {
            node.getGt().apply(this);
        }
        if(node.getExprNormalPriority() != null)
        {
            node.getExprNormalPriority().apply(this);
        }
        outAGreaterThanExprLowPriority(node);
    }

    public void inAGreaterEqExprLowPriority(AGreaterEqExprLowPriority node)
    {
        defaultIn(node);
    }

    public void outAGreaterEqExprLowPriority(AGreaterEqExprLowPriority node)
    {
        defaultOut(node);
    }

    public void caseAGreaterEqExprLowPriority(AGreaterEqExprLowPriority node)
    {
        inAGreaterEqExprLowPriority(node);
        if(node.getExprLowPriority() != null)
        {
            node.getExprLowPriority().apply(this);
        }
        if(node.getGteq() != null)
        {
            node.getGteq().apply(this);
        }
        if(node.getExprNormalPriority() != null)
        {
            node.getExprNormalPriority().apply(this);
        }
        outAGreaterEqExprLowPriority(node);
    }

    public void inAEqualExprLowPriority(AEqualExprLowPriority node)
    {
        defaultIn(node);
    }

    public void outAEqualExprLowPriority(AEqualExprLowPriority node)
    {
        defaultOut(node);
    }

    public void caseAEqualExprLowPriority(AEqualExprLowPriority node)
    {
        inAEqualExprLowPriority(node);
        if(node.getExprLowPriority() != null)
        {
            node.getExprLowPriority().apply(this);
        }
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        if(node.getExprNormalPriority() != null)
        {
            node.getExprNormalPriority().apply(this);
        }
        outAEqualExprLowPriority(node);
    }

    public void inANotEqualExprLowPriority(ANotEqualExprLowPriority node)
    {
        defaultIn(node);
    }

    public void outANotEqualExprLowPriority(ANotEqualExprLowPriority node)
    {
        defaultOut(node);
    }

    public void caseANotEqualExprLowPriority(ANotEqualExprLowPriority node)
    {
        inANotEqualExprLowPriority(node);
        if(node.getExprLowPriority() != null)
        {
            node.getExprLowPriority().apply(this);
        }
        if(node.getNeq() != null)
        {
            node.getNeq().apply(this);
        }
        if(node.getExprNormalPriority() != null)
        {
            node.getExprNormalPriority().apply(this);
        }
        outANotEqualExprLowPriority(node);
    }

    public void inAHighPriorityExprNormalPriority(AHighPriorityExprNormalPriority node)
    {
        defaultIn(node);
    }

    public void outAHighPriorityExprNormalPriority(AHighPriorityExprNormalPriority node)
    {
        defaultOut(node);
    }

    public void caseAHighPriorityExprNormalPriority(AHighPriorityExprNormalPriority node)
    {
        inAHighPriorityExprNormalPriority(node);
        if(node.getExprHighPriority() != null)
        {
            node.getExprHighPriority().apply(this);
        }
        outAHighPriorityExprNormalPriority(node);
    }

    public void inAPlusExprNormalPriority(APlusExprNormalPriority node)
    {
        defaultIn(node);
    }

    public void outAPlusExprNormalPriority(APlusExprNormalPriority node)
    {
        defaultOut(node);
    }

    public void caseAPlusExprNormalPriority(APlusExprNormalPriority node)
    {
        inAPlusExprNormalPriority(node);
        if(node.getExprNormalPriority() != null)
        {
            node.getExprNormalPriority().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getExprHighPriority() != null)
        {
            node.getExprHighPriority().apply(this);
        }
        outAPlusExprNormalPriority(node);
    }

    public void inAMinusExprNormalPriority(AMinusExprNormalPriority node)
    {
        defaultIn(node);
    }

    public void outAMinusExprNormalPriority(AMinusExprNormalPriority node)
    {
        defaultOut(node);
    }

    public void caseAMinusExprNormalPriority(AMinusExprNormalPriority node)
    {
        inAMinusExprNormalPriority(node);
        if(node.getExprNormalPriority() != null)
        {
            node.getExprNormalPriority().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getExprHighPriority() != null)
        {
            node.getExprHighPriority().apply(this);
        }
        outAMinusExprNormalPriority(node);
    }

    public void inAExpratomExprHighPriority(AExpratomExprHighPriority node)
    {
        defaultIn(node);
    }

    public void outAExpratomExprHighPriority(AExpratomExprHighPriority node)
    {
        defaultOut(node);
    }

    public void caseAExpratomExprHighPriority(AExpratomExprHighPriority node)
    {
        inAExpratomExprHighPriority(node);
        if(node.getExpratom() != null)
        {
            node.getExpratom().apply(this);
        }
        outAExpratomExprHighPriority(node);
    }

    public void inAMultExprHighPriority(AMultExprHighPriority node)
    {
        defaultIn(node);
    }

    public void outAMultExprHighPriority(AMultExprHighPriority node)
    {
        defaultOut(node);
    }

    public void caseAMultExprHighPriority(AMultExprHighPriority node)
    {
        inAMultExprHighPriority(node);
        if(node.getExprHighPriority() != null)
        {
            node.getExprHighPriority().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getExpratom() != null)
        {
            node.getExpratom().apply(this);
        }
        outAMultExprHighPriority(node);
    }

    public void inADivExprHighPriority(ADivExprHighPriority node)
    {
        defaultIn(node);
    }

    public void outADivExprHighPriority(ADivExprHighPriority node)
    {
        defaultOut(node);
    }

    public void caseADivExprHighPriority(ADivExprHighPriority node)
    {
        inADivExprHighPriority(node);
        if(node.getExprHighPriority() != null)
        {
            node.getExprHighPriority().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getExpratom() != null)
        {
            node.getExpratom().apply(this);
        }
        outADivExprHighPriority(node);
    }

    public void inAPluginsFunctionExpratom(APluginsFunctionExpratom node)
    {
        defaultIn(node);
    }

    public void outAPluginsFunctionExpratom(APluginsFunctionExpratom node)
    {
        defaultOut(node);
    }

    public void caseAPluginsFunctionExpratom(APluginsFunctionExpratom node)
    {
        inAPluginsFunctionExpratom(node);
        if(node.getFunctionKeyName() != null)
        {
            node.getFunctionKeyName().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getBloc() != null)
        {
            node.getBloc().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAPluginsFunctionExpratom(node);
    }

    public void inAIconstExpratom(AIconstExpratom node)
    {
        defaultIn(node);
    }

    public void outAIconstExpratom(AIconstExpratom node)
    {
        defaultOut(node);
    }

    public void caseAIconstExpratom(AIconstExpratom node)
    {
        inAIconstExpratom(node);
        if(node.getIconst() != null)
        {
            node.getIconst().apply(this);
        }
        outAIconstExpratom(node);
    }

    public void inADconstExpratom(ADconstExpratom node)
    {
        defaultIn(node);
    }

    public void outADconstExpratom(ADconstExpratom node)
    {
        defaultOut(node);
    }

    public void caseADconstExpratom(ADconstExpratom node)
    {
        inADconstExpratom(node);
        if(node.getDconst() != null)
        {
            node.getDconst().apply(this);
        }
        outADconstExpratom(node);
    }

    public void inAColumnExpratom(AColumnExpratom node)
    {
        defaultIn(node);
    }

    public void outAColumnExpratom(AColumnExpratom node)
    {
        defaultOut(node);
    }

    public void caseAColumnExpratom(AColumnExpratom node)
    {
        inAColumnExpratom(node);
        if(node.getDollar() != null)
        {
            node.getDollar().apply(this);
        }
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getRBrace() != null)
        {
            node.getRBrace().apply(this);
        }
        outAColumnExpratom(node);
    }

    public void inAPluginsKeyWordsBloc(APluginsKeyWordsBloc node)
    {
        defaultIn(node);
    }

    public void outAPluginsKeyWordsBloc(APluginsKeyWordsBloc node)
    {
        defaultOut(node);
    }

    public void caseAPluginsKeyWordsBloc(APluginsKeyWordsBloc node)
    {
        inAPluginsKeyWordsBloc(node);
        if(node.getDollar() != null)
        {
            node.getDollar().apply(this);
        }
        if(node.getFunctionKeyName() != null)
        {
            node.getFunctionKeyName().apply(this);
        }
        outAPluginsKeyWordsBloc(node);
    }

    public void inACellAccessBloc(ACellAccessBloc node)
    {
        defaultIn(node);
    }

    public void outACellAccessBloc(ACellAccessBloc node)
    {
        defaultOut(node);
    }

    public void caseACellAccessBloc(ACellAccessBloc node)
    {
        inACellAccessBloc(node);
        if(node.getDollar() != null)
        {
            node.getDollar().apply(this);
        }
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        if(node.getCourses() != null)
        {
            node.getCourses().apply(this);
        }
        if(node.getRBrace() != null)
        {
            node.getRBrace().apply(this);
        }
        outACellAccessBloc(node);
    }

    public void inASingleCourses(ASingleCourses node)
    {
        defaultIn(node);
    }

    public void outASingleCourses(ASingleCourses node)
    {
        defaultOut(node);
    }

    public void caseASingleCourses(ASingleCourses node)
    {
        inASingleCourses(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outASingleCourses(node);
    }

    public void inAMultipleCourses(AMultipleCourses node)
    {
        defaultIn(node);
    }

    public void outAMultipleCourses(AMultipleCourses node)
    {
        defaultOut(node);
    }

    public void caseAMultipleCourses(AMultipleCourses node)
    {
        inAMultipleCourses(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getCourses() != null)
        {
            node.getCourses().apply(this);
        }
        outAMultipleCourses(node);
    }
}
