package com.muy.exception;

/**
 * Created by yanglikai on 2017/7/28.
 */
public class CategoryServiceException extends GoodsServiceException {
    public CategoryServiceException() {
        super();
    }

    public CategoryServiceException(Integer code, String msg) {
        super(code, msg);
    }
}
