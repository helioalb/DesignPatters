public abstract class Car {
    protected Fuel fuel;
    protected Motor motor;

    public abstract String getMotor();
    public abstract String getFuel();

    public double autonomy(double litres) {
        return fuel.efficiency(motor.kmsByLitre(litres));
    }

    public abstract String name();
    public abstract String fuel();
}
