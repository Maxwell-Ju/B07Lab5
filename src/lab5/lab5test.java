package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class lab5test {

	@Test
    void testCircleConstructor() {
        Point center = new Point(0,0);
        Point edge = new Point(1,0);
        Circle c = new Circle(center, edge);
        assertNotEquals(c, null);
    }

    @Test
    void testRadius() {
        Point center = new Point(0,0);
        Point edge = new Point(1,0);
        Circle c = new Circle(center, edge);
        assertEquals(c.radius(), 1);
    }

    @Test 
    void testCircumference() {
        Point center = new Point(0,0);
        Point edge = new Point(1,0);
        Circle c = new Circle(center, edge);
        double radius = c.radius();
        assertEquals(c.circumference(), 2*Math.PI*radius);
    }

}
