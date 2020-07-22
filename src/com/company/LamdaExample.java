package com.company;

public class LamdaExample {
    public static void main(String[] args) {
        Square square = new Square(4);
//        Shape shape = new Shape() {
//            @Override
//            public int getArea(Square square) {
//                return square.calculateArea();
//            }
//        };
//        the commented lines of code are converted into what we call method references
        Shape shape = Square::calculateArea;
        System.out.println("The Area is : "+shape.getArea(square));
    }
}
