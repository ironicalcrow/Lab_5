public class Furniture extends Product{
    private static final double tax_rate=0.08;
    public Furniture(String name, int quantity, double price) {
        super(name,quantity,price);
    }
    public double PriceCalculation() {
        return getQuantity()*getPrice()*(1+tax_rate);
    }
}
