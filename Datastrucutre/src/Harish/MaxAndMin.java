package Harish;

import java.util.ArrayList;
import java.util.Random;

public class MaxAndMin {
    static ArrayList<Integer> arrayList=new ArrayList<>();
    public static void RandomNumber()
    {
        Random random=new Random();
        for(int i=0;i<7;i++)
        {
           int val= random.nextInt(20);
            arrayList.add(val);
            System.out.println(val);
        }
    }
    public static int maxValue()
    {
        int j=arrayList.get(0);
        for (int i=1;i<arrayList.size();i++)
        {
            if(j<=arrayList.get(i))
              j=arrayList.get(i);
        }
        return j;
    }
    public static int minValue()
    {
        int j=arrayList.get(0);
        for (int i=1;i<arrayList.size();i++)
        {
            if(j>arrayList.get(i))
                j=arrayList.get(i);
        }
        return j;
    }
    public static void main(String[] args) {
        RandomNumber();
        System.out.println( maxValue());
        System.out.println(minValue());
    }


}
