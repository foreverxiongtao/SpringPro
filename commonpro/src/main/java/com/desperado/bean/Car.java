package com.desperado.bean;

/**
 * Created by win 10 on 2017/10/20.
 */
public class Car {
    public String getBrand() {
        return brand;
    }

    public Car() {
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public Car(String brand, int speed, String color) {
        this.brand = brand;
        this.speed = speed;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String brand;
    private int speed;
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
