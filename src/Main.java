public class Main {
    public static void main(String[] args) {

        Electronics e =new Electronics("Philip Fridge", 3, 200570.75);
        Electronics f =new Electronics("Walton Fridge", 5, 100570.75);
        Electronics g =new Electronics("Whirlpool Fridge", 8, 210570.75);

        Clothing c= new Clothing("Gucci", 10, 5700.165);
        Clothing b= new Clothing("Vogue", 10, 5700.165);
        Clothing d= new Clothing("Gucci", 10, 5700.165);
        Clothing a= new Clothing("Vogue", 11, 5700.175);

        Furniture x= new Furniture("Otobi", 25, 1000000);
        Furniture y= new Furniture("Hatil", 25, 1000000);
        Furniture z= new Furniture("Joshim Furniture", 25, 1000900);

        OrderManager orderManager= new OrderManager();
        orderManager.addProduct(e);
        orderManager.addProduct(f);
        orderManager.addProduct(g);
        orderManager.addProduct(c);
        orderManager.addProduct(b);
        orderManager.addProduct(d);
        orderManager.addProduct(a);
        orderManager.addProduct(x);
        orderManager.addProduct(y);
        orderManager.addProduct(z);

        orderManager.printProducts();
        orderManager.SortProduct();
        orderManager.printProducts();

    }
}
