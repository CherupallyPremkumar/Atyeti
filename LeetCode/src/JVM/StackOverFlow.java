package JVM;

import javax.swing.*;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.Arrays;

class stackOverflow {
    static int i = 0;
    public static int printNumber(int x)
    {
        i = i + 2;
        System.out.println(i);
        if (i == 10)
            return i;
        return i + printNumber(i + 2);
    }
    public static void main(String[] args)
    {
        stackOverflow.printNumber(i);
    }
}
 class StackOverflowErrorExample {
    public void print(int myInt) {
        System.out.println(myInt);
        print(myInt);
    }
    public static void main(String[] args) {
        StackOverflowErrorExample soee = new StackOverflowErrorExample();
        soee.print(0);
    }
}
 class CrunchifyGenerateOOM {

    public static void main(String[] args) throws Exception {
        CrunchifyGenerateOOM memoryTest = new CrunchifyGenerateOOM();
        memoryTest.generateOOM();
    }
    public void generateOOM() throws Exception {
        int iteratorValue = 20;
        System.out.println("\n=================> OOM test started..\n");
        for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
            System.out.println("Iteration " + outerIterator + " Free Mem: " + Runtime.getRuntime().freeMemory());
            int loop1 = 2;
            int[] memoryFillIntVar = new int[iteratorValue];
            do {
                memoryFillIntVar[loop1] = 0;
                loop1--;
            } while (loop1 > 0);
            iteratorValue = iteratorValue * 5;
            System.out.println("\nRequired Memory for next loop: " + iteratorValue);
            Thread.sleep(1000);
        }
    }
}
class NoGCMEmoryLeak {
    public static ArrayList<String> list =new ArrayList<>();
   /* @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }*/
    public static void main(String[] args) throws Throwable {

        System.out.println("starting");
        NoGCMEmoryLeak g=new NoGCMEmoryLeak();
        while(true)
        {
            for(int i=0 ;i<1000;i++)
            {
                list.add(""+i);
                String a =list.get(i);
                a=null;
            }
            if(calculatePercentageMemory()>85){
                System.out.println("Over 85% utilization ");
              // list.clear();
           System.gc();
                JOptionPane.showMessageDialog(null ,"List Cleard");
            }
        }
    }
    public static long calculatePercentageMemory(){

        MemoryMXBean memoryMXBean= ManagementFactory.getMemoryMXBean();
        MemoryUsage heapUsage =memoryMXBean.getHeapMemoryUsage();
        long maxMemory =heapUsage.getMax() / (1024*1024);
        long usedMemory =heapUsage.getUsed() / (1024 *1024);
        long percentageUsed = (long) (100.0 * ((1.0 * usedMemory)/(1.0*maxMemory)));
        System.out.println("used vs MAx MEmory : " + usedMemory + "M/" +maxMemory +"M " +percentageUsed + "%List size : " +list.size());
        return percentageUsed;
    }
}