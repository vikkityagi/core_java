package com.multithreading;

class MyThread1 extends Thread{
    Table t=new Table();
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.Reservation(5);
    }

}