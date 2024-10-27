package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuadrilateralTest {

	@Test
	void perimeterTest() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(1, 0);
		Point p3 = new Point(1, 1);
		Point p4 = new Point(0, 1);
		Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
		assertEquals(q.perimeter(), 4.0);
	}
	
	@Test
	void calculateAngleBTest() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(1, 0);
		Point p3 = new Point(1, 1);
		Point p4 = new Point(0, 1);
		Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
		assertEquals(q.calculateAngleB(p2, p1, p4), Math.PI/2.0);
	}
	
	@Test
	void squareTest() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(1, 0);
		Point p3 = new Point(1, 1);
		Point p4 = new Point(0, 1);
		Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
		assertTrue(q.isSquare());
	}
	
	@Test
	void nonSquareTest() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(1, 0);
		Point p3 = new Point(1, 1);
		Point p4 = new Point(0, 100);
		Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
		assertFalse(q.isSquare());
	}

}
