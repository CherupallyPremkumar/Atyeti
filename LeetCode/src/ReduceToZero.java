public class ReduceToZero {
    public static void main(String[] args) {
        NumberToZero numberToZero=new NumberToZero();
        numberToZero.zero(8);

    }
}
class NumberToZero{
    public void zero(Integer iinteger)
    {

        Integer n=iinteger;

         Integer m=0;
       while(n>=1){

            if (n % 2 == 0) {
                n=  n / 2;
                m=m+1;


            } else {
                n =  n - 1;
                m=m+1;

            }

        }
        System.out.println(m);


    }
}
