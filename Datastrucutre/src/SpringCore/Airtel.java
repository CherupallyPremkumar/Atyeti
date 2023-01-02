package SpringCore;

public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("Airtelcalling");
    }

    @Override
    public void data() {
        System.out.println("Aritel Data");
    }
}
