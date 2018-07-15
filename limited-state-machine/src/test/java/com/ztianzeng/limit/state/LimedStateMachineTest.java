package com.ztianzeng.limit.state;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class LimedStateMachineTest {
    /**
     * 状态机测试
     */
    @Test
    public void lexTest() throws UnsupportedEncodingException {
        LimedStateMachine limedStateMachine = new LimedStateMachine();
        assert limedStateMachine.lex("1234") == 1;
        assert limedStateMachine.lex("3.14") == 2;
        assert limedStateMachine.lex("3.12e3") == 4;
        assert limedStateMachine.lex("3e4") == 4;
        assert limedStateMachine.lex("3.12e3e") == -1;
        assert limedStateMachine.lex("3..12e3") == -1;
        assert limedStateMachine.lex("3.12e.3") == -1;

    }



}
