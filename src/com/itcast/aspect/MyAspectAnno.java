package com.itcast.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //告诉spring这是一个切面类
public class MyAspectAnno {

	@Before(value="execution(* com.itcast.dao.UserDaoImple.save(..))")
	//前置通知用@Before(value="切入点表达式，表示这个通知要对哪个切入点进行增强")
	//前置通知，执行前检查权限
	public void checkPri(JoinPoint joinPoint) {
		System.out.println("MyAspectAnno中的checkPri方法执行了===="+joinPoint);
	}
}
