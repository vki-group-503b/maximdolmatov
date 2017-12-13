package ru.nsu.hci.dolmatov.javalabs.lab6;

public class Point3d {
    double x, y, z;

    public Point3d(double x, double y, double z) {

        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {

        return x;
    }

    public double getY() {

        return y;
    }

    public double getZ() {

        return z;
    }

    public double distance(Point3d p2) {

        return Math.sqrt(Math.pow(this.x - p2.x,2) + Math.pow(this.y - p2.y,2) + Math.pow(this.z - p2.z,2));
    }

    public boolean testLine(Point3d p2, Point3d p3) {

        if (getY() * (p2.getZ() - p3.getZ()) + p2.getY() * (p3.getZ() - getZ()) + p3.getY() * (getZ() - p2.getZ()) +
                getZ() * (p2.getX() - p3.getX()) + p2.getZ() * (p3.getX() - getX()) + p3.getZ() * (getX() - p2.getX()) +
                getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - getY()) + p3.getX() * (getY() - p2.getY()) == 0)
            return true;
        else
            return false;
    }

    public boolean testPlane(Point3d p2, Point3d p3, Point3d p4) {
        double A, B, C, D, Result;
        A = this.y * (p2.z - p3.z) + p2.y * (p3.z - this.z) + p3.y * (this.z - p2.z);
        B = this.z * (p2.x - p3.x) + p2.z * (p3.x - this.x) + p3.z * (this.x - p2.x);
        C = this.x * (p2.y - p3.y) + p2.x * (p3.y - this.y) + p3.x * (this.y - p2.y);
        D = this.x * (p2.y * p3.z - p3.y * p2.z) + p2.x * (p3.y * this.z - this.y * p3.z) + p3.x * (this.y * p2.z - p2.y * this.z);
        Result = ((A * p4.x) + (B * p4.y) + (C * p4.z)) - D;
        if (Result == 0d)
            return true;
        else
            return false;
    }
}
