public class printingOddorEven {
 int counter=1;
 static int n;
 public static void main(String[] args){
     n=10;
     printingOddorEven poe=new printingOddorEven();
     Thread t1=new Thread(new Runnable() {
         @Override
         public void run() {
           poe.printOddnumber();

         }
     },"thread-1");
     Thread t2=new Thread(new Runnable() {
         @Override
         public void run() {
             poe.printEvenNumber();
         }
     },"thread-2");
     t1.start();
     t2.start();
 }
 public void printOddnumber()
 {
  while(counter<n){
      if(counter%2!=0)
      System.out.println(Thread.currentThread().getName()+"  "+counter);
      counter++;

  }

 }
 public void printEvenNumber(){

     while(counter<n){
         if(counter%2==0)
             System.out.println(Thread.currentThread().getName()+"  "+counter);
         counter++;

     }
 }

}
