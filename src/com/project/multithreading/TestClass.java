package com.project.multithreading;

public class TestClass {

    private volatile Integer count = 1;
    private volatile Integer threadIdToRun = 1;
    private Object object = new Object();

    public static void main(String[] args) {
String S1 = "Hello";
String S2 = S1;
String S3 ="HELLO";
System.out.println(S1.equals(S2));
    }

    class Printer implements Runnable {

        private int threadId;

        public Printer(int threadId) {
            super();
            this.threadId = threadId;
        }

        @Override
        public void run() {
            try {
                while (count <= 20) {
                    synchronized (object) {
                        if (threadId != threadIdToRun) {
                            object.wait();
                        } else {
                            System.out.println("Thread " + threadId + " printed " + count);
                            count += 1;

                            if (threadId == 1)
                                threadIdToRun = 2;
                            else if (threadId == 2)
                                threadIdToRun = 3;
                            else if (threadId == 3)
                                threadIdToRun = 1;

                            object.notifyAll();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}