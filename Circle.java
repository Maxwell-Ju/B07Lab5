public class Circle {

    Point center;
    Point edge;

    public Circle(Point center, Point edge) {
        this.center = center;
        this.edge = edge;
    }

    public double radius() {
        double x = Math.pow(center.x - edge.x, 2);
        double y = Math.pow(center.y - edge.y, 2);
        return Math.sqrt(x+y);
    }

    public double diameter() {
        return 2*radius();
    }

    public double circumference() {
        double rad = radius();
        return 2*Math.PI*rad;
    }

    public double area() {
        double rad = radius();
        return (Math.PI) * Math.pow(rad, 2);
    }
}
