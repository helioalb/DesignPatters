public class BuyAtAtibaia extends TaxCalculator {
    public BuyAtAtibaia() {
        stateTax = new SaoPauloTax();
        municipalTax = new AtibaiaTax();
	}
}
