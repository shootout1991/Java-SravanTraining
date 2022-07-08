package Day2;

public class Variables {
    static int d = 100;

    int c = 200;

    public static void add(){

        int a = 10;
        int b = 20;
        //a and b are local variables
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        System.out.println("static Variables =" +d);
        System.out.println(new Variables().c);
        new Variables().add();

    }
}
