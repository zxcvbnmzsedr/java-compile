package com.ztianzeng.thomson;


import java.util.ArrayList;

/**
 * 预处理正则表达式
 *
 * @author: 赵天增
 * @date: 2018 -07-21
 */
public class RegularExpressionHandler {

    ArrayList<String> regularExprArr = new ArrayList<>();

    public RegularExpressionHandler(String input) {
        preProcessExpr(input);
    }

    public int getRegularExpressionCount() {
        return regularExprArr.size();
    }

    public String getRegularExpression(int exprCount) {
        return regularExprArr.get(exprCount);
    }

    private void preProcessExpr(String input) {
        regularExprArr.add(input);
    }

}
