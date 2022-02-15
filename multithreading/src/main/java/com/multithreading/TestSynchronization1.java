package com.multithreading;

class TestSynchronization1{
    public static void main(String args[]){
        Table obj = new Table();
        MyThread1 t1=new MyThread1(obj);
//        t1.setBookticket(7);
        t1.start();

        MyThread1 t2=new MyThread1(obj);
//        t2.setBookticket(5);
        t2.start();
    }
}
