public class Clothing extends Product {
    private static final double tax_rate=0.10;
    public Clothing(String name, int quantity, double price) {
        super(name, quantity, price);
    }
    public double PriceCalculation() {
        return getQuantity()*getPrice()*(1+tax_rate);
    }
}
