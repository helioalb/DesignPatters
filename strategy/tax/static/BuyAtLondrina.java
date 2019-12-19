public class BuyAtLondrina extends TaxCalculator {
    public BuyAtLondrina() {
        stateTax = new ParanaTax();
        municipalTax = new LondrinaTax();
    }
}
