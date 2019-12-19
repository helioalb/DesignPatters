public class Main {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        double tabletAmount = 100000;

        taxCalculator.setStateTax(new SaoPauloTax());
        taxCalculator.setMunicipalTax(new AtibaiaTax());
        System.out.println("Buy at Atibaia: " + taxCalculator.totalAmount(tabletAmount));

        taxCalculator.setStateTax(new ParanaTax());
        taxCalculator.setMunicipalTax(new LondrinaTax());
        System.out.println("Buy at Londrina: " + taxCalculator.totalAmount(tabletAmount));
    }
}
