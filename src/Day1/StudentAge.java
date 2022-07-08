package Day1;

public class StudentAge {

    int Age1 = 25;
    int Age2 = 35;

    public static void main(String[] args) {

        new StudentAge().student1Age();
        new StudentAge().student2Age();
    }
        public void student1Age() {

            System.out.println(Age1);
        }

        public void student2Age(){

            System.out.println(Age2);
            System.out.println(-5 + 8 * 6);
        }
    }

