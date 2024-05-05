package com.example.labtestb1;

import junit.framework.TestCase;

import org.junit.Test;

public class ShapeTest extends TestCase {
    @Test
    public void testCircle() {
        Circle c = new Circle(5);
        assertEquals(78.5, c.area(),0.01);
        assertEquals(31.4, c.perimeter(),0.01);
    }

    @Test
    public void testSquare(){
        Square s = new Square(5);
        assertEquals(25, s.area(),0.01);
        assertEquals(20, s.perimeter(),0.01);
    }

    @Test
    public void testTriangle(){
        Triangle t = new Triangle(3, 4, 5);
        assertEquals(6, t.area(),0.01);
    }
}
