package com.example.springcoreshapes;

import org.springframework.stereotype.Component;


@Component
public class Circle extends Shape {
    private double radius;

    public Circle(){
        radius=0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {

        return Math.PI*radius*radius;
    }
}
