package Immutable;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 class Student {
  private String name;  // variable are not final thats why when ever constructor called new value be added to that variable
     // make it final to the variable to become immutable class
  private int number;


     public Student(String name, int number) {
         this.name = name;
         this.number = number;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {// because of setter method class become mutable class to change this to immutable class
         // remove setter method
         this.name = name;
     }

     public int getNumber() {
         return number;
     }

     public void setNumber(int number) {
         this.number = number;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", number=" + number +
                 '}';
     }
 }


 class  ExtendsImmutableClass extends  Student {
     private String name_two;
     public ExtendsImmutableClass(String name, int number) {
         super(name, number);
     }

     public String getName_two() {
         return name_two;
     }

     public void setName_two(String name_two) {
         this.name_two = name_two;
     }
 }


class SingleOne {
    public static void main(String[] args)
    {
    Student student=new Student("aa",1);
   // HashMap<Student,String>
        System.out.println(student.toString());
        student.setNumber(2);// because set method the values has been changed
        student.setName("prem");

        System.out.println(student.toString());

    }
}
// Removing Setter method
 final class StudentTwo {
    final private String name;  // i have made changes to variable to final , now the values cannot change its value
   final private int number;
    final private   HashMap<String,String> stringStringHashMap;


    public StudentTwo(String name, int number, HashMap<String, String> stringStringHashMap) {
        this.name = name;
        this.number = number;
        this.stringStringHashMap = stringStringHashMap;

    }
    public String getName() {
        return name;
    }


  /*  public void setName(String name) {//
        // now setter raising compiler error that for final variable we cannot use setter method because cant  be changable
        this.name = name;
    }*/

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "StudentTwo{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", stringStringHashMap=" + stringStringHashMap +
                '}';
    }

    public HashMap<String, String> getStringStringHashMap() {
        return new HashMap<>(stringStringHashMap);// returning cloned version of hashobject to the user
        // when ever they try to change the value of hash map it wont reflect in the immutable class (StudentTwo)
    }

/*
    public void setNumber(int number) {
        this.number = number;
    }
*/


}
class A
{

    private int pincode;
    private  String area;
    private String nameofColony;

    public A(A address)
    {

        this(address.getPincode(), address.getArea(), address.getNameofColony());
    }

    public A(int pincode, String area, String nameofColony) {
        this.pincode = pincode;
        this.area = area;
        this.nameofColony=nameofColony;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "A{" +
                "pincode=" + pincode +
                ", area='" + area + '\'' +
                '}';
    }

    public String getNameofColony() {
        return nameofColony;
    }

    public void setNameofColony(String nameofColony) {
        this.nameofColony = nameofColony;
    }
}
class ImmutableTwo{
    public static void main(String[] args)
    {
        HashMap<String,String> str=new HashMap<>();
        str.put("prem" ,"kumar");
        StudentTwo studentTwo=new StudentTwo("prem",201,str);
        HashMap<StudentTwo,String> s=new HashMap<>();

      //prem 201 premkumar
        s.put(studentTwo,"kumar");
       // studentTwo.
        System.out.println(s.get(studentTwo));
 /*       List<Integer> list=new ArrayList<>();
       int i =20;
        while (i>10){
            list.add(i);
            list.add(i-1);
            i--;
        }
        Set<Integer> set=new HashSet<>();
        System.out.println(list);
     list.stream().findFirst().ifPresent(System.out::println);
        System.out.println(set);*/







     /*
        HashMap<StudentTwo,String> s=new HashMap<>();
        Runtime.getRuntime();
        A a=new A(1,"hyderabad","kothapet");
        StudentTwo student=new StudentTwo("aa",1, a, stringStringHashMap);
        System.out.println(student.toString());

        A a1=student.getA();
        a1.setPincode(12);
        System.out.println(a1.toString());

        System.out.println(student.toString());
     *//*   student.setNumber(2);// Now there no option to setting vaues to the final variable
        student.setName("prem");*//*
   //A a=new A();

       // System.out.println(student.toString());*/

    }
}