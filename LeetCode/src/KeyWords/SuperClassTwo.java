/*
package KeyWords;

public class SuperClassTwo {
  final static Integer L =00;
    void message() { System.out.println("super class message");}
    SuperClassTwo(Integer str)// IF you declared Parameterized consturctor in super class must and
            // should need to implement in Subclass
    {
    }
    static void paid()
    {
    }
}
class Student extends  SuperClassTwo
{
    static final Integer L =00;
    Student(Integer str) {
        super(str);
    }
    */
/* Student()
        {
    // super class Constructed get called
        }*//*

    void message()
    {
       super.message();
        System.out.println("subclass Method"+super.L);
    }
    static void mes()
    {
        System.out.println("dfsfs");
    }
   final void display()// static methd will not support super and this keyword
    {
        message();
        paid();
        super.message();
        this.mes();

    }
    public static void main(String[] args) throws Throwable {

        Student s=new Student(1);
        s.finalize();
        try
        {
           int  a=1/0;
        }catch (Throwable a)
        {
           System.
        }finally {
            System.out.println("prem"
            );
        }
    }

}
*/
