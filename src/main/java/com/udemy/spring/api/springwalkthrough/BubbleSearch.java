package com.udemy.spring.api.springwalkthrough;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BubbleSearch {
	
	@Autowired
	public SortAlgorithm sortAlgorithm;
	
/*	public BubbleSearch(SortAlgorithm sortAlgorithm)
	{
		this.sortAlgorithm = sortAlgorithm;
	}*/
	
	public void implementSortInSearch()
	{
		sortAlgorithm.sortMethod();
	}

}
