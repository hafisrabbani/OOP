package pens.it;

import java.awt.*;
import java.util.Random;

public class Circle2D {
    private double radius;
    private Point center;

    public Circle2D() {
        this.radius = 2;
        this.center = new Point(0, 0);
    }

    public Circle2D(double radius) {
        this.radius = radius;
        this.center = new Point(0, 0);
    }

    public Circle2D(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return diameter
     */
    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created and the radius is " + radius);
    }

    public String toString() {
        return super.toString() + " radius: " + radius;
    }

    public boolean areCirclesIntersecting(Circle2D circle2) {

        // Menghitung jarak antara pusat-pusat lingkaran
        double distanceBetweenCenters = Math.sqrt(Math.pow(circle2.getCenter().x - this.getCenter().x, 2) +
                Math.pow(circle2.getCenter().y - this.getCenter().y, 2));

        // Jika jarak antara pusat-pusat kurang dari atau sama dengan jumlah radius, maka berpotongan
        if (distanceBetweenCenters <= this.getRadius() + circle2.getRadius()) {
            return true;
        } else {
            return false;
        }
    }

}

class A {
    //    public static boolean areCirclesIntersecting(double radius1, Point center1, double radius2, Point center2) {
    public static boolean areCirclesIntersecting(Circle2D circle1, Circle2D circle2) {

        // Menghitung jarak antara pusat-pusat lingkaran
        double distanceBetweenCenters = Math.sqrt(Math.pow(circle2.getCenter().x - circle1.getCenter().x, 2) +
                Math.pow(circle2.getCenter().y - circle1.getCenter().y, 2));

        // Jika jarak antara pusat-pusat kurang dari atau sama dengan jumlah radius, maka berpotongan
        if (distanceBetweenCenters <= circle1.getRadius() + circle2.getRadius()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Circle2D lingkaran1 = new Circle2D(5, new Point(0, 0));
        Circle2D lingkaran2 = new Circle2D(2, new Point(7, 0));

        if (lingkaran1.areCirclesIntersecting(lingkaran2)){
            System.out.println("Lingkaran 1 dan lingkaran 2 berpotongan");
        } else {
            System.out.println("Lingkaran 1 dan lingkaran 2 tidak berpotongan");
        }

//        if(A.areCirclesIntersecting(lingkaran1, lingkaran2)){
//            System.out.println("Lingkaran 1 dan lingkaran 2 berpotongan");
//        } else {
//            System.out.println("Lingkaran 1 dan lingkaran 2 tidak berpotongan");
//        }

    }
}

