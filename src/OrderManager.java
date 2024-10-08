import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class OrderManager {
    List<Product> products;
    public OrderManager() {
        products = new ArrayList<>();
    }
    public void addProduct(Product p) {
        products.add(p);
    }
    public List<Product> getProducts() {
        return products;
    }
    public void printProducts() {
        System.out.println("Name                  | Quantity                 | Price          ");
        for (Product p : products) {
            int s= p.getName().length();

            System.out.print(p.getName());
            for(int i=0; i<25-s;i++)
            {
                System.out.print(" ");
            }
            System.out.println(p.getQuantity()+"                        "+ p.getPrice());
        }

    }

    public void SortProduct() {
        Collections.sort(products, Comparator
                .comparing(Product::PriceCalculation)
                .thenComparing(Product::getName)
                .thenComparing(Product::getQuantity));
    }

}

