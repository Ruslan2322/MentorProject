package com.company.practice.Interpreter;

import java.util.Stack;

public class NumberRunner {
    public static void main(String[] args) {

        String tokenString = "12 34 - 23 12 + *";
        Stack<Expression> stack = new Stack<>();
        String[] tokenArray = tokenString.split(" ");
        for (String s : tokenArray){
            if (ExpressionUtils.isOperator(s)){
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = ExpressionUtils.getOperator(s,leftExpression,rightExpression);
                int result = operator.interpret();
                stack.push(new Number(result));
            } else  {
                Expression i = new Number(Integer.parseInt(s));
                stack.push(i);
            }
        }
        System.out.println("("+tokenString+"):"+stack.pop().interpret());
    }
}
