package com.remoer.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Aspect
@Log4j
@Component
public class LogAdvice {

	@Around("execution(* com.remoer.*.*service*.*(..))")
	public Object logTime(ProceedingJoinPoint pjp) {

		log.info(" * 실행 객체 : " + pjp.getTarget());
		log.info(" * 실행 메서드 : " + pjp.getSignature());
		log.info(" * 전달 데이터 : " + Arrays.toString(pjp.getArgs()));

		Object result = null;

		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		log.info(" * 처리 결과 데이터 : " + result);

		return result;
	}

}
