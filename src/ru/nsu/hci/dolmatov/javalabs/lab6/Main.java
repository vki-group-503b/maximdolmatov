package ru.nsu.hci.dolmatov.javalabs.lab6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Выберите пространство:\n1. Двухмерное\n2. Трехмерное");
        int menu = s.nextInt();

        switch (menu) {
            case 1:
                point2d();
                break;
            case 2:
                point3d();
                break;
            default:
                System.out.println("Ошмбка ввода!");

        }
    }

    private static void point2d() {

        Scanner s = new Scanner(System.in);
        double x,y;

        System.out.println("Введите Х и Y для точки А");
        x = s.nextDouble();
        y = s.nextDouble();
        Point2d a = new Point2d(x,y);

        System.out.println("Введите Х и Y для точки B");
        x = s.nextDouble();
        y = s.nextDouble();
        Point2d b = new Point2d(x,y);

        System.out.println("Введите Х и Y для точки C");
        x = s.nextDouble();
        y = s.nextDouble();
        Point2d c = new Point2d(x,y);

        System.out.println("A(" + a.getX() + ";" + a.getY() + ")");
        System.out.println("B(" + b.getX() + ";" + b.getY() + ")");
        System.out.println("C(" + c.getX() + ";" + c.getY() + ")");

        System.out.println("A в поярной системе: " + a.polarCoordinates());
        System.out.println("B в поярной системе: " + b.polarCoordinates());
        System.out.println("C в поярной системе: " + c.polarCoordinates());

        System.out.println("Расстояние между A и B: " + a.distance(b));
        System.out.println("Расстояние между B и C: " + b.distance(c));
        System.out.println("Расстояние между A и C: " + a.distance(c));

        if (a.testLine(b, c))
            System.out.println("Точки лежат на одной прямой");
        else
            System.out.println("Точки не лежат на одной прямой");
    }

    private static void point3d () {

        Scanner s = new Scanner(System.in);
        double x, y, z;

        System.out.println("Введите X,Y,Z для точки A");
        x = s.nextDouble();
        y = s.nextDouble();
        z = s.nextDouble();
        Point3d a = new Point3d(x,y,z);

        System.out.println("Введите X,Y,Z для точки B");
        x = s.nextDouble();
        y = s.nextDouble();
        z = s.nextDouble();
        Point3d b = new Point3d(x,y,z);

        System.out.println("Введите X,Y,Z для точки C");
        x = s.nextDouble();
        y = s.nextDouble();
        z = s.nextDouble();
        Point3d c = new Point3d(x,y,z);

        System.out.println("Введите X,Y,Z для точки D");
        x = s.nextDouble();
        y = s.nextDouble();
        z = s.nextDouble();
        Point3d d = new Point3d(x,y,z);

        System.out.println("A(" + a.getX() + ";" + a.getY() + ";" + a.getZ());
        System.out.println("B(" + b.getX() + ";" + b.getY() + ";" + b.getZ());
        System.out.println("C(" + c.getX() + ";" + c.getY() + ";" + c.getZ());
        System.out.println("D(" + d.getX() + ";" + d.getY() + ";" + d.getZ());

        System.out.println("Расстояние между А и B: " + a.distance(b));
        System.out.println("Расстояние между А и C: " + a.distance(c));
        System.out.println("Расстояние между А и D: " + a.distance(d));
        System.out.println("Расстояние между B и C: " + b.distance(c));
        System.out.println("Расстояние между B и D: " + b.distance(d));
        System.out.println("Расстояние между C и D: " + c.distance(d));

        if (a.testLine(b, c))
            System.out.println("Точки лежат на одной прямой");

        if (a.testPlane(b, c, d))
            System.out.println("Точки лежат на одной плоскости");
    }
}
