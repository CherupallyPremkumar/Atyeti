package Harish;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {
    public static String[] revereseString(String[] arr)
    {
        int left =0;
        int right=arr.length-1;
        String temp="";
        while(left<=right)
        {
            temp=arr[right];
            arr[right]= arr[left];
            arr[left]=temp;
            left++;
            right--;
        }
        return arr;
    }
    public static int[] revereseString(int[] arr)
    {
        int left =0;
        int right=arr.length-1;
        int temp=0;
        while(left<=right)
        {
            temp=arr[right];
            arr[right]= arr[left];
            arr[left]=temp;
            left++;
            right--;
        }
        return arr;

    }
    public static int[] sort(int[] arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                int temp=0;
                if(arr[i] > arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }

    public static int reverseInteger(Integer in)
    {
        int value=0;
        int value2=0;
        while(in!=0) {
             value2 = in % 10;
             value=value*10 +value2;
            in=in/10;
        }
        return value;
    }
    public static ArrayList<String> permute(String str,int left ,ArrayList<String> strings)
    {

        int right=str.length();
        if(left==right)
        {
            strings.add(str);

        }else {
            for(int i=left;i<right;i++)
              {
               str=swap(str,left,i);
               permute(str,left+1,strings);
               str=swap(str,left,i);
            }
        }
        return strings;
    }
    public static String swap(String str ,Integer left ,Integer swap)
    {
           char temp;
           char[] charArray =str.toCharArray();
           temp=charArray[left];
           charArray[left]=charArray[swap];
           charArray[swap] =temp;
           return String.valueOf(charArray);
    }
    public static void main(String[] args) {
        int arr1[] = {4, 5, 1, 2};
       int arr2[] = {7, 0, 2};
        /*String arr[]={"prem","kumar","vaishnavi","harish","shivani"};
        revereseString(arr);
        revereseString(arr1);
        sort(arr2);*/
       // System.out.println(reverseInteger(876));
        ArrayList<String> strings =new ArrayList<>();
        System.out.println(permute("ABCD",0 ,strings));
    }
}
