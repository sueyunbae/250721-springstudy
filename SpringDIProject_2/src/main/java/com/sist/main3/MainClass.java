package com.sist.main3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("app2.xml");
		Member m=(Member)app.getBean("mem");
		System.out.println("번호:"+m.getNo());
		System.out.println("이름:"+m.getHuman().getName());
		System.out.println("성별:"+m.getHuman().getSex());
		System.out.println("주소:"+m.getHuman().getAddress());
		System.out.println("전화:"+m.getHuman().getPhone());		
	}
}
