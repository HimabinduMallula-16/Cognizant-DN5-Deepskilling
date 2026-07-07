
package com.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.service.BookService.showBook(..))")
    public void beforeAdvice(JoinPoint joinPoint) {

        System.out.println("=================================");
        System.out.println("Before Advice");
        System.out.println("Executing Method : "
                + joinPoint.getSignature().getName());
        System.out.println("=================================");

    }

    @After("execution(* com.library.service.BookService.showBook(..))")
    public void afterAdvice(JoinPoint joinPoint) {

        System.out.println("=================================");
        System.out.println("After Advice");
        System.out.println("Completed Method : "
                + joinPoint.getSignature().getName());
        System.out.println("=================================");

    }

}