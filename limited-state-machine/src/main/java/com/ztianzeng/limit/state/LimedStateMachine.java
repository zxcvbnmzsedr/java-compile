package com.ztianzeng.limit.state;

import com.ztianzeng.compile.Input;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 有限状态机
 *
 * @author: 赵天增
 * @date: 2018 -07-15
 */
public class LimedStateMachine {
    /**
     * 初始化状态
     */
    private int state = 0;
    /**
     * 上个状态
     */
    private int lastState = FMS.STATE_FAILURE;

    /**
     * lastState的上个状态
     */
    private int lastPrev = FMS.STATE_FAILURE;

    /**
     * 下个状态
     */
    private int nextPrev = FMS.STATE_FAILURE;

    private TableFMS fms = new TableFMS();

    private Input input = new Input();

    public LimedStateMachine() {

    }

    /**
     * 识别主过程
     */
    public int lex(String line) throws UnsupportedEncodingException {
        state = 0;
        byte[] inputBuf = line.getBytes("UTF8");
        for (int i = 0; i < inputBuf.length; i++) {
            state = fms.yyNext(state, inputBuf[i]);
        }
        System.out.println(state);
        return state;

    }
}
