package com.dongwt.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by dongwt on 2017/9/13.
 */
@Aspect
@Component
public class ExceptionHandle {

    @Around("((execution (* com.dongwt.service.*.*(..))))")
    public Object interceptor(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try{
            result = proceedingJoinPoint.proceed();
        }catch (Exception e){
            result = null;
        }
        return result;
    }
}
