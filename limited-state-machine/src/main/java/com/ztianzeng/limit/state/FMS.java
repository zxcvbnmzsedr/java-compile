package com.ztianzeng.limit.state;

public interface FMS {
    int STATE_FAILURE = -1;

    /**
     * 下一个状态
     *
     * @param state 当前状态
     * @param c     下个字符
     * @return
     */
    int yyNext(int state, byte c);


    /**
     * 给定状态是否是接受状态
     *
     * @param state
     * @return
     */
    boolean isAcceptState(int state);


}
