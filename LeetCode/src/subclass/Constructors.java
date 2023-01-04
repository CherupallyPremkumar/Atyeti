package subclass;

class Gfg
{
    // constructor
    Gfg()
    {
        System.out.println("Geeksforgeeks");
    }

     Gfg a = new Gfg(); //line 8

    public static void main(String args[])
    {
        Gfg b; //line 12
        b = new Gfg();
    }
}
