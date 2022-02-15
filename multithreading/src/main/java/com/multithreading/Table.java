package com.multithreading;

class Table{
//    int totalticket=10;
    synchronized void Reservation(int ticket){
        for(int i=1;i<=5;i++){
            System.out.println(ticket*i);
            try{
                Thread.sleep(400);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
