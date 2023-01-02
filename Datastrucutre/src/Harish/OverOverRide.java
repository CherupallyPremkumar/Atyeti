/*
package Harish;


//static keyword is used for class level ,when ever we run the proogram at the time of class loading staticblock will execute first
//final its constant value : We cannot change the value of final variable
//we cannot override the method and we cannot inherit the final class
//Super keyword is used to access super class Object ,super keyword cannot use in the static block
//this keyword is used to the current class Object , this keyword cannot use in the static blocks and methoods
//public keyword is access modifier its used for classes and methods variabble and constructors make them accesible for any other classes
//private keyword is also a access modifier , this cant be accesible any other classess,
//it can accessible with the class
//protected keyword is also a access modifer ,it can accessibe with in the same package
//default is aslo accessible modifer ,if the use doesnt assign any access modifier ,to the class by deafault java will asign deafult keyword
// extends keyword is used to inherits the propertes of super class to subclass
//implements keyword is used to implements the interface and abstract class in the sub classes
interface  TestInterface
{
    void shop();
    void cheppal();
    void run();


     static void shoe(){
         System.out.println("interface Shoe");
        // this.shop();
    }
    default void socks()
    {

    }


}
 abstract class TestSuper
{
   private TestSuper()
    {

    }
     abstract void run();
   protected void dress()
   {

   }
  public void dress(String mensWear)
   {

   }
    public void dress(String mensWear,String wintermensWear)
    {

    }
    public void dress(Integer womenWear)
    {

    }

   public void Electronics()
   {

   }

}
 class OverOverRide  extends TestSuper implements TestInterface{

    private  int value;

    {

    }
    static {

    }



    @Override
    public void dress(String mensWear,String wintermensWear)
    {

    }
    public OverOverRide()
    {
      //  super();
        this.value=value;
    }

    @Override
    public void shop() {

    }

    @Override
    public void cheppal() {

    }

    @Override
    public void run() {

    }

    */
/* @Override
       private void dress()
        {// private methods cannot be override
           // dressmethod clashes with super class method assign weaker acces modifier in the subclass -need to be public
        }*//*

*/
/*    @Override
    protected int dress()
    {
// dressmethod clashes with super class method assign weaker acces modifier in the subclass -need to be public
        //vicecersa it will work fine if you assign public in subclass ,proctedted is assigned to the super class method
        // there is no restriction to the subclass\
        // It will work fine if we keep the same acces modifer "protected" to the methods of super and subclass
        // different return type for override method will clashes with the super class
    }*//*

    @Override
    public void socks()
    {

    }

   */
/* public static void dress(Integer womensWear)
    {
    // It will give an Error subclass  static method cannot override super class non static method
        }*//*


    public static void main(String[] args) {
        new OverOverRide(1);
        TestInterface.shoe();
    }



}*/
