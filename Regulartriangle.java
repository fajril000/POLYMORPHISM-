public class RegularTriangle extends Triangle {
    public RegularTriangle(String name, double side1, double side2, double side3) {
        super(name, side1, side2, side3);
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
