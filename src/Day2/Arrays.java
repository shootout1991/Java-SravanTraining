package Day2;

public class Arrays {
    public static void main(String[] args) {
        int [] abc = new int[10];
        String string[] = new String[10];

        abc[0] = 1;
        abc[1] = 10;
        abc[2] = 20;
        abc[3] = 30;
        abc[4] = 40;
        abc[5] = 50;
        abc[6] = 60;
        abc[7] = 70;
        abc[8] = 80;
        abc[9] = 90;


        for (int i=0; i < abc.length;i++){
            System.out.println(abc[i]);
        }

        System.out.println(abc[6]);
    }


}
