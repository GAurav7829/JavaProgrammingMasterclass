package com.JavaProgrammingMasterclass.classesInheritance;

import com.JavaProgrammingMasterclass.classesInheritance.cars.Car;

public class _01ClassesExample {
    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setModel("Carrera");

        System.out.println("porsche model: " + porsche.getModel());

        Car bmw = new Car();
    }
}
