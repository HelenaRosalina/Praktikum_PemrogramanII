package soal1;
abstract class Shape {
    protected String shapeName;

    public Shape(String name) {
        shapeName = name;
    }
    abstract double area();
    public String toString() {
        return shapeName;
    }
}