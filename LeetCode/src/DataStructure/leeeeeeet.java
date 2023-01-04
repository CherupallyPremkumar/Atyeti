package DataStructure;

import java.util.Arrays;

public class leeeeeeet {
     public static void main(String[] args) {

         int[] a={2,2,2,3,3,3,3,2,2,2,3};
         System.out.println(Solution123.majorityElement(a));
     }
}
 class Solution123 {
    public static int majorityElement(int[] nums) {

        int major=nums[0], count = 1;
        for(int i=1; i<nums.length;i++){
            if(count==0){
                count++;
                major=nums[i];
            }else if(major==nums[i]){
                count++;
            }else count--;

        }
        return major;
    }
}
class GFG
{

    // Returns result when we pass title.
    static int titleToNumber(String s)
    {
        // This process is similar to
        // binary-to-decimal conversion
        int result = 0;
        for (int i = 0; i < s.length(); i++)
        {
            result *= 26;
            result += s.charAt(i) - 'A' + 1;
        }
        return result;
    }

    // Driver Code
    public static void main (String[] args)
    {
        System.out.print(titleToNumber("CDA"));
    }
}