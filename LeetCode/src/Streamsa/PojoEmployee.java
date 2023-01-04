package Streamsa;

import java.util.Date;

public class PojoEmployee {


    private Integer id;
    private String name;
    private Integer age;

    private Date date;
    private String Gender;

    public PojoEmployee(Integer id, String name, Integer age, Date date, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.date = date;
        Gender = gender;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "PojoEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
