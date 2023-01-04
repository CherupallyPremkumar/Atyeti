package Immutable;
//Eager Instantiation of Single ton classs
class Singleton {
      static Singleton s=new Singleton();
      // when class is loaded the object creation is done and space is occupied , and any class can access this
    //object
    //if we are not using it still object is created ,this is draw back of Eager Instantiation
      private Singleton()
      {
          System.out.println("object created");
    //  private constructor to stop calling directly ,if you call directly we can create multiple instance for that class
      }
     public static Singleton getInstance()
      {

          return s;
      }
      static void method()// as you can see hear that object is created with out calling get instance
     {
        System.out.println(s.hashCode());
     }
}

class Single {
    public static void main(String args[])
    {
      Singleton.method(); //calling static method to verify weather object is created or not
     // Singleton singleton=Singleton.getInstance();
    }
}

//Lazy Instantiation of Single ton classs

class SingletonTwo {

    public static SingletonTwo obj;
    private SingletonTwo()
    {

    }
    public static SingletonTwo getInstance()
    {
      /*  obj =new SingletonTwo();//this is also draw back everytime we call getinstance it will create new object
        // than we lost singleton class creation
        return obj;*/

        if(obj==null)// this will satisfy the singleton class design
            //when ever you call this method it will check weather the object is created are not if yes it wont create one more
            // object it will return same instance .
        {
            obj =new SingletonTwo();
        }
        return obj;
    }
}
class SingleTwo {
    public static void main(String args[])
    {
        SingletonTwo singleton=SingletonTwo.getInstance();//in this program only one thread is running that is main thread it will run one by one
        // there is no drawback
        SingletonTwo singleton1=SingletonTwo.getInstance();//here there is another drawback
        //this is not thread safe because if simultaneously call get instance at atime then it might create two object for
        //different
    }
}

//Synchroized Getinstance

class SingletonThree{

    public static SingletonThree obj;
    private SingletonThree()
    {
        System.out.println("instance created");
    }
    // there us  drawback of using synchronized keyword , it will decrease the performance og the program
    public synchronized static  SingletonThree getInstance()  // make method synchronixed only one thread will acces this method.
    {
      /*  obj =new SingletonTwo();//this is also draw back everytime we call getinstance it will create new object
        // than we lost singleton class creation
        return obj;*/

        if(obj==null)// this will satisfy the singleton class design
        //when ever you call this method it will check weather the object is created are not if yes it wont create one more
        // object it will return same instance .
        {
            obj =new SingletonThree();
        }
        return obj;
    }
}
class SingleThree {
    public static void main(String args[])
    {
        // this is the draw back of program creating two instances
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonThree singleton=SingletonThree.getInstance();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonThree singleton1=SingletonThree.getInstance();
            }
        });
        t1.start();
        t2.start();
    }
}

// Double checked Locking

class SingletonFour{

    public static SingletonFour obj;
    private SingletonFour()
    {
        System.out.println("instance created");
    }
    // there us  drawback of using synchronized keyword , it will decrease the performance og the program
    public synchronized static  SingletonFour getInstance()  // make method synchronixed only one thread will acces this method.
    {
      /*  obj =new SingletonTwo();//this is also draw back everytime we call getinstance it will create new object
        // than we lost singleton class creation
        return obj;*/

        if(obj==null)// this will satisfy the singleton class design
        //when ever you call this method it will check weather the object is created are not if yes it wont create one more
        // object it will return same instance .
        { // one thread will enter into two threads at a time
            synchronized (SingletonFour.class) {
                if(obj ==null) {
                    obj = new SingletonFour();
                }
            }
        }
        return obj;
    }
}
class SingleFour {
    public static void main(String args[])
    {
        // this is the draw back of program creating two instances
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonFour singleton=SingletonFour.getInstance();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonFour singleton1=SingletonFour.getInstance();
            }
        });
        t1.start();
        t2.start();
    }
}

//Enum SingleTon Design Pattern This will work above 1.5 java version
/*class Phone
{
    public static final Phone APPLE=new Phone();
    int i=0;
}*/
interface  Book{

}
interface  Pen{}
enum Color implements Book,Pen
{
    APPLE,
    RED,
    Sony;

    int a=23;

   private Color()
   {
       System.out.println("enetrr color ");
   }


}

class callPhone
{

    public static void main(String[] args) {

        Color sony = Color.Sony;
        System.out.println(sony.ordinal());
        System.out.println(Color.valueOf("RED"));
        System.out.println(sony.a);
       /* switch (apple)
        {
            case RED -> System.out.println("red");
            case APPLE -> System.out.println("apple");
        }
        System.out.println(apple.a);*/
    }
}