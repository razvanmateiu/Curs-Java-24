package teme.temac14;

public class Challenge3S06 {
//    3. Concatenate Multiple Strings
//    Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.
public static void main(String[] args) {
    String[] cuvinte={"Ana", "are","mere", "si", "pere"};
    StringBuilder concatenate=new StringBuilder();
    for (int i=0; i<cuvinte.length; ++i){
        concatenate.append(cuvinte[i]).append(" ");
    }
    System.out.println(concatenate);
}

}
