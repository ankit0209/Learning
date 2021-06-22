package com.project.learn;

public interface Testing {

    default boolean equals1() {
        return false;
    }


    public static void main(String[] args) {

        System.out.println();
    }
}
interface Testing2 {
    default boolean equals1() {
        return false;
    }
}
class Testing1 implements Testing ,Testing2{


    @Override
    public boolean equals1() {
        return false;
    }

    public static void main(String[] args) {
        Testing t1 = new Testing1();
        t1.equals1();
    }
}
