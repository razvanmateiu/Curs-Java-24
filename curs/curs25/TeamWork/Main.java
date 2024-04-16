package curs.curs25.TeamWork;

public class Main {
    public static void main(String[] args) {
        PrintArray array=new PrintArray();
        array.printArray();

        Pair pair=new Pair();
        pair.setKey(1);
        pair.setValue("apple");

        System.out.println(pair.getKey().toString()+pair.getValue().toString());

        System.out.println(Day.FRIDAY.isWeekEndDay());
        System.out.println(Day.SATURDAY.isWeekEndDay());
    }
}
