package ru.nsu.hci.dolmatov.javalabs.lab6;

public class Point2d {
    double x,y;

    public Point2d (double x, double y) {

        this.x = x;
        this.y = y;
    }

    public double getX() {

        return x;
    }

    public double getY() {

        return y;
    }

    public double distance(Point2d p2) {

        return Math.sqrt(Math.pow(this.x - p2.x,2) + Math.pow(this.y - p2.y,2));
    }

    public double polarCoordinates() {

        return Math.atan(y / x);
    }

    public boolean testLine(Point2d p2, Point2d p3) {

        if (((this.x - p3.x) * (p2.y - p3.y)) == ((p2.x - p3.x) * (this.y - p3.y)))
            return true;
        else
            return false;
    }
}
