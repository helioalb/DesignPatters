public class Main {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = null;

        double tabletAmount = 100000;

        taxCalculator = new BuyAtAtibaia();
        System.out.println(taxCalculator.totalAmount(tabletAmount));

        taxCalculator = new BuyAtLondrina();
        System.out.println(taxCalculator.totalAmount(tabletAmount));
    }
}
