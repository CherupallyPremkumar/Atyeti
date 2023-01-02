package Arrays;

import Datastructure.TestOne;

 class TestTwo  {



}

 class JavaExceptionHandlingQuiz
{
    public static void main(String[] args)
    {
        try
        {
            try
            {
                try
                {
                    String s = args[0];
                }
                catch (NullPointerException e)
                {
                    System.out.println(1);
                }
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(2);
            }
        }
        catch (Exception e)
        {
            System.out.println(3);
        }

    }
}