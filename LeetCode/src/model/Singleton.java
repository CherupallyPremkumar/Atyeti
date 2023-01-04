package model;

import java.util.logging.LogManager;

public class Singleton  extends  Thread{
    private static Singleton instance;

    private Singleton()
    {
        // private constructor
    }

    public static Singleton getInstance()
    {
        if (instance == null)
        {
            //synchronized block to remove overhead
            synchronized (Singleton.class)
            {
                if(instance==null)
                {
                    // if instance is null, initialize
                    instance = new Singleton();
                }

            }
        }
        return instance;
    }
}
class Single
{
    public static void main(String[] args) {




        Singleton x=Singleton.getInstance();
        Singleton y=Singleton.getInstance();
        System.out.println( "HahsCode "+ x.hashCode());
        System.out.println( "HahsCode "+ y.hashCode());
    }
}
