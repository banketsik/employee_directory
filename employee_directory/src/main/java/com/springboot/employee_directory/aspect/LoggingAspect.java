package com.springboot.employee_directory.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* com.springboot.employee_directory.controller.EmployeeController.*(..))")
    public void forControllerPackage() {}

    @Pointcut("execution(* com.springboot.employee_directory.service.*.*(..))")
    public void forServicePackage() {}

    @Pointcut("execution(* com.springboot.employee_directory.dao.*.*(..))")
    public void forDaoPackage() {}

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    public void forAppFlow() {}

    @Before("forAppFlow()")
    public void before(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().toShortString();
        logger.info("@Before: " + methodName);
        Object[] args = joinPoint.getArgs();
        for(Object arg : args) {
            logger.info("Argument: " + arg);
        }
    }

    @AfterReturning(
            pointcut = "forAppFlow()",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().toShortString();
        logger.info("@AfterReturning: " + methodName);
        logger.info("Result: " + result);
    }
}
