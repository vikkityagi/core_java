package com.vikki.hiding;

public class Rectangle implements Rectangleinterface {

    private float side1;
    private float side2;

    public void setSide(float w,float b){
        this.side1=w;
        this.side2=b;
    }

    public float getSide1(){
        return this.side1;
    }

    public float getSide2(){
        return this.side2;
    }

    public float areaRectangle(){
        return (float) (2*this.side1*this.side2);
    }

    public float perimeterRectangle(){
        return (float) (this.side1+this.side2);
    }
}


