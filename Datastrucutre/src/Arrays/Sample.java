package Arrays;

interface Math
{
    public void show();
}
class MathTwo implements Math
{
   public void show()
   {

   }


}

public class Sample {
    public static void main(String[] args) {
        Math math=new MathTwo();
        math.show();

    }
}
