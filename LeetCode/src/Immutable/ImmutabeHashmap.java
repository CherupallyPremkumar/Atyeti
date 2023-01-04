package Immutable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

final class ImmutableUsingDShash {
    private final String name;
    private final String college;
    private final HashMap<Student,String> hashMap;



    public ImmutableUsingDShash(String name, String college, HashMap<Student,String> hashMap) {
        this.name = name;
        this.college = college;
        this.hashMap = hashMap;
    }

    public String getName() {
        return name;
    }

    public String getCollege() {
        return college;
    }

    public HashMap<Student,String> getRollNO() {
        return new HashMap<>(hashMap);
    }

    @Override
    public String toString() {
        return "ImmutableUsingDS{" +
                "name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", rollNO=" + hashMap +
                '}';
    }
}
class CheckingImmutableHashmap
{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(123);
        ImmutableUsingDS immutableUsingDS=new ImmutableUsingDS("prem","sreyas",list);
        System.out.println(immutableUsingDS.toString());
      //  immutableUsingDS.getRollNO().remove(1);
        System.out.println(immutableUsingDS.toString());
    }
}