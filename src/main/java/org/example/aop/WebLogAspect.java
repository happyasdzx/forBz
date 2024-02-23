package org.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.example.annotion.WebLog;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author zeqiang.sheng
 * @since 2024/2/23
 */
@Slf4j
@Aspect
@Component
public class WebLogAspect {
	@Pointcut("@annotation(org.example.annotion.WebLog)")
	public void pointCut() {
	}

	@Before("pointCut()")
	public void before(JoinPoint joinPoint) {
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		log.error("-------AOP BEFORE START-------");
		log.error("方法名称为:{}", methodSignature.getName());
		;
		log.error("-------AOP BEFORE END-------");
	}

	@After("pointCut()")
	public void after(JoinPoint joinPoint) {
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		log.error("-------AOP AFTER START-------");
		log.error("方法名称为:{}", methodSignature.getName());
		log.error("-------AOP AFTER END-------");
	}

	@Around("pointCut()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		log.error("-------AOP AROUND START-------");
		joinPoint.proceed();
		log.error("-------AOP AROUND END-------");
	}

	@AfterReturning(value = "pointCut()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, StringBuilder result) {
		log.error("-------AOP AFTER_RETURNING START-------");
		log.error("-------AOP AFTER_RETURNING END-------");
		
	}

	@AfterThrowing(value = "pointCut()", throwing = "e")
	public Object afterThrow(JoinPoint joinPoint, Exception e) {
		log.error("-------AOP AFTER_THROW START-------");
		log.error("出现异常 异常信息", e);
		log.error("-------AOP AFTER_THROW END-------");
		return "test";
	}
}
