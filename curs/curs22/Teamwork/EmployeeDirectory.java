package curs.curs22.Teamwork;

import java.util.HashMap;

public class EmployeeDirectory {
    void displayEmployeeInfo(HashMap<String,String> listEmployee, String id, String name){
        listEmployee.put(id,name);
        System.out.println("ID: "+id+" Nume:"+name);
    }


}
