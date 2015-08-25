package com.barclays;

public class Rectangle  {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public static Rectangle createSquare(int length){
        return new Rectangle(length,length);
    }

    public int area() {
        return (this.length)*(this.breadth);
    }

    public int perimeter() {
        return 2*((this.length) + (this.breadth));
    }
}
