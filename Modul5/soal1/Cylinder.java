package soal1;
class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }
    public double area() {
        return Math.PI * (radius * radius) * height;
    }
    public String toString() {
        return super.toString() + " with radius " + radius + "cm and height " + height + "cm";
    }
}