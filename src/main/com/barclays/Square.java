package com.barclays;

public class Square {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int area() {
        return length * length;
    }

    public int perimeter() {
        return 4 * length;
    }
}
