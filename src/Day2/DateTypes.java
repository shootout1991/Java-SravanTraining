package Day2;

public class DateTypes {
    Boolean one = false;   //Its value ranges is true or false
    byte a = -128;         // Its value ranges lies between -128 to 127
    short c =  10000;      // Its value ranges lies between -32768 to 32767(inclusive)
    int i =   10000;       // Its value ranges lies between -2,147,483,648 to 2,147,483,648
    long l = 2000;         //9,223,372,836,854,775,808 and maximum value is 9,223,372,036,854,775,887
    float f = 2.0f;
    double d = 12.3343333333444;
    char letterA = 'A';

    public static void main(String[] args) {

        int a = 10;
        float f =a;
        System.out.println(a);
        System.out.println(f);

        float f1 = 10.5f;
        int b = (int)f1;

        System.out.println(f1);
        System.out.println(b);

    }
}

