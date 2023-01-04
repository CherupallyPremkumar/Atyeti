package Harish;

public class CostOfStock {
  int findStock(int[] arr,int size)

  {
      int profit=0;



         for(int j=1;j<size;j++)
         {
             if(arr[j]>arr[j-1])
             {
                  profit =profit +(arr[j]-arr[j-1]);

             }
         }
  return profit;
  }




    public static void main(String[] args) {
        int arr[] ={4,2,2,2,4};
        int size=arr.length;

        CostOfStock costOfStock=new CostOfStock();
        int i=costOfStock.findStock(arr,size);
        System.out.println(i);
    }
}
