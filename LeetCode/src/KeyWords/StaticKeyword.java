package KeyWords;
//
 class Car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    static {
        System.out.println("executed static block");
    }
    static  void color(Integer n)
    {
        System.out.println("Enter ststic method");

    }/*
    void color()
    {

    }*/

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getEngine() {
         return engine;
     }

     public void setEngine(String engine) {
         this.engine = engine;
     }


     // getters and setters
}
class Inte extends Car
{

    public Inte(String name, String engine) {
        super(name, engine);
    }
    static  void  color()
    {

    }
    public static void main(String[] args) {
        Inte car=new Inte("aa" ,"cc");
        Car car1=new Car("aa" ,"cc");
        Car car2=new Inte("aa","dd");
        System.out.println(car1.getName() +" " +car1.getEngine()+ " "+ Car.numberOfCars);
        car.color();
        System.out.println();

    }
}