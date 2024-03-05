package curs.curs12;

public class Fruct {
    String numeFruct;
    String culoare;

    String forma;
    int nrSeminte;

    public Fruct(String numeParam, String culoareParam, String formaParam, int nrSeminteParam) {
        this.numeFruct = numeParam;
        this.culoare = culoareParam;
        this.nrSeminte = nrSeminteParam;
    }

    void afiseazaMetoda() {
        System.out.println("Am rulat metoda afiseaza Metoda");
    }

    public String getNumeFruct() {
        return numeFruct;
    }

    public int getNrSeminte() {
        return nrSeminte;
    }


}
