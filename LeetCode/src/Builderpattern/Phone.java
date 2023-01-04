package Builderpattern;

public class Phone {
    private String os;
    private int ram;
    private String pocessor;
    private  double screenSize;
    private int battery;

   Phone(String os, int ram, String pocessor, double screenSize, int battery) {
        this.os = os;
        this.ram = ram;
        this.pocessor = pocessor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", pocessor='" + pocessor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}

