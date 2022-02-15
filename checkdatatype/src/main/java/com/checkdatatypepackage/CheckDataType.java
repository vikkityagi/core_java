package com.checkdatatypepackage;
import java.util.Scanner;
import java.util.*;
public class CheckDataType {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i;
        char c;

        System.out.println("Enter the integer value");
        i=sc.nextInt();

        System.out.println("Enter the character");
        c=sc.next().charAt(0);

        System.out.println(i+" type of "+((Object)i).getClass().getSimpleName());
        System.out.println(c+" type of "+((Object)c).getClass().getSimpleName());
    }
}
