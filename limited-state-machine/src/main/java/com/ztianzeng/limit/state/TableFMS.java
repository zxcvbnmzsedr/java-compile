package com.ztianzeng.limit.state;

public class TableFMS implements FMS {
    private final int ASCII_COUNT = 128;
    private final int STATE_COUNT = 6;
    private final int[][] fmsTable = new int[STATE_COUNT][ASCII_COUNT];
    private final boolean[] accept = new boolean[]{false, true, true, false, true, false};

    public TableFMS() {
        // 初始化
        for (int i = 0; i < fmsTable.length; i++) {
            for (int j = 0; j < fmsTable[i].length; j++) {
                fmsTable[i][j] = FMS.STATE_FAILURE;
            }
        }
        initNumber(0, 1);
        initNumber(1, 1);
        initNumber(2, 2);
        initNumber(3, 2);
        initNumber(4, 4);
        initNumber(5, 4);

        fmsTable[0]['.'] = 3;
        fmsTable[1]['.'] = 2;
        fmsTable[2]['e'] = 5;
        fmsTable[1]['e'] = 5;
    }

    private void initNumber(int row, int val) {
        for (int i = 0; i < 10; i++) {
            fmsTable[row]['0' + i] = val;
        }
    }

    @Override
    public int yyNext(int state, byte c) {
        if (state == FMS.STATE_FAILURE) {
            return FMS.STATE_FAILURE;
        }
        return fmsTable[state][c];
    }

    @Override
    public boolean isAcceptState(int state) {
        if (state == FMS.STATE_FAILURE) {
            return false;
        } else {
            return accept[state];
        }
    }

}
