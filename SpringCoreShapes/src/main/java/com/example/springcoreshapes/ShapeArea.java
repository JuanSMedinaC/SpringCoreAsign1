package com.example.springcoreshapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeArea {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Circle circulo = (Circle) context.getBean("Circulo");
        Rectangle rectangulo = (Rectangle) context.getBean("Rectangulo");
        Triangle triangulo = (Triangle) context.getBean("Triangulo");

        System.out.println(circulo.findArea());
        System.out.println(rectangulo.findArea());
        System.out.println(triangulo.findArea());
    }
}
