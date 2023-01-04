package multithread;
class threads implements  Runnable
{
    int threadnum;
    threads(int threadnum){
        this.threadnum=threadnum;
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println(i +" from " +threadnum);
            if(threadnum==2)
            {
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class multiple {
    public static void main(String[] args) throws InterruptedException {
     threads threads1=new threads(1);
     Thread t=new Thread(threads1);
     t.start();
     t.join();
        threads threads2=new threads(2);
        Thread t1=new Thread(threads2);
        t1.start();
        t1.join();
    }

}
