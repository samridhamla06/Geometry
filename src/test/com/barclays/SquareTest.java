package com.barclays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquareTest {
    Rectangle square;
    @Test
    public void shouldCalculateArea() {
        square = Rectangle.createSquare(12);
        Rectangle.
        assertEquals(144, square.area());
    }

    @Test
    public void shouldCalculatePerimeter() {
        square = Rectangle.createSquare(12);
        assertEquals(48, square.perimeter());
    }

}
