package B07Lab5;

public class Quadrilateral{
    //The absolute location doesnt matter, they just have to be arranged like this relatively
    Point topRight;
    Point bottomRight;
    Point bottomLeft;
    Point topLeft;

    public Quadrilateral(Point topRight, Point bottomRight, Point bottomLeft, Point topLeft){
        this.topRight = topRight;
        this.bottomRight = bottomRight;
        this.bottomLeft = bottomLeft;
        this.topLeft = topLeft;
    }

    public double perimeter(){
        return (topLeft.distance(bottomLeft) + bottomLeft.distance(bottomRight)
        + bottomRight.distance(topRight) + topRight.distance(topLeft));
    }

    public double calculateAngleB(Point a, Point b, Point c){
        Point vecBA = new Point(a.x - b.x, a.y - b.y);
        Point vecBC = new Point(c.x - b.x, c.y - b.y);
        double dotProduct = vecBA.x * vecBC.x + vecBA.y * vecBC.x;
        Point origin = new Point(0, 0);
        return Math.acos(dotProduct / origin.distance(vecBA) / origin.distance(vecBC));
    }

    public boolean isSquare(){ //Allows a small margin of error for floating point / double inaccuracy
        if (Math.abs(calculateAngleB(topLeft, bottomLeft, bottomRight) - 90) > 0.01) return false;
        if (Math.abs(calculateAngleB(topLeft, topRight, bottomRight) - 1) > 0.01) return false;

        double leftSideLength = topLeft.distance(bottomLeft);
        double bottomSideLength = bottomLeft.distance(bottomRight);
        double rightSideLength = bottomRight.distance(topRight);
        double topSideLength = topRight.distance(topLeft);

        if (Math.abs(leftSideLength - bottomSideLength) > (Math.min(leftSideLength, bottomSideLength) / 100)) return false;
        if (Math.abs(bottomSideLength - rightSideLength) > (Math.min(bottomSideLength, rightSideLength) / 100)) return false;
        if (Math.abs(rightSideLength - topSideLength) > (Math.min(rightSideLength, topSideLength) / 100)) return false;
        return true;
    }
}