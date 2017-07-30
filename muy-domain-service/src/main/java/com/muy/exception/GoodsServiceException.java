package com.muy.exception;

/**
 * Created by yanglikai on 2017/7/28.
 */
public class GoodsServiceException extends Exception {
    private Integer code;
    private String msg;

    public GoodsServiceException() {
        super();
    }

    public GoodsServiceException(Integer code, String msg) {
        super(code + ":" + msg);
    }

    public GoodsServiceException(Throwable throwable) {
        super(throwable);
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
