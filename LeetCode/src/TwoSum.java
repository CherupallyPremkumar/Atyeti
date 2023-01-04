import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static void main(String[] args) {
        int[] nums={1,6,3,4};
 Sum sum=new Sum();
 int[] nums1=sum.get(nums,5);
        System.out.println(Arrays.toString(nums1));

    }
}
class Sum{

    public int[]  get(int[] nums, int target){
  int[] ne=new int[2];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int remaining=target-nums[i];
            if(hashMap.containsKey(remaining))
            {
                ne[0]=hashMap.get(remaining);
                ne[1]=i;
                return ne;
            }
            hashMap.put(nums[i],i);
        }





       throw new IllegalArgumentException("no data fownd");
    }

}
