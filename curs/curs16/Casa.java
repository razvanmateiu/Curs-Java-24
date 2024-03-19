package curs.curs16;

public class Casa {
    /*provate->am acces doar in interiorul clasei*/
    private int nr;
    String strada;
    String oras;
    String judet;
    static int mp=100;

    /*getter*/

    public String getStrada() {
        return strada;
    }

    public int getNr() {
        return nr;
    }

    /*setter*/
    public void setNr(int nrParam) {
        this.nr = nrParam;
    }

    public int calculeazaCodPostal(int valoareData) {
        int valoarePrimita = valoareData;
        int codPostal = valoarePrimita * this.nr;
        return codPostal;

    }
}
