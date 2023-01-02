package Harish;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class RepeatedChar {
    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(3);
        integers.add(3);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        HashMap<Integer,Integer> s=new HashMap<>();
       // integers.stream().filter(a-> { if(!s.containsKey(a) ? s.put(a,a); : System.out.println(a);) }).collect(Collectors.toList())
        integers=integers.stream().distinct().collect(Collectors.toList());
        System.out.println(integers);
    }
}
