package subclass;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class GfG2
{
    public static void main(String args[])
    {
        String s1 = new String("geeksforgeeks");
        String s2 = new String("geeksforgeeks");
        if (s1.equals(s2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}

class One implements Runnable
{
    public void run()
    {
        System.out.print(Thread.currentThread().getName());
    }
}
class Two implements Runnable
{
    public void run()
    {
        new One().run();
        new Thread(new One(),"gfg2").run();
        new Thread(new One(),"gfg3").start();
    }
}
class Three
{
    public static void main (String[] args)
    {
         int[] nums ={4,1,4,0,3,5,4,2,5,3,2,5,3};
                Arrays.sort(nums);
                Set<Double> s=new TreeSet<>();
                for(int i=0,j=nums.length-1;i<j;i++,j--) {
                    double avg=(double)(nums[i]+nums[j])/2;
                    s.add(avg);
                }
        System.out.print(s.size());
            }
        }


