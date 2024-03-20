public class Main {
    public static void main(String[] args) {
        RightTriangle ABC = new RightTriangle("ABC", 3.0, 4.0);
        Triangle BCD = new RightTriangle("BCD", 3.0, 4.0);
        Triangle CDE = new RegularTriangle("CDE", 3.0, 4.0, 5.0);

        System.out.println("Area of ABC: " + ABC.calculateArea());
        System.out.println("Area of BCD: " + BCD.calculateArea());
        System.out.println("Area of CDE: " + CDE.calculateArea());
    }
}
