package Immutable;

//immutable class because there is no getter and setter  the variable can be changable

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// if we dont mention final infront of class still it is imuutable but there is a drawback
// we can inherit the functionality of immutable Drawback class
  class  ImmutabeDrawback {

    private final String name;

    public ImmutabeDrawback(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImmutabeDrawback)) return false;
        ImmutabeDrawback that = (ImmutabeDrawback) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

//mutable class
class Extending extends ImmutabeDrawback
{
     private  String name;

    public Extending(String name) {
        super(name);
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Extending)) return false;
        if (!super.equals(o)) return false;
        Extending extending = (Extending) o;
        return Objects.equals(name, extending.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
class meth{
    public static void main(String[] args) {
        Extending extending=new Extending("prem");

        ImmutabeDrawback immutabeDrawback=extending;

        HashMap<ImmutabeDrawback,String>  map = new HashMap<>();//prem =india
        map.put(immutabeDrawback,"India");
      extending.setName("Premkumar");
        System.out.println(map.get(immutabeDrawback));






    }
}