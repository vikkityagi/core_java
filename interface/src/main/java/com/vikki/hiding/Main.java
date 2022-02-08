package com.vikki.hiding;

public class Main {
    public static void main(String args[]){
        Circleinterface circleinterface=new Circle();
        Rectangleinterface rectangleinterface=new Rectangle();

        circleinterface.setSide(2);
        rectangleinterface.setSide(2,4);

        float res1=circleinterface.areaCircle();
        float res2=circleinterface.perimeterCircle();

        float res3=rectangleinterface.areaRectangle();
        float res4=rectangleinterface.perimeterRectangle();

        System.out.println(res1+ "   "+ res2);
        System.out.println(res3+"  "+res4);
    }
}
