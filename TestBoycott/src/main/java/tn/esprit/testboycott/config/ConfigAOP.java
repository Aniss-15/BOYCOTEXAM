package tn.esprit.testboycott.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Aspect
public class ConfigAOP {

    @Before("execution(* tn.esprit.testboycott.InterfacesAndServices.ServiceUser.*(..))")
    public void logMethodEntry(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        log.info("Bienvenuee " + name + " : ");
    }
}
