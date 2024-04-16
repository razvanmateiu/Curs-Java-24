package curs.curs22;

public class Person {
    String name;
    int age;
//    boolean equals(){
//        return true;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (obj == this) {
//            return true;
//        }
//        if (!(obj instanceof Person)){
//            return false;
//        }
//        return (name.equals(obj.name) && age==obj.age);
//    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
