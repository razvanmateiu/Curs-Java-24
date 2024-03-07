package curs.curs13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**Random*/
//        Random random = new Random();
//        random.nextInt(1, 100);
//        System.out.println(random.nextInt(1, 100));
/** Scanner */
//        Scanner scanner=new Scanner(System.in);
//        int numarUtilizator= scanner.nextInt();
//        System.out.println("Numarul primit este: "+numarUtilizator);

        /** Math */
//        int numarulMaxim = Math.max(1, 30);
//        System.out.println(numarulMaxim);
        /**Array*/
        int[] arrayNou = new int[]{10, 20, 30};
        int numarElemente = arrayNou.length;
        System.out.println(numarElemente);

        String[] listaDeFructe = {"Mar", "Para", "Pruna"};
        System.out.println(listaDeFructe[0]);
        int[][] numarElementeMatrice = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(numarElementeMatrice.length);

        for (int index = 0; index < listaDeFructe.length; ++index) {
            System.out.print(listaDeFructe[index] + " ");
        }

        System.out.println();
        for (String fruct : listaDeFructe) {
            System.out.print(fruct + "* ");
        }

        String[] listaCopiataFructe = Arrays.copyOfRange(listaDeFructe, 0, 1);
        for (String fructCopiat : listaCopiataFructe) {
            System.out.println(fructCopiat);
        }

        Arrays.sort(listaDeFructe);
        for (String fruct:listaDeFructe){
            System.out.println(fruct);
        }


    }
}
