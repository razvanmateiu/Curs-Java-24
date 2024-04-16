package curs.curs25.TeamWork;

import java.util.Arrays;
import java.util.List;

public class PrintArray<T> {
    List<T> list = (List<T>) Arrays.asList("apple", "plums", "strawberry");
    public void printArray() {
        for (T s : list) {
            System.out.println(s);

        }
    }
}
