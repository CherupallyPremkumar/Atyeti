package subclass;

import javax.swing.tree.TreeNode;
import java.util.TreeMap;

public class Test {
    public static void main(String args[]) {
        Point p = new Point();
        System.out.println("x = " + p.x + ", y = " + p.y);
    }
}
class Point {
    protected int x, y;

    public Point(int _x, int _y)
    {
        x = _x;
        y = _y;
    }

    public Point() {

    }
}

// Class 1
// Helper class
class TestOne {

    // Constructor of this class
    TestOne(int x)
    {

        // Print statement whenever this constructor is
        // called
        System.out.println("Constructor called " + x);
    }
}

// Class 2
// Class contains an instance of Test1
// Main class
class Test2 {

    // Creating instance(object) of class1 in this class
    TestOne t1 = new TestOne(10);

    // Constructor of this class
    Test2(int i) { t1 = new TestOne(i); }

    // Main driver method
    public static void main(String[] args)
    {
        // Creating instance of this class inside main()
        Test2 t2 = new Test2(5);
    }
}
class Base {
    protected void foo() {}
}
class Derived extends Base {
   protected void foo() {}
}
// Main.java
 class Main
{
    public static void main(String args[])
    {

    }
} //end class
