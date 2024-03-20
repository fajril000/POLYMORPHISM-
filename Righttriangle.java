public class RightTriangle extends Triangle {
    public RightTriangle(String name, double base, double height) {
        super(name, base, height, Math.sqrt(base * base + height * height));
    }

    public double calculateArea() {
        return 0.5 * side1 * side2;
    }
}
