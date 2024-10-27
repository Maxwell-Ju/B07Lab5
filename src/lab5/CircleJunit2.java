package lab5;

import static org.junit.jupiter.api.Assertions.;

import org.junit.jupiter.api.Test;

class CircleJunit2 {

    @Test
    void testDiameter() {
        Point center = new Point(0.0, 0.0);
        Point edge = new Point(0.0, 1.0);
        Circle circle = new Circle(center, edge);
        assertEquals(2.0, circle.diameter());
    }

    @Test
    void testArea() {
        Point center = new Point(0.0, 0.0);
        Point edge = new Point(0.0, 1.0);
        Circle circle = new Circle(center, edge);
        double expected = (Math.PI) Math.pow(3.0, 2);
        assertEquals(expected, circle.area());
    }

}