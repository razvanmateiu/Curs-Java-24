package curs.curs19;

public class Pantofi extends GenericPantofi implements Incaltaminte {


//    @Override
//    public boolean areToc(String denumire) {
//        if (denumire.contains("de femei")) {
//            return true;
//        }
//        return false;
//    }

    @Override
    public boolean deFemeiDeBarbati() {
        return false;
    }
}
