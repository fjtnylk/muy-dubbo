package com.muy;

import com.muy.exception.CategoryServiceException;
import com.muy.exception.GoodsServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by yanglikai on 2017/7/28.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public APIResult handleValidException(BindException e) {
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        for (FieldError error : fieldErrors) {
            log.error("{}", error.getDefaultMessage());
        }

        return APIResult.faild(40002, "非法的参数");
    }

    @ExceptionHandler(value = {CategoryServiceException.class})
    @ResponseBody
    public APIResult categoryServiceException(GoodsServiceException e) {
        log.error(e.getMessage());

        return APIResult.faild(e.getCode(), e.getMsg());
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseBody
    public APIResult categoryServiceException(Exception e) {
        log.error(e.getMessage());

        return APIResult.faild(e.getMessage());
    }
}
