package teme.temac14;

public class Challenge6S06 {
//    6. String Replacement
//    Description: Use the StringBuilder class to replace every occurrence of a substring within a given string with another substring.
//    For instance, replace "cat" with "dog" in the string "The cat sat on the mat."
public static void main(String[] args) {
    StringBuilder sentence=new StringBuilder("The cat sat on the mat");
    String search="cat";
    String replace="dog";
    int index;
    index=sentence.indexOf(search);
    sentence.replace(index,index+search.length(),replace);
    System.out.println(sentence);

}

}
