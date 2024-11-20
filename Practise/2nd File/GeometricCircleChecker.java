import java.util.*;

class Point2D {
    public int x;
    public int y;

    public Point2D(int crdX, int crdY) {
        this.x = crdX;
        this.y = crdY;
    }

    double CalculateDistance(Point2D point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }
}

class Line {
    public Point2D start;
    public Point2D end;

    public Line(Point2D startPoint, Point2D endPoint) {
        this.start = startPoint;
        this.end = endPoint;
    }

    double Length() {
        return end.CalculateDistance(start); // Return the distance as a double
    }
}

class Circle {
    Point2D center;
    double radius;

    Circle(Point2D center, int radius) {
        this.radius = radius;
        this.center = center;
    }

    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    boolean intersects(Circle otherCircle) {
        double distanceBetweenCenters = this.center.CalculateDistance(otherCircle.center);
        return distanceBetweenCenters < (this.radius + otherCircle.radius) && distanceBetweenCenters > Math.abs(this.radius - otherCircle.radius);
    }
}

class GeometricCircleChecker {
    public static void main(String[] args) {
        Random random = new Random();
        List<Circle> circles = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(100); // Random x coordinate
            int y = random.nextInt(100); // Random y coordinate
            int radius = random.nextInt(10) + 1; // Random radius between 1 and 10
            Point2D center = new Point2D(x, y);
            Circle circle = new Circle(center, radius);
            circles.add(circle);
            System.out.println("Circle " + (i + 1) + " - Center: (" + x + ", " + y + "), Radius: " + radius);
        }

        int intersectingCount = 0;
        for (int i = 0; i < circles.size(); i++) {
            for (int j = i + 1; j < circles.size(); j++) {
                if (circles.get(i).intersects(circles.get(j))) {
                    intersectingCount++;
                }
            }
        }

        System.out.println("Number of intersecting circle pairs: " + intersectingCount);

        for (Circle circle : circles) {
            circle.center.x += 20;
            circle.center.y += 20;
        }
        System.out.println("Circles adjusted to avoid intersection.");

        Point2D testPoint = new Point2D(50, 50);
        for (Circle circle : circles) {
            double distanceToCenter = circle.center.CalculateDistance(testPoint);
            if (distanceToCenter < circle.radius) {
                System.out.println("Point (" + testPoint.x + ", " + testPoint.y + ") is inside the circle with center (" + circle.center.x + ", " + circle.center.y + ")");
            } else if (distanceToCenter == circle.radius) {
                System.out.println("Point (" + testPoint.x + ", " + testPoint.y + ") is on the circle with center (" + circle.center.x + ", " + circle.center.y + ")");
            } else {
                System.out.println("Point (" + testPoint.x + ", " + testPoint.y + ") is outside the circle with center (" + circle.center.x + ", " + circle.center.y + ")");
            }
        }

        Point2D lineStart = new Point2D(10, 10);
        Point2D lineEnd = new Point2D(50, 50);
        Line line1 = new Line(lineStart, lineEnd);
        Point2D line2Start = new Point2D(10, 50);
        Point2D line2End = new Point2D(50, 10);
        Line line2 = new Line(line2Start, line2End);

        System.out.println("Length of Line 1: " + line1.Length());
        System.out.println("Length of Line 2: " + line2.Length());
    }
}