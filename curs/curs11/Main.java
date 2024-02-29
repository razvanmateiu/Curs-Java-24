package curs.curs11;

public class Main {
    public static void main(String[] args) {
        /**Am creat un obiect de Floare=am creat o instanta de tip Floare*/
        Floare lalea=new Floare(3);

        Floare lalea1=new Floare(5, "verde");

        int numarul10=lalea.metodaCareIntoarceUnNrIntreg();
        System.out.println(numarul10);
    }
}
