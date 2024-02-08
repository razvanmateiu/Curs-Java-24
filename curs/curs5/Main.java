package curs.curs5;

public class Main {
    public static void main(String[] args) {
        int y = 2;
        System.out.println(y);
        double x = 3 + 6 * --y;
        System.out.println(x);

        int x1 = 2 * 5 + 3 * 4 - 8;
        System.out.println(x1);
        int y1 = 2 * ((5 + 3) * 4 - 8);
        System.out.println(y1);

        String firstName = "Maria";
        String lastName = "Georgescu";
        System.out.println(firstName + lastName);

        firstName += lastName;
        System.out.println(firstName);

        System.out.println(10 % 3);
        System.out.println(11 % 3);
        System.out.println(12 % 3);

        boolean x2 = false;
        System.out.println(x2);
        x2 = !x2;
        System.out.println(x2);

        int counter = 0;
        System.out.println(counter);
        System.out.println(++counter);
        System.out.println(counter);
        System.out.println(counter--);
        System.out.println(counter);

        int x3 = 3;
        int y3 = ++x3 * 5 / x3-- + --x3;
        System.out.println("x is " +x3);
        System.out.println("y is " +y3);

        int z=2, q=3;
        z *=q;
        System.out.println(z);

        System.out.println(10 + 10);

    }
}
