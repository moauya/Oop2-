package oop2_week3;

public class TestMain {

    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.setRad(4);
        System.out.println("the round is :" + c1.getRound());
        System.out.println("the area is :" + c1.getArea());
        Circle c2 = new Circle(2);
        System.out.println("the round is :" + c1.getRound());
        System.out.println("the area is :" + c1.getArea());
    }

}
