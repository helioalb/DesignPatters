public class FordX extends Car {
    public FordX() {
        fuel = new Alcohol();
        motor = new Motor1();
    }

    public String name() {
        return "Ford X";
    }

    public String fuel() {
        return "Alcohol";
    }
}
