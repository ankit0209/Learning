package com.project.multithreading;

public class Mythread implements Runnable {

	private Object obj = new Object();

	volatile int threadnumber = 1;
	volatile int count=1;

	int threadId;

	public Mythread(int id) {
		super();
		this.threadId = id;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (count < 20) {
				synchronized (this.obj) {
					if (threadnumber != threadId) {
						this.obj.wait();;
					}
					else {
						System.out.println("Thread " + threadId + " is print " + count);
						count++;

						if (threadId == 1) 
							threadnumber = 2;
						
						else if (threadId == 2) 

							threadnumber = 3;

						
						else if (threadId == 3) 
							threadnumber = 1;

						
						this.obj.notifyAll();
					}
					//

				}
			}

		} catch (Exception e) {

		}

	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Mythread(1));
		Thread t2 = new Thread(new Mythread(2));
		Thread t3 = new Thread(new Mythread(3));

		t1.start();
		t2.start();
		t3.start();
	}
}
