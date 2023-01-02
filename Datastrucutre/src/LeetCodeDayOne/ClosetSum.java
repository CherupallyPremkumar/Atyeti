package LeetCodeDayOne;

import java.util.Arrays;

public class ClosetSum {
    public static void main(String[] args) {
              int[] nums={-1,2,1,-4};
              int target=1;
                Arrays.sort(nums);
                int sum = nums[0] + nums[1] + nums[2];
                for(int i = 0; i < nums.length - 2; i++){
                    int lo = i + 1, hi = nums.length - 1;
                    while(lo < hi){
                        int temp = nums[i] + nums[lo] + nums[hi];
                        sum = Math.abs(target - sum) > Math.abs(target - temp) ? temp : sum;
                        if(temp == target) System.out.println(temp);
                        else if(temp > target) hi--;
                        else if(temp < target) lo++;
                    }
                }
        System.out.println(sum);

    }
}
