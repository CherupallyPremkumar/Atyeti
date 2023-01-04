package Immutable;

import java.util.ArrayList;
import java.util.List;

final class ImmutableUsingDS {
    private final String name;
    private final String college;
    private final List<Integer> rollNO;



    public ImmutableUsingDS(String name, String college, List<Integer> rollNO) {
        this.name = name;
        this.college = college;
        this.rollNO = rollNO;
    }

    public String getName() {
        return name;
    }

    public String getCollege() {
        return college;
    }

    public List<Integer> getRollNO() {
        return new ArrayList<>(rollNO);
    }

    @Override
    public String toString() {
        return "ImmutableUsingDS{" +
                "name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", rollNO=" + rollNO +
                '}';
    }
}
class CheckingImmutableclass
{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(123);
        ImmutableUsingDS immutableUsingDS=new ImmutableUsingDS("prem","sreyas",list);
        System.out.println(immutableUsingDS.toString());
        immutableUsingDS.getRollNO().remove(1);
        System.out.println(immutableUsingDS.toString());
    }
}