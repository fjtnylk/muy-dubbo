package com.muy.exception;

/**
 * Created by yanglikai on 2017/7/28.
 */
public class OrderServiceException extends Exception {
    private Integer code;
    private String msg;

    public OrderServiceException() {
        super();
    }

    public OrderServiceException(Integer code, String msg) {
        super(code + ":" + msg);
    }

    public OrderServiceException(Throwable throwable) {
        super(throwable);
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
