package com.panxing.cat.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by panxing on 17/5/2
 */
public enum ErrorCode {

    SUCCESS(-1),

    TIMEOUT(1),

    OTHER(100);

    public final int code;

    ErrorCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return String.valueOf(code);
    }

    public static Map<Integer, ErrorCode> codeMap = new HashMap<>();

    public static ErrorCode valueOf(int code) {
        switch (code) {
            case (-1):
                return SUCCESS;
            case (1):
                return TIMEOUT;
            default:
                return OTHER;
        }
    }

}
