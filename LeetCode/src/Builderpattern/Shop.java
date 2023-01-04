package Builderpattern;

public class Shop {
    public static void main(String[] args) {
        Phone p=new PhoneBuilder().setOs("andriod").getPhone();
        System.out.println(p.toString());
    }
}
