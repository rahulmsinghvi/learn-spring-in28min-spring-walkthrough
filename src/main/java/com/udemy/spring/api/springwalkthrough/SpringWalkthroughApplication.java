package com.udemy.spring.api.springwalkthrough;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class SpringWalkthroughApplication {
	public static String hello = "sample";

	public static void main(String[] args) {
		ApplicationContext appCon = SpringApplication.run(SpringWalkthroughApplication.class, args);
		BubbleSearch bubbleSearch = appCon.getBean(BubbleSearch.class);
		bubbleSearch.implementSortInSearch();
	}
}


