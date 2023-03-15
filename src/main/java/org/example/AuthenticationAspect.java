package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
    @Pointcut("within(org.example..*)")
    public void authenticationPointCut(){


    }
    @Pointcut("within(org.example..*)")
    public void authorizationPointCut(){

    }
    @Before("authenticationPointCut() && authorizationPointCut()")
    public void authentication(){
        System.out.println("Authenticating the Request");
    }
}
