package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.context.AbstractContextLoaderInitializer;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {

//		fj0ef0er9gk90erg();
		SpringApplication.run(HelloApplication.class, args);
	}


	public static void fj0ef0er9gk90erg(){

		Object obj = new Object();
		Integer ii = new Integer(111);

		System.out.println("Object: " + obj.getClass().isAssignableFrom(Object.class));
		System.out.println("Integer: " + ii.getClass().isAssignableFrom(Object.class));

		System.out.println("Object: " + obj.getClass().isAssignableFrom(Integer.class));
		System.out.println("Object: " + obj.getClass().isAssignableFrom(Float.class));


		AbstractContextLoaderInitializer wefwefwef;

	}
}
