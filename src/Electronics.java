public class Electronics extends Product {
    private static final double tax_rate= 0.15;
    public Electronics(String name, int quantity, double price) {
        super(name,quantity,price);
    }

    @Override
    public double PriceCalculation() {
        return getQuantity()*getPrice()*(1+tax_rate);
    }
}
