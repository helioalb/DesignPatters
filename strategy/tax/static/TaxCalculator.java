public abstract class TaxCalculator {
    protected MunicipalTax municipalTax;
    protected StateTax stateTax;

    public double taxAmount(double amount) {
        return municipalTax.calculate(amount) + stateTax.calculate(amount);
    }

    public double totalAmount(double amount) {
        return amount + taxAmount(amount);
    }
}
