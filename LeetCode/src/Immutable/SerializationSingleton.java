package Immutable;

import java.io.*;

public class SerializationSingleton  implements Serializable {

    private static SerializationSingleton singleton=new SerializationSingleton();

    private SerializationSingleton()
    {

    }
    public static SerializationSingleton getInstance()
    {
        return singleton;
    }

    protected Object readResolve()
    {
        return singleton;
    }
}
class singleFive{
    public static void main(String[] args) {
        SerializationSingleton serializationSingleton = SerializationSingleton.getInstance();
        {
            try {
                ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("Serialization.txt"));
                objectOutput.writeObject(serializationSingleton);
                objectOutput.close();
                //
                ObjectInput in = new ObjectInputStream(new FileInputStream("Serialization.txt"));
                SerializationSingleton serializationSingleton1 = (SerializationSingleton) in.readObject();
                in.close();

                System.out.println(serializationSingleton1.hashCode());
                System.out.println(serializationSingleton.hashCode());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }


}

 class SerializationSingletonTwo  implements Cloneable {

    private static SerializationSingletonTwo singleton=new SerializationSingletonTwo();

    private SerializationSingletonTwo()
    {

    }
    public static SerializationSingletonTwo getInstance()
    {
        return singleton;
    }

    protected Object readResolve()
    {
        return singleton;
    }

    /* @Override
     protected Object clone() throws CloneNotSupportedException {
         throw  new CloneNotSupportedException("cannot ceate clone of singleton");
     }*/
 }
class singleSix{
    public static void main(String[] args) throws CloneNotSupportedException {
        SerializationSingletonTwo serializationSingleton = SerializationSingletonTwo.getInstance();
        //SerializationSingletonTwo serializationSingletonTwo=(SerializationSingletonTwo) serializationSingleton.clone();
        System.out.println(serializationSingleton.hashCode());
       // System.out.println(serializationSingletonTwo.hashCode());
        }
    }



