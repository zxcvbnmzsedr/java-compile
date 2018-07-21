package com.ztianzeng.thomson;

public class Lexer {
    public enum Token {
        /**
         * 正则表达式末尾
         */
        EOS,
        /**
         * . 通配符
         */
        ANY,
        /**
         * ^ 开头匹配符
         */
        AT_BOL,
        /**
         * $ 末尾匹配符
         */
        AT_EOL,
        /**
         * 字符集类结尾括号 ]
         */
        CCL_END,
        /**
         * 字符集类开始括号 [
         */
        CCL_START,
        /**
         * }
         */
        CLOSE_CURLY,
        /**
         * )
         */
        CLOSE_PAREN,
        /**
         * *
         */
        CLOSURE,
        /**
         * -
         */
        DASH,
        /**
         * 输入流结束
         */
        END_OF_INPUT,
        /**
         * 字符常量
         */
        L,
        /**
         * {
         */
        OPEN_CURLY,
        /**
         * (
         */ // (
        /**
         * ?
         */
        OPTIONAL,
        /**
         * |
         */
        OR,
        /**
         * . 通配符
         */
        PLUS_CLOSE
    }

}
