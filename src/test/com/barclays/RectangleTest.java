package com.barclays;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
    Rectangle rectangle;

    @Test
    public void shouldCalculateArea() {
        rectangle = new Rectangle(12, 10);
        assertEquals(120, rectangle.area());
    }

    @Test
    public void shouldCalculatePerimeter() {
        rectangle = new Rectangle(12, 10);
        assertEquals(44, rectangle.perimeter());
    }


}
