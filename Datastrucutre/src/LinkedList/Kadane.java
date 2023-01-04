package LinkedList;

import java.util.Arrays;
import java.util.Collections;

//algorithm
public class Kadane {
    public static int contiguosArray(int[] arr) {
        int size = arr.length;
        int min = Integer.MIN_VALUE;
        int sum = 0;
        int start=0;
        int end=0;
        int s=0;
        for (int i = 0; i < size; i++){
            sum=sum+arr[i];
            if(min < sum) {
                min = sum;
                start=s;
                end=i;
            }
            if(sum<0) {
                sum = 0;
                s=i+1;
            }
    }

        System.out.println(start +" "+end);
        return min;
    }
    public static int[] dutchFlag(int[] arr)
    {
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(mid <high)
        {
            if(arr[mid]==0)
            {
                swap(arr ,low,mid);
               low++;
               mid++;
            }
            if(arr[mid]==1)
            {
              mid++;
            }
            if(arr[mid]==2)
            {
              swap(arr,mid,high);
             high--;
            }
        }

        return arr;
    }
    public static int[] swap(int[] arr, int l,int r)
    {
        int temp=0;
        temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return arr;
    }

//    public static int[] windowslidingTechnique()
//    {
//
//    }

    public static void main(String[] args) {
        int[] a = {1, 2, 0, 1, 2, 0, 1, 2, 0};
        //System.out.println(contiguosArray(a));
        int[] b = dutchFlag(a);
        for (int c : b) {
            System.out.println(c);
        }
    }
}
