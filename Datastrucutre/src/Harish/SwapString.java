package Harish;

public class SwapString {
    public static   void swap(String str,String str1)
    {
        str =str+str1;
        str1=str.substring(0,str.length()-str1.length());
        str =str.substring(str1.length());
        System.out.println(str +""+str1);
    }
    public static void main(String[] args) {
        String s="prem";
        String s1="kumar";
        swap(s,s1);
    }
}
