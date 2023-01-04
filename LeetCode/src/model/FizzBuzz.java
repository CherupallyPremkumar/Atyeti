package model;

public class FizzBuzz
{
    public static void main(String[] args) {
        System.out.println(Buzz.fizz());


        }
    }

class Buzz{
     public static int fizz(){

       try {
           System.out.println(10/0);
         return 1;
       }catch(Exception e){
           return 2;
         }finally {
           System.exit(0);
           return 3;
       }
    }
}
