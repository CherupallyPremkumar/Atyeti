package DataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode2 {
    public static void main(String[] args) {
        int[] a={1,2,2,1};
        int[] b={1,3,2,1,2,1};
       int[] a1= Solution.intersect(a,b);
       for(int j: a1)
       {
           System.out.println(j);
       }
    }
}
class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {

            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    if(!hashMap.containsKey(nums1[i]))
                    {
                        hashMap.put(nums1[i],nums1[i]);
                    }
                }
            }
        }
        int k=0;
        int[] lll=new int[hashMap.size()];
        for (int a : hashMap.keySet())
        {
            lll[k]=a;
            k++;
        }

        return lll;
    }
}
