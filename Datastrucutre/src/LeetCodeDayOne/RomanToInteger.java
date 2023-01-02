package LeetCodeDayOne;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s="VIII";
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("I", 1);
        hash.put("V", 5);
        hash.put("X", 10);
        hash.put("L", 50);
        hash.put("C", 100);
        hash.put("D", 500);
        hash.put("M", 1000);
        hash.put("IV",4);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                  ans+=hash.get(s.charAt(i)+s.charAt(i+1));
                } else {
                    ans += hash.get(s.charAt(i));
                }


        }
        System.out.println(ans);
    }
}
