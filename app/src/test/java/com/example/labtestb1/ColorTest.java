package com.example.labtestb1;

import org.junit.Test;
import junit.framework.TestCase;

public class ColorTest extends TestCase{

    @Test
    public void testRed() {
        Red r = new Red();
        assertEquals("The color is Red\n", r.showColor());
    }

    @Test
    public void testGreen() {
        Green g = new Green();
        assertEquals("The color is Green\n", g.showColor());
    }

    @Test
    public void testBlue() {
        Blue b = new Blue();
        assertEquals("The color is Blue\n", b.showColor());
    }
}
