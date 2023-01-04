package KeyWords;

public class SuperClass {
     private static int maxSpeed;
     private static  int capcityofvechile ;

    public static int getCapcityofvechile() {
        return capcityofvechile;
    }

    public static void setCapcityofvechile(int capcityofvechile) {
        SuperClass.capcityofvechile = capcityofvechile;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public  void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
 class Bus extends SuperClass
{
    static int maxSpeed ;
     final  int capcityofvechilebus ;
     Bus(Integer value)
     {
         capcityofvechilebus=value;
     }
   final void display(Integer str)  // We cannot use
    {
        super.setMaxSpeed(str);
        System.out.println(super.getMaxSpeed());

    }
    class CarOne
    {
        void capacity(Integer value2)
        {

          Bus.this.display(value2);
          Integer c=capcityofvechilebus;
            System.out.println(capcityofvechilebus);
        }
    }
    public static void main(String[] args) {
       Bus bus =new Bus(22);
      bus.new CarOne().capacity(120);

    }

}

