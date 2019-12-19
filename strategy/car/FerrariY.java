public class FerrariY extends Car {
    public FerrariY() {
        fuel = new Gasoline();
        motor = new Motor2();
    }

    public String name() {
        return "Ferrari X";
    }

    public String fuel() {
        return "Gasoline";
    }
}
