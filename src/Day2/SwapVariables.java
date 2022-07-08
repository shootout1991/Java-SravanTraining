package Day2;

public class SwapVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = b;
        b = a;
        a = c;

        System.out.println("Swaped Variables are = "  + a + " " + b);

    }
}
