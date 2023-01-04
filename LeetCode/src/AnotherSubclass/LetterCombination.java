package AnotherSubclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String args[]) {
        int nums = 10;


        List<List<Integer>> l2 = new ArrayList<>();
        l2.add(new ArrayList<>(Arrays.asList(1)));

        System.out.println(l2);

        for (int i = 1; i < nums; i++) {
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list1.add(1);
                } else {
                    list1.add(l2.get(i - 1).get(j) + l2.get(i - 1).get(j - 1));

                }
            }
            l2.add(list1);


        }
        System.out.println(l2);

    }
}

