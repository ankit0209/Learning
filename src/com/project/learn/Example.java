package com.project.learn;

public interface Example {

	void run();
	void walk();
	
}

class Example1
{
	public static void main(String[] args) {
		
		Example ex = new Example() {
			
			@Override
			public void walk() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		ex.run();
		
	}
}
