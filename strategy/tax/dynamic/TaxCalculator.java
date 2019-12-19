public class TaxCalculator {
    private StateTax stateTax;
    private MunicipalTax municipalTax;

    public void setStateTax(StateTax stateTax) {
        this.stateTax = stateTax;
    }
    
    public void setMunicipalTax(MunicipalTax municipalTax) {
        this.municipalTax = municipalTax;
    }

    public double taxAmount(double amount) {
        return municipalTax.calculate(amount) + stateTax.calculate(amount);
    }

    public double totalAmount(double amount) {
        return amount + taxAmount(amount);
    }
}
