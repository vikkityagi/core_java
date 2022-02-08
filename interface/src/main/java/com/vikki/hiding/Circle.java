package com.vikki.hiding;

public class Circle implements Circleinterface {

    private float radius;

    public void setSide(float radius){
        this.radius=radius;
    }

    public float getSide(){
        return this.radius;
    }

    public float areaCircle(){
        return (float) (3.14*this.radius*this.radius);
    }

    public float perimeterCircle(){
        return  (float) (2*3.14*this.radius);
    }
}
