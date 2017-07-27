package com.muy;

/**
 * Created by yanglikai on 2017/4/18.
 */
public class APIResult {
    private static final int SUCCESS_CODE = 10000;
    private static final int BIZ_ERR_CODE = 40004;

    private static final String SUCCESS_MSG = "ok";
    private static final String BIZ_ERR_MSG = "业务处理失败";

    private int code;
    private String message;
    private Object data;

    public APIResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static APIResult success() {
        return new APIResult(SUCCESS_CODE, SUCCESS_MSG, null);
    }

    public static APIResult success(Object data) {
        return new APIResult(SUCCESS_CODE, SUCCESS_MSG, data);
    }

    public static APIResult faild() {
        return new APIResult(BIZ_ERR_CODE, BIZ_ERR_MSG, null);
    }

    public static APIResult faild(String errMsg) {
        return new APIResult(BIZ_ERR_CODE, errMsg, null);
    }

    public static APIResult faild(int errCode, String errMsg) {
        return new APIResult(errCode, errMsg, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
