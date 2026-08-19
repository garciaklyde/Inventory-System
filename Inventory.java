public class Inventory {

    Product[] products = new Product[5];
    int productCount = 0;


    public void addProduct(Product product) {
        products[productCount] = product;
        productCount++;
    }

    public void displayProducts() {
        for (int i = 0; i < productCount; i++) {
            System.out.println("\nProduct " + (i + 1));
            products[i].displayInfo();
        }
    }

    public Product findProduct(String productId) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getProductId().equalsIgnoreCase(productId)) {
                return products[i];
            }
        }
        return null;
    }

    public void addStock(String productId, int amount) {

        boolean found = false;

        for (int i = 0; i < productCount; i++) {
            if (products[i].getProductId().equalsIgnoreCase(productId)) {
                products[i].addStock(amount);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }

    public void removeStock(String productId, int amount) {

        boolean found = false;

        for (int i = 0; i < productCount; i++) {
            if (products[i].getProductId().equalsIgnoreCase(productId)) {
                products[i].removeStock(amount);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }
}
