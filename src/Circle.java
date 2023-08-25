import java.util.Random;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 2;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
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

}

class A{
    public static void main(String[] args) {
        Circle lingkaran = new Circle(5);
        Circle lingkaran2 = new Circle();
        Circle lingkaran3 = new Circle(10);
        lingkaran.printCircle();
        System.out.println("luas lingkaran : " +lingkaran.getArea());
        lingkaran2.printCircle();
        System.out.println("luas lingkaran 2 : " +lingkaran2.getArea());
        lingkaran3.printCircle();
        System.out.println("luas lingkaran 3 : " +lingkaran3.getArea());
        Circle[] arrCircle = new Circle[3];
        arrCircle[0] = lingkaran;
        arrCircle[1] = lingkaran2;
        arrCircle[2] = lingkaran3;

        Random random = new Random();

        // Menghasilkan bilangan bulat acak antara 0 (inklusif) dan 20 (eksklusif)

        for (int i = 0; i < arrCircle.length; i++) {
            int randomInt = random.nextInt(20) + 1;
            arrCircle[i].setRadius(randomInt);
            System.out.println("radius lingkaran ke " + i + " : " + arrCircle[i].getRadius());
            System.out.println("luas lingkaran ke " + i + " : " + arrCircle[i].getArea());

        }
        System.out.println("lingkaran index ke 0 : " + lingkaran.getRadius());

    }
}

