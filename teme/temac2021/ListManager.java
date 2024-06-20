package teme.temac2021;

import java.util.ArrayList;

public class ListManager {
    public ArrayList<Integer> initializeList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        ListManager listManager = new ListManager();
        ArrayList<Integer> list = listManager.initializeList();
        System.out.println(list);
    }
}

