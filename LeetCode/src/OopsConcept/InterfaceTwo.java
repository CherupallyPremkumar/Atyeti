package OopsConcept;


class Base extends Exception {}
class Derived extends Base {}
class tst
{
    public static void main(String[] args) {
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e)
        {

        }
        System.out.println("Hello Geeks");
    }
}