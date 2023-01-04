import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode
{
    public static void main(String[] args) {
        Integer[] nt={1,2,3,4};
      Leet leet=new Leet();
      Integer[] leets=leet.AddArray(nt);
        for (int i:leets) {
            System.out.println(i);
        }
    }
}
class Leet{
    public  Integer[] AddArray(Integer[] intt){



        for(Integer i=1; i<intt.length;i++){
            intt[i] += intt[i-1];
        }


        return intt;


    }
}
