package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args){
        Car car1 = new Car(100,10,"11.12.2021");
        System.out.println(car1.isDrivable());
        System.out.println(car1.distanceCanBeDriven());
        System.out.println(car1.canBeDriven());
        }
    }

