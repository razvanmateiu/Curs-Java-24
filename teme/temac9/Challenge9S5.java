package teme.temac9;

public class Challenge9S5   {
    public static void main(String[] args) {
//        9. For-Each Loop
//        Given an array of integers, write a program that prints each number in the array followed by "Even" if the number is even,
//        or "Odd" if the number is odd. Utilize a for-each loop for this task.
        int[] arrayInt={32, 13, 17, 94, -12, 7, 28, 29, 2, 65};

        for (int i: arrayInt){
            if (i%2==0) System.out.println(i+" even");
            else System.out.println(i+" odd");
        }
    }
}
