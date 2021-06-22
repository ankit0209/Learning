package com.project.java8;

public class excm {
	
	private static int Number;
	private int count;
	
	
	public void printEven() throws InterruptedException {
		synchronized (this) {
			 while(count<Number) {
				
				 if(count%2==1) {
					 wait();
				 }
				 
				 System.out.println(Thread.currentThread().getName()+ count);
				 count++;
				 notify();
			 }
				 
				 
			 
			
		}
	}
	public void printOdd() throws InterruptedException {
		synchronized (this) {
			 while(count<Number) {
				 if(count%2==0) {
					 wait();
				 }
				 
				 System.out.println(Thread.currentThread().getName()+ count);
				 count++;
				 notify();
			 }
				 
				
			 
			
		}
		
	}
public static void main(String[] args) {
	Number =10;
	excm e1 = new excm();
	Thread t1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				e1.printEven();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	});
	Thread t2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				e1.printOdd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	});
	t1.setName("T1 ");
	t2.setName("T2 ");
	t1.start();
	t2.start();
}

}
