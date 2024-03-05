package curs.curs12;

public class Legume {
    String nume;
    String culoare;
    String forma;
    String gust;

    Legume(String numeParam, String culoareParam, String formaParam, String gustParam) {
        this.nume = numeParam;
        this.culoare = culoareParam;
        this.forma = formaParam;
        this.gust = gustParam;
    }

    void afiseazaGust() {
        System.out.println("Am apelat metoda afiseazaGust");
    }

    void afiseazaCuloarea() {
        System.out.println("Am apelat metoda afiseazaCuloare");
    }

    public String getNume() {
        return nume;
    }

    public String getCuloare() {
        return culoare;
    }
}
