package subclass;

class Gfg1
{
    static int num;
    static String mystr;

    // constructor
    Gfg1()
    {
        num = 100;
        mystr = "Constructor";
    }

    // First Static block
    static
    {
        System.out.println("Static Block 1");
        num = 68;
        mystr = "Block1";
    }

    // Second static block
    static
    {
        System.out.println("Static Block 2");
        num = 98;
        mystr = "Block2";
    }

    public static void main(String args[])
    {
        //Gfg1 a = new Gfg1();
        System.out.println("Value of num = " + num);
        System.out.println("Value of mystr = " + mystr);
    }
}
