package cn.tianyu.tins.ast.expr;

import cn.tianyu.tins.ast.ExprNode;
import cn.tianyu.tins.type.Token;

public class ShiftExpr extends ExprNode {
    public ExprNode leftExpr, rightExpr;
    public Token.Type operator;

    public ShiftExpr(ExprNode leftExpr, Token.Type operator, ExprNode rightExpr) {
        this.leftExpr = leftExpr;
        this.operator = operator;
        this.rightExpr = rightExpr;
    }
}
