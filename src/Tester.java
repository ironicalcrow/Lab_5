import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {
    @Test
    public void test1() {
        Product electronics= new Electronics("Hair Dreyer Dove", 2, 2040);
        double price= electronics.PriceCalculation();
        assertEquals(4692, price);
    }
    @Test
    public void test2() {
        Product clothing= new Clothing("Gucci",50, 570);
        double price= clothing.PriceCalculation();
        assertEquals(570*50*1.1, price);
    }
    @Test
    public void test3() {
        Product furniture= new Furniture("Joshim Furniture King Bed",8, 480);
        double price= furniture.PriceCalculation();
        assertEquals(480*8*1.08, price);
    }
    @Test
    public void test4() {
        Product electronics= new Electronics("Hair Dreyer Dove", 2, 2040);
        OrderManager orderManager= new OrderManager();
        orderManager.addProduct(electronics);
        List<Product> p= new ArrayList<>();
        p= orderManager.getProducts();
        assertEquals(electronics,p.get(0));
    }
    @Test
    public void test5() {
        Product electronics= new Electronics("Hair Dreyer Dove", 2, 2040);
        Product clothing= new Clothing("Gucci",50, 570);
        Product furniture= new Furniture("Joshim Furniture King Bed",8, 480);
        OrderManager orderManager= new OrderManager();
        orderManager.addProduct(electronics);
        orderManager.addProduct(clothing);
        orderManager.addProduct(furniture);
        List<Product> p= new ArrayList<>();
        p= orderManager.getProducts();
        assertEquals(clothing,p.get(1));

    }
    @Test
    public void test6() {
        Product electronics= new Electronics("Hair Dreyer Dove", 2, 2040);
        Product clothing= new Clothing("Gucci",50, 570);
        Product furniture= new Furniture("Joshim Furniture King Bed",8, 480);
        OrderManager orderManager= new OrderManager();
        orderManager.addProduct(electronics);
        orderManager.addProduct(clothing);
        orderManager.addProduct(furniture);
        List<Product> p= new ArrayList<>();
        p= orderManager.getProducts();
        assertEquals(3,p.size());

    }

    @Test
    public void test7() {
        Product electronics= new Electronics("Hair Dreyer Dove", 2, 2040);
        Product clothing= new Clothing("Gucci",50, 57);
        Product furniture= new Furniture("Joshim Furniture King Bed",8, 480);
        OrderManager orderManager= new OrderManager();
        orderManager.addProduct(electronics);
        orderManager.addProduct(clothing);
        orderManager.addProduct(furniture);
        orderManager.SortProduct();
        List<Product> p= new ArrayList<>();
        p= orderManager.getProducts();
        assertEquals(clothing,p.get(0));

    }
    @Test
    public void test8() {
        Product electronics= new Electronics("Hair Dreyer Dove", 2, 57);
        Product clothing= new Clothing("Gucci",50, 57);
        Product furniture= new Furniture("Joshim Furniture King Bed",8, 57);
        OrderManager orderManager= new OrderManager();
        orderManager.addProduct(electronics);
        orderManager.addProduct(clothing);
        orderManager.addProduct(furniture);
        orderManager.SortProduct();
        List<Product> p= new ArrayList<>();
        p= orderManager.getProducts();
        assertEquals(clothing,p.get(0));

    }
    @Test
    public void test9() {
        Product electronics= new Electronics("Gucci", 2, 57);
        Product clothing= new Clothing("Gucci",50, 57);
        Product furniture= new Furniture("Gucci",8, 57);
        OrderManager orderManager= new OrderManager();
        orderManager.addProduct(electronics);
        orderManager.addProduct(clothing);
        orderManager.addProduct(furniture);
        orderManager.SortProduct();
        List<Product> p= new ArrayList<>();
        p= orderManager.getProducts();
        assertEquals(electronics,p.get(0));

    }
    @Test
    public void test10() {
        Product electronics= new Electronics("Gucci", 2, 57);
        Product clothing= new Clothing("Gucci",2, 57);
        Product furniture= new Furniture("Gucci",2, 57);
        OrderManager orderManager= new OrderManager();
        orderManager.addProduct(electronics);
        orderManager.addProduct(clothing);
        orderManager.addProduct(furniture);
        orderManager.SortProduct();
        List<Product> p= new ArrayList<>();
        p= orderManager.getProducts();
        assertEquals(electronics,p.get(0));

    }


}
