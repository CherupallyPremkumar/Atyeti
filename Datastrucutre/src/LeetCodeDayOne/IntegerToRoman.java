package LeetCodeDayOne;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 8994;

        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        treeMap.put(1000, "M");

        treeMap.put(500, "D");
        treeMap.put(400, "CD");
        treeMap.put(100, "C");
        treeMap.put(90, "XC");
        treeMap.put(50, "L");
        treeMap.put(40, "XL");
        treeMap.put(10, "X");
        treeMap.put(9, "IX");
        treeMap.put(5, "V");
        treeMap.put(4, "IV");
        treeMap.put(1, "I");
        treeMap.put(900, "CM");
        TreeMap treeMap1=new TreeMap(treeMap);
        String result = "";
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            while (num >= entry.getKey()) {
                result = result + entry.getValue();
                num = num - entry.getKey();
            }
        }
        System.out.println(result);
    }
}
