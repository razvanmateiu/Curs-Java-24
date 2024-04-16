package curs.curs22.Teamwork;

import java.util.ArrayList;

public class ListUpdater{



    public ArrayList<Integer> updateList(ArrayList<Integer> list, int index){
        list.set(index,list.get(index)*2);
        return list;
    }
}
