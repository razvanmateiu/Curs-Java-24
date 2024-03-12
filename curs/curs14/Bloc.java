package curs.curs14;

public class Bloc {
    int numar;
    String scara;
    int nrEtaje;
    boolean areGaraj;

    static boolean isCurent=true;
    static boolean isApa=true;

    public int getNumar() {
        return numar;
    }

    public String getScara() {
        return scara;
    }

    public int getNrEtaje() {
        return nrEtaje;
    }

    public boolean isAreGaraj() {
        return areGaraj;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public void setScara(String scara) {
        this.scara = scara;
    }

    public void setNrEtaje(int nrEtaje) {
        this.nrEtaje = nrEtaje;
    }

    public void setAreGaraj(boolean areGaraj) {
        this.areGaraj = areGaraj;
    }
    static void metodaStatica(){
        System.out.println("Am apelat metoda Statica");
    }
    static int metodaNrBlocuri(){
        return 4;
    }
    static boolean metodaConstructieInPicioare(){
        return true;
    }
    static  void metodaLaCareNuStiuCeNumeSaIiPun(){
        System.out.println("Hello");
    }

    Bloc(int numar, String scara, int nrEtaje,boolean areGaraj){
        this.numar=numar;
        this.scara=scara;
        this.nrEtaje=nrEtaje;
        this.areGaraj=areGaraj;
    }

}
