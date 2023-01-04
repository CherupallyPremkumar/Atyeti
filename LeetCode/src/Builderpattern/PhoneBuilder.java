package Builderpattern;

public class PhoneBuilder {
    private String os;
    private int ram;
    private String pocessor;
    private  double screenSize;
    private int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setPocessor(String pocessor) {
        this.pocessor = pocessor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    public Phone getPhone()
    {
        return new Phone(os,ram,pocessor,screenSize,battery);
    }


}
