public abstract class Triangle {
    protected String name;
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public abstract double calculateArea();
}
