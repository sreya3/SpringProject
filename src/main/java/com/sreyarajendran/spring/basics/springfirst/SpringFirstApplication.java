package com.sreyarajendran.spring.basics.springfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFirstApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
		SpringApplication.run(SpringFirstApplication.class, args);
	}
}
