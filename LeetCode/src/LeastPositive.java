
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class LeastPositive {
    public static void main(String[] args) {
        int[] nums={7,8,9,11,12};
        int len=nums.length;
        boolean one=false;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==1) one=true;
            if(len<nums[i] || nums[i]<1) nums[i]=1;
        }
        if(!one) System.out.println("1");;

        for(int i=0;i<len;i++)
        {
            // nums[Math.abs(nums[i])-1]=-1 ;
            int index=Math.abs(nums[i]);
            nums[index-1]=-Math.abs(nums[index-1]);
        }
        for(int i=0;i<len;i++)
        {
            if(nums[i]>0) System.out.println(i+1);;
        }
        System.out.println(len+1);;
    }
}
