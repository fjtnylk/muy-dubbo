package com.muy.exception;

/**
 * Created by yanglikai on 2017/7/26.
 */
public class UserServiceException extends Exception {
    private String code;
    private String msg;

    public UserServiceException() {
        super();
    }

    public UserServiceException(String code, String msg) {
        super(code + ":" + msg);
    }

    public UserServiceException(Throwable throwable) {
        super(throwable);
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
