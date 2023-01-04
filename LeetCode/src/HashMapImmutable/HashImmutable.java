package HashMapImmutable;

import java.util.HashMap;
import java.util.Objects;

public class HashImmutable {
    public static void main(String[] args) {
        HashMap<Student,String> s=new HashMap<>();
        Student student=new Student("prem");

        s.put(student,"kumar");

        student.setName("preml");
        System.out.println(s.get(student));
    }
}
class Student
{
    private String name;


    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
