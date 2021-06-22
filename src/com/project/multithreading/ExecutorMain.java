package com.project.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorMain {

	public static void main(String[] args) {
		
		ExecutorService excutor = Executors.newFixedThreadPool(2);
		
		for(int i=0;i<4;i++) {
			
			excutor.submit(()->System.out.println("this is lambda"));
		}
	}
}
