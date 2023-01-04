package subclass;


    class Test1 {
      public int x, y;
    }
    class Main1 {
      public static void main(String args[]) {
        Test1 t = new Test1();
        System.out.println(t.x + " " + t.y);
      }
    }
    class XXX {
      public static void main(String args[]) {
        System.out.println(fun());
      }

      static int fun() {
        return 20;

      }
    }
/*class Test1 {
  public static void main(String args[]) {
    System.out.println(fun());
  }
  static int fun() {
    static int x= 0;
    return ++x;
  }
}*/

class Test11 {
  private static int x;
  public static void main(String args[]) {
    System.out.println(fun());
  }
  static int fun() {
    return ++x;
  }
}
//base
//Derived
//DErived


