package com.sreyarajendran.spring.basics.springfirst;

import org.springframework.stereotype.Component;

public class BinarySearchImpl {
	
	private SortAlgorithm quickSortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.quickSortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = quickSortAlgorithm.sort(numbers);
		//Sort an array
		//Search the array
		//Bubble Sort
		//Return result
		return 0;
	}
}
