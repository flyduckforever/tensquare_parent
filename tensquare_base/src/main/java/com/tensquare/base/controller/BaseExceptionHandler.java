package com.tensquare.base.controller;/**
 * @author tianshengfei
 * @Date 2019/10/29 21:30
 * @description
 */

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: tensquare_parent52
 * @description: 统一异常处理类
 * @author: tianshengfei
 * @create: 2019-10-29 21:30
 **/
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return new Result(false, StatusCode.ERROR,e.getMessage());
    }

}
