package Day2;

public class Main {
    //perimeter = 2 * 3.14 * radius
    //area = PI * radius * radius
    private static final double radius = 4.5;
    public static void main(String[] args) {
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
