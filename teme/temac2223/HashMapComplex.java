package teme.temac2223;
import java.util.HashMap;

public class HashMapComplex {

    public HashMap<String, Integer> getCommonEntries(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
        HashMap<String, Integer> commonEntries = new HashMap<>();

        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonEntries.put(key, map1.get(key));
            }
        }

        return commonEntries;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("a", 1);
        map2.put("b", 4);
        map2.put("c", 3);
        map2.put("d", 5);

        HashMapComplex hashMapComplex = new HashMapComplex();
        HashMap<String, Integer> commonEntries = hashMapComplex.getCommonEntries(map1, map2);

        System.out.println(commonEntries);
    }
}
