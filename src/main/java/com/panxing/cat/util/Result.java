package com.panxing.cat.util;

import java.util.HashMap;

/**
 * Created by panxing on 17/5/2
 */
public class Result extends HashMap<String, Object> {

    public static final Result BLANK_SUCCESS = new Result(ErrorCode.SUCCESS, null, true, null);

    public Result(ErrorCode errorCode, Object data, boolean success, String msg) {
        this.errorCode = errorCode;
        this.data = data;
        this.success = success;
        this.msg = msg;
    }

    public final ErrorCode errorCode;
    public final Object data;
    public final boolean success;
    public final String msg;


}
