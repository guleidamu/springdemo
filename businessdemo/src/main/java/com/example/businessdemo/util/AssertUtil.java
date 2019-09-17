package com.example.businessdemo.util;

import com.example.businessdemo.response.exception.BusinessException;
import com.example.businessdemo.response.exception.ExceptionCode;
import org.apache.commons.lang.StringUtils;

public class AssertUtil {

    /**
     * 判断字符串是否为空或者空字符串
     * @param str
     */
    public static void isBlank(Object str, ExceptionCode exceptionCode, Object... args){
        if(str == null || StringUtils.isBlank(str.toString())){
            throw new BusinessException(exceptionCode, args);
        }
    }
    public static void isBlank(Object str, String message){
        if(str == null || StringUtils.isBlank(str.toString())){
            throw new BusinessException(message);
        }
    }
    /**
     * 判断对象是为空
     * @param obj
     * @param exceptionCode
     */
    public static void isNull(Object obj, ExceptionCode exceptionCode, Object... args){
        if(obj == null){
            throw new BusinessException(exceptionCode, args);
        }
    }

    public static <T> T isNull(T t, String message){
        if(t == null){
            throw new BusinessException(message);
        }
        return t;
    }

    /**
     * 判断对象是不为空
     * @param obj
     * @param exceptionCode
     */
    public static void isNotNull(Object obj, ExceptionCode exceptionCode, Object... args){
        if(obj != null){
            throw new BusinessException(exceptionCode, args);
        }
    }
    public static void isNotNull(Object obj, String message){
        if(obj != null){
            throw new BusinessException(message);
        }
    }

    public static void isTrue(boolean b, String message){
        if(b){
            throw new BusinessException(message);
        }
    }

    public static void isTrue(boolean b, ExceptionCode exceptionCode, Object... args){
        if(b){
            throw new BusinessException(exceptionCode, args);
        }
    }

    public static void isFalse(boolean b, String message){
        if(!b){
            throw new BusinessException(message);
        }
    }

    public static void isFalse(boolean b, ExceptionCode exceptionCode, Object... args){
        if(!b){
            throw new BusinessException(exceptionCode, args);
        }
    }
}
