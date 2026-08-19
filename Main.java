public class Main {
    public static void main(String[] args) {


        Inventory inventory = new Inventory();

        Product apple = new Product("P001", "apple", 25, 25);
        Product orange = new Product("P002", "orange", 25, 25);
        Product peach = new Product("P003", "peach", 25, 25);

        inventory.addProduct(apple);
        inventory.addProduct(orange);
        inventory.addProduct(peach);

        inventory.addStock("P001", 5);
        inventory.removeStock("P002", 3);
        inventory.removeStock("P003", 100);
        inventory.addStock("P999", 8);

        inventory.displayProducts();


    }
}
