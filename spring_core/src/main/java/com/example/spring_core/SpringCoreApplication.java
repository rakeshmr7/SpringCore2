package com.example.spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring_core.config.MyConfig;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		// ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");		
		
		
		// Department d1 = (Department) context.getBean("dept1");
		// System.out.println(d1);
		// Department d2 = (Department) context.getBean("dept2");
		// System.out.println(d2);
		// Employee e1 = d1.getEmp();
		// System.out.println(e1);
		// Employee e2 = d2.getEmp();
		// System.out.println(e2);

		// Mobile m1 = (Mobile) context.getBean("mob1");
		// System.out.println(m1);
		// Mobile m2 = (Mobile) context.getBean("mob2");
		// System.out.println(m2);

		// ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		// College c1 = (College) context.getBean("c1");
		// System.out.println(c1);

		// System.out.println("Student Name: " + c1.getStudent().getName());
		// System.out.println("Marks: " + c1.getStudent().getMarks());

		// ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Department d3 = (Department) context.getBean("dept3");
		// System.out.println(d3);

		// College c2 = (College) context.getBean("clg1");
		// System.out.println(c2);

		// ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// Car car1 = (Car) context.getBean("car1");
		// System.out.println(car1);
		// Engine engine1 = car1.getEngine();
		// engine1.start();

		// ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// Employee emp1 = (Employee) context.getBean("emp5");
		// System.out.println(emp1);

		// ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// Student student1 = (Student) context.getBean("std2");
		// System.out.println(student1);

		// ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// Items i1 = (Items) context.getBean("item1");
		// System.out.println(i1);

		// Items i2 = (Items) context.getBean("item1");
		// System.out.println(i2);

		// System.out.println(i1 == i2);

		// ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// Department d4 = (Department) context.getBean("dept4");
		// System.out.println(d4);

		//Bean lifecycle demonstration

		//Via XML
		// ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// Employee emp6 = (Employee) context.getBean("emp6");
		// System.out.println(emp6);
		// context.registerShutdownHook(); //calls the destroy method when the application is closed.
		
		//Via Annotations
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee emp7 = (Employee) context.getBean("emp7");
		System.out.println(emp7);
		context.registerShutdownHook(); //calls the destroy method when the application is closed.
	}

}
