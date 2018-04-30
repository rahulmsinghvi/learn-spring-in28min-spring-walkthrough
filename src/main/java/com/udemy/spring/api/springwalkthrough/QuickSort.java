package com.udemy.spring.api.springwalkthrough;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm {

	//@Override
	public void sortMethod() {
		// TODO Auto-generated method stub
		System.out.println("QuickSort");

	}

}
