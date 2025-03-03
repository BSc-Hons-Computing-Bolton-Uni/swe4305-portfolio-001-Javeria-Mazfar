package LogBook.Week5;

import java.util.ArrayList;

public class StockList {
    private final ArrayList<Product> products;

    // Constructor
    public StockList() {
        products = new ArrayList<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to remove a product by ID
    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    // Method to find a product by ID
    public Product findProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    // Method to print all the products
    public void printAllProducts() {
        for (Product product : products) {
            product.print();
        }
    }
}

