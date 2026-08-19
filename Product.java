public class Product {

    private String productId;
    private String name;
    private double price;
    private int quantity;

    public Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void displayInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public void addStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid stock amount.");
        } else {
            System.out.println("Previous quantity: " + quantity);
            quantity += amount;
            System.out.println("New quantity: " + quantity);
        }
    }

    public void removeStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid stock amount.");
        } else if (amount > quantity) {
            System.out.println("Not enough stock.");
        } else {
            System.out.println("Previous quantity: " + quantity);
            quantity -= amount;
            System.out.println("New quantity: " + quantity);
        }
    }
}
