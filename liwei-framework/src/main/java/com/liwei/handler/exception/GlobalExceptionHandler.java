package com.liwei.handler.exception;

import com.liwei.domain.ResponseResult;
import com.liwei.enums.AppHttpCodeEnum;
import com.liwei.exception.SystemException;
import kotlin.io.AccessDeniedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/5
*/
//@ControllerAdvice
//@ResponseBody
//或者用下面一个注解代替上面的两个注解
@RestControllerAdvice
//使用Lombok提供的Slf4j注解，实现日志功能
@Slf4j
//全局异常处理。最终都会在这个类进行处理异常
public class GlobalExceptionHandler{

    //SystemException是我们写的类。用户登录的异常交给这里处理
    @ExceptionHandler(SystemException.class)
    public ResponseResult systemExceptionHandler(SystemException e){
        //打印异常信息
        log.error("出现了异常！{}",e);
        //从异常对象中获取提示信息封装返回
        return ResponseResult.errorResult(e.getCode(),e.getMsg());
    }
    //其它异常交给这里处理
    @ExceptionHandler(Exception.class)
    public ResponseResult ExceptionHandler(Exception e){
        //打印异常信息
        log.error("出现了异常！{}",e);
        //从异常对象中获取提示信息封装返回
        return ResponseResult.errorResult(AppHttpCodeEnum.SYSTEM_ERROR.getCode(),e.getMessage());
    }

    // 处理SpringSecurity的权限异常
    @ExceptionHandler(AccessDeniedException.class)
    public ResponseResult handleAccessDeniedException(AccessDeniedException e){
        return ResponseResult.errorResult(AppHttpCodeEnum.NO_OPERATOR_AUTH.getCode(),e.getMessage());//枚举值是403
    }

}