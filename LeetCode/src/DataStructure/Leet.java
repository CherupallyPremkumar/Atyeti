package DataStructure;

import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i], hash.get(nums[i]) + 1);
            } else {
                hash.put(nums[i], 1);
            }


        }
        for (Map.Entry<Integer, Integer> ll : hash.entrySet()) {
            System.out.println(ll.getKey());
            if (ll.getValue() == 1) {
                return ll.getKey();
            }
        }
        return 0;
    }
}

class hello {
    public static void main(String[] args) {
        int[] a = {2, 2, 1};
        System.out.println(Solution1.singleNumber(a));
    }
}