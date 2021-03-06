package com.muy.exception;

/**
 * Created by yanglikai on 2017/7/26.
 */
public class UserServiceException extends Exception {
    private Integer code;
    private String msg;

    public UserServiceException() {
        super();
    }

    public UserServiceException(Integer code, String msg) {
        super(code + ":" + msg);
    }

    public UserServiceException(Throwable throwable) {
        super(throwable);
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
