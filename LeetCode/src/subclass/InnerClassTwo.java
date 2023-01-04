package subclass;

class Outer1 {
    void outerMethod() {
        final int x=98;
        System.out.println("inside outerMethod");
       final class Inner {
            void innerMethod() {
                System.out.println("x = "+x);
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}
class MethodLocalVariableDemo {
    public static void main(String[] args){
        Outer1 x = new Outer1();
        x.outerMethod();
    }
}

