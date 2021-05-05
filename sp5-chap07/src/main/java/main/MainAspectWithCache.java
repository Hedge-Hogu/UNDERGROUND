package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap07.Calculator;
import config.AppCtxWithCache;

public class MainAspectWithCache {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtxWithCache.class);
		
		Calculator cal = ctx.getBean("calculator", Calculator.class);
		cal.factorial(7);
		System.out.println(cal.getClass().getName());
		cal.factorial(7);
//		System.out.println(cal.getClass().getName());
//		cal.factorial(5);
//		System.out.println(cal.getClass().getName());
//		cal.factorial(5);
//		System.out.println(cal.getClass().getName());
//		ctx.close();
	}

}