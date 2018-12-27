package com.baizhi.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.baizhi.service.*.*(..))")
    public void pc() {

    }

    /*@Before("pc()")
    public void testBefore() {
        System.out.println("before advice");
    }*/

    @Around("pc()")
    public Object testAround(ProceedingJoinPoint proceedingJoinPoint) {
        Object o = null;
        try {
            System.out.println("before");
            o = proceedingJoinPoint.proceed();
            System.out.println("after");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return o;
    }
}
