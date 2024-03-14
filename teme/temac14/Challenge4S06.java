package teme.temac14;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge4S06 {
    public static void main(String[] args) {
        char[] vocale = {'a', 'e', 'i', 'o', 'u'};
        System.out.print("Introduceti un cuvant: ");
        Scanner scanner = new Scanner(System.in);
        StringBuilder cuvant = new StringBuilder(scanner.next());
        int l = cuvant.length();
        ArrayList<Integer> indexPos = new ArrayList<Integer>();
        for (int i = 0; i < l; i++) {
            for (int index = 0; index < vocale.length; index++) {
                if (cuvant.charAt(i) == vocale[index]) indexPos.add(i);
            }

        }

        for (int i = indexPos.size() - 1; i >= 0; --i) {
            cuvant.deleteCharAt(indexPos.get(i));
        }

        System.out.println(indexPos);
        System.out.println(cuvant);
    }
}
