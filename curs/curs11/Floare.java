package curs.curs11;

public class Floare {
    /**
     * Proprietati
     */
    int nrPetale;
    String culoare;
    String miros;
    boolean areGhiveci;

    Floare(int nrPetaleParam, String culoareParam) {
        this.nrPetale = nrPetaleParam;
        this.culoare = culoareParam;
        System.out.println("Am apelat constructorul cu 2 parametrii");
    }

    Floare(int nrPetaleParam) {
        this.nrPetale = nrPetaleParam;
    }

    /**
     * Metode/comportament
     */
    int metodaCareIntoarceUnNrIntreg() {
        return 10;
    }

    String metodaCareIntoarceString() {
        return "Returnez String";
    }

    void metodaCareNuReturneazaNimic() {
        System.out.println("Metoda nu returneaza nimic");
    }

    /**
     * Getter & Setter
     */

    int getNumarPetale() {
        return nrPetale;
    }

    void setNrPetale(int nrPetaleParametru) {
        this.nrPetale = nrPetaleParametru;
    }

}
