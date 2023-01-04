package OopsConcept;


// Java Program to Demonstrate Exception is Thrown
// How the runTime System Searches Call-Stack
// to Find Appropriate Exception Handler

// Class
// ExceptionThrown
class GFG {

    // Method 1
    // It throws the Exception(ArithmeticException).
    // Appropriate Exception handler is not found
    // within this method.
    static int divideByZero(int a, int b)
    {

        // this statement will cause ArithmeticException
        // (/by zero)
        int i = a / b;

        return i;
    }

    // The runTime System searches the appropriate
    // Exception handler in method also but couldn't have
    // found. So looking forward on the call stack
    static int computeDivision(int a, int b)
    {

        int res = 0;

        // Try block to check for exceptions
        try {

            res = divideByZero(a, b);
        }

        // Catch block to handle NumberFormatException
        // exception Doesn't matches with
        // ArithmeticException
        catch (NumberFormatException ex) {
            // Display message when exception occurs
            System.out.println(
                    "NumberFormatException is occurred");
        }
        return res;
    }

    // Method 2
    // Found appropriate Exception handler.
    // i.e. matching catch block.
    public static void main(String args[])
    {

        Throwable obj = new Throwable("Sample");
        int a = 1;
        int b = 0;

        // Try block to check for exceptions
        try {
            throw obj;

        }

        // Catch block to handle ArithmeticException
        // exceptions
        catch (Throwable ex) {

            // getMessage() will print description
            // of exception(here / by zero)
            System.out.println(ex.getSuppressed());
        }
    }
}
class ArithmeticException_Demo
{
    public static void main(String args[])
    {
        try {
            try {
                int arr[] = {1, 2, 3, 4};
                int a = 30, b = 0;
                System.out.println(arr[5]);
                int c = a / b;

                System.out.println("Result = " + c);
            } catch(ArithmeticException e) {
                System.out.println ("Can't divide a number by 0");
            }
        }

        catch(Throwable e) {
            System.out.println ("Error");
        }
    }
}
class NullPointer_Demo
{
    public static void main(String args[])
    {
        try {
            String a = null;
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }
}
class LessThan extends Exception
{
    LessThan(String str )
    {
        super(str);
    }
}
class MyException
{
    private static int accno[] = {1001, 1002, 1003, 1004};
    private static String name[] = {"Nish", "Shubh", "Sush", "Abhi", "Akash"};
    private static double bal[] = {10000.00, 12000.00, 5600.0, 999.00, 1100.55};
    public static void main(String[] args)
    {
        try  {
            for (int i = 0; i < 5 ; i++)
            {
                System.out.println(accno[i]+" " + name[i] + " " +bal[i]);
                if (bal[i] < 1000)
                {
                    LessThan me =
                            new LessThan("Balance is less than 1000");
                    throw me;
                }
            }
        }
        catch (LessThan e) {
            e.printStackTrace();
        }
    }
}