package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* org.example.ShoppingCart.checkOut(..))") //like overriding every this should match
    public void beforeLogger(JoinPoint jp){
//        System.out.println(jp.getSignature());
        System.out.println("Before Logger with Argument"+ jp.getArgs()[0].toString());
        System.out.println("Before Loggers");
    }

    @After("execution(* org.example.ShoppingCart.checkOut(..))")
    public void afterLogger(){
        System.out.println("After Logger");
    }
    @Pointcut("execution(* org.example.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){

    }
    @AfterReturning(pointcut = "afterReturningPointCut()",
    returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning : " + retVal);
    }

}
