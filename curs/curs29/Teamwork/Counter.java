package curs.curs29.Teamwork;

 public class Counter {
    public static int countWords(String sentence) {
        if (sentence.isEmpty())
            return 0;
        String[] words = sentence.split(" ");
        int counter = 0;
        for (String word :words){
            if (word.length()>3){
                counter++;
            }
        }
        return counter;
    }
}
