package xyz.itwill06.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopAnnotaionApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("06-5_aopAnnotation.xml");
		AopAnnotaionBean bean=context.getBean("aopAnnotaionBean", AopAnnotaionBean.class);
		System.out.println("=============================================================");
		bean.display1();
		System.out.println("=============================================================");
		bean.display2();
		System.out.println("=============================================================");
		bean.display3();
		System.out.println("=============================================================");
		((ClassPathXmlApplicationContext)context).close();			
	}
}
