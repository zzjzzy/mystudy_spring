package com.itcast.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	//前置通知，执行前检查权限
	public void checkPri(JoinPoint joinPoint) {
		System.out.println("MyAspect中的checkPri方法执行了===="+joinPoint);
	}
	
	//后置通知，用于在执行完后写日志。
	public void writeLog(Object result) {
		System.out.println("后置通知writeLog方法执行了===="+result);
	}
	
	//环绕通知，要传入ProceedingJoinPoint，代表正在增强的切入点
	public void around(ProceedingJoinPoint pj) throws Throwable {
		System.out.println("环绕通知之前 ");
		//调用proceed方法相当于执行切入点方法。
		pj.proceed();
		System.out.println("环绕通知之后");
	}
}
