public class SaoPauloTax implements StateTax {
    public double calculate(double amount) {
        return amount * 0.5;
    }
}
