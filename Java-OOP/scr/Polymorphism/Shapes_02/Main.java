package Shapes_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape shape = new Rectangle(4.5, 5.3);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
        shape=new Circle(10d);
        System.out.println(shape.calculatePerimeter());


    }
}