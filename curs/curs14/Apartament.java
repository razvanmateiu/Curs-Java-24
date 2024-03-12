package curs.curs14;

public class Apartament {
    int numar;
    int etaj;
    int camere;
    boolean decomandat;
    static boolean areApa;
    static boolean areCurent;

    public Apartament(int numar, int etaj, int camere, boolean decomandat) {
        this.numar = numar;
        this.etaj = etaj;
        this.camere = camere;
        this.decomandat = decomandat;
    }

    public int getNumar() {
        return numar;
    }

    public int getEtaj() {
        return etaj;
    }

    public int getCamere() {
        return camere;
    }

    public boolean isDecomandat() {
        return decomandat;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public void setCamere(int camere) {
        this.camere = camere;
    }

    public void setDecomandat(boolean decomandat) {
        this.decomandat = decomandat;
    }

    static void metodaApartament1(){

        System.out.println("Metoda apartament 1");
    }
    static void metodaApartament2(){
        System.out.println("Metoda apartament 2");
    }
    static void metodaApartament3(){
        System.out.println("Metoda apartament 3");
    }
    static void metodaApartament4(){
        System.out.println("Metoda apartament 4");
    }
}
