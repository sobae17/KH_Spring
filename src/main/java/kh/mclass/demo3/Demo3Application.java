package kh.mclass.demo3;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {
		System.out.println("==== strating");
		Arrays.stream(SpringApplication.run(Demo3Application.class, args).getBeanDefinitionNames()).forEach(System.out::print);
		System.out.println("==== strated");
	}

}
