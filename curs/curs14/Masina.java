package curs.curs14;

public class Masina {
    String culoare;
    String producator;
    int nrRoti;
    int nrUsi;
    static boolean areBenzina=true;
    static boolean areDiesel=false;

    public Masina(String culoare, String producator, int nrRoti, int nrUsi) {
        this.culoare = culoare;
        this.producator = producator;
        this.nrRoti = nrRoti;
        this.nrUsi = nrUsi;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getProducator() {
        return producator;
    }

    public int getNrRoti() {
        return nrRoti;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public void setNrRoti(int nrRoti) {
        this.nrRoti = nrRoti;
    }

    public void setNrUsi(int nrUsi) {
        this.nrUsi = nrUsi;
    }

    static void metodaMasina1(){
        System.out.println("Metoda 1 Masina");
    }
    static void metodaMasina2(){
        System.out.println("Metoda 2 Masina");
    }
    static void metodaMasina3(){
        System.out.println("Metoda 3 Masina");
    }
    static void metodaMasina4(){
        System.out.println("Metoda 4 Masina");
    }
}
