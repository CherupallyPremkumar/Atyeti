package KeyWords;

abstract class FinalKeyword {
    static int WEIGHT;
    static int grams;
    // abstract   void m1();
    void method()
    {

    }

}

class A extends FinalKeyword {
    //final static int WEIGHT ;
    static int WEIGHT;
    A()
    {
        //int i;
        this(1);//must and should this is first statement in the constructor
    }
    A(int str) {
        super();
        super.WEIGHT = str;
    }


      void m1(A a) {

    }

   final void method() {
        //WEIGHT=12;
       this.method1(this);
        System.out.println(WEIGHT);
    }
    static void method1(A str)
    {
        grams=12;

        System.out.println(grams
        );
    }
}

class Black {
    public static void main(String[] args) {
       A a = new A();
       a.m1(a);

    }
    //compiler error because final class a=cannot be overirde
}
