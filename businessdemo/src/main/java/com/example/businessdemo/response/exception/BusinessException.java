package com.example.businessdemo.response.exception;

import com.example.businessdemo.util.ExcelUtil;

public class BusinessException extends RuntimeException{

    protected String code;

    public BusinessException(String message){
        super(message);
        this.code = ExceptionCode.BUSINESS_EXCEPTION.code();
    }

    public String getCode(){
        return this.code;
    }

    public BusinessException(ExceptionCode exceptionCode, Object... args){
        super(String.format(exceptionCode.msg(), args));
        this.code = exceptionCode.code();
    }

}
