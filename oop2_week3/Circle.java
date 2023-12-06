package oop2_week3;

public class Circle {

    public static final double pi = 3.14;
    private int rad;

    public Circle() {
    }

    public Circle(int rad) {
        setRad(rad);
    }

    public double getRound() {
        return pi * rad;
    }

    public double getArea() {
        return (Math.pow(rad, 2)) * pi;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

}
