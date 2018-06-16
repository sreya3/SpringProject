package com.sreyarajendran.spring.basics.springfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFirstApplication {
	
	//What are the beans?
	//What are the dependencies?
	//Where to search for beans?
	
	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
		SpringApplication.run(SpringFirstApplication.class, args);
	}
}
