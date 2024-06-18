package curs.curs29.Teamwork;

import static curs.curs29.Teamwork.Counter.countWords;

public class Main {
    public static void main(String[] args) {
//        String sentence = "Ana are mere multe si colorate";
//        int counter = 0;
//
//        String[] cuvinte = sentence.split(" ");
//        for (String cuvant : cuvinte) {
//            if (cuvant.length() > 3) counter++;
//            // System.out.println(cuvant);
//        }
//        System.out.println(counter + " cuvinte au mai mult de 3 litere");
        String sentence = "Marry has a lamb.";
        System.out.println("Number of words which has more than 3 chars : "+ countWords(sentence));



    }

}
