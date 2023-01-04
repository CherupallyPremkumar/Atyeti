import java.util.Arrays;

public class Wealth {
    public static void main(String[] args) {

        WealthBank wealthBank=new WealthBank();
        Integer[][] integers=new Integer[2][3];
        integers[0][0] =1;
        integers[0][1] =1;
        integers[0][2] =1;
        integers[1][0] =1;
        integers[1][1] =3;
        integers[1][2] =4;


Integer integer=         wealthBank.wealth(integers);
        System.out.println(integer);

    }
}
class  WealthBank{
    Integer wealth(Integer[][] bank){

      int wealthsofar=0;
       for(Integer[] customer: bank)
        {
            System.out.println(Arrays.deepToString(customer));
            int currentcustomer=0;
            for (int accounts:customer){
                System.out.println(accounts);
                currentcustomer+=accounts;
            }
            wealthsofar=Math.max(wealthsofar,currentcustomer);

        }
       /* int wealthsofar=0;
        for(int i=0;i<bank.length;i++)
        {
            int current=0;
            for (int j=0;j<bank[i].length;j++)
            {
                current+=bank[i][j];
            }
            wealthsofar=Math.max(wealthsofar,current);
        }*/
return wealthsofar;
    }
}
