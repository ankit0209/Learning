package com.project.multithreading;

public class ThreadQuestion {

    int N;
    int count;
    public ThreadQuestion(int N){
        this.N=N;
    }
    public synchronized void printEven() throws InterruptedException {
        while(count<N){
            if(count%2==1){
                wait();
            }
            System.out.println(Thread.currentThread().getName()+" Thread "+count);
            count++;
            notify();
        }
    }
    public synchronized void printOdd() throws InterruptedException {
        while(count<N){
            if(count%2==0){
                wait();
            }
            System.out.println(Thread.currentThread().getName()+" Thread "+count);
            count++;
            notify();
        }
    }
    public static void main(String[] args) {
        ThreadQuestion question = new ThreadQuestion(10);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    question.printEven();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    question.printOdd();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();
    }
}
