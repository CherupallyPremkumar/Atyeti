package model;

public class StaicAndFinal {

    private void subarray(int[] numbers, int k) {

        int exitvalue=0;
        int length=numbers.length;
        for(int i=0;i<length;i++){
            int value = numbers[i];
            for (int j= i+1;j<length;j++){
                value=value*numbers[j];
                if(value<=k)
                    exitvalue++;
            }
            if(numbers[i]<k)
            {
                exitvalue++;
            }
        }
        System.out.println(exitvalue);
        }


        public static void main(String[] args)
        {
            int k=6;
        int[] numbers=new int[3];
        numbers[0]=2;
            numbers[1]=3;
            numbers[2]=4;
            StaicAndFinal staicAndFinal=new StaicAndFinal();
            staicAndFinal.subarray(numbers,k);

        }


    }





