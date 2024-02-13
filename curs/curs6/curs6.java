package curs.curs6;

public class curs6 {
    public static void main(String[] argh) {

        int numarZile = 10;
        int numarZileDinLuna = numarZile * 3;

        int y = 3 + 6 * --numarZile;
        int y2 = 3 + 6 * numarZile--;
        int y3 = 3 + 6 * ++numarZile;

        System.out.println(numarZileDinLuna);
        System.out.println(y);
        System.out.println(y2);
        System.out.println(y3);

        boolean areMasina = false;

        if (areMasina) {
            System.out.println("Am pornit!");
        }
        System.out.println(areMasina);

        System.out.println("#############");
        int numarDeOre=100;
        System.out.println(--numarDeOre);
        System.out.println(numarDeOre--);
        System.out.println(--numarDeOre);
        /**  Conmentariu frumos */

    }
}
