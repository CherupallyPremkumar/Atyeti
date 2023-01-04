package OopsConcept;

public class Interface extends MotorTwo{


    public static void main(String[] args) {

    MotorOne m=new Fruits() {
        @Override
        int apple() {
            return 0;
        }
    };
    m.bike();


    }


}

 interface MotorOne
{
      void bike();
     static void car(){
        System.out.println("car");
    }
}
interface One extends MotorOne {
    void bike();
}


class MotorTwo implements One{



    public void bike() {
        System.out.println("in");
    }
}


abstract class Fruits extends MotorTwo {
    abstract int apple();
    void banana()
    {
        System.out.println("banaana");
    }
    @Override
    public void bike() {
        super.bike();
        System.out.println("in a b");
    }
}