package LogBook.Week5;

public class StockDemo {
    private final StockList stockList;

    // Constructor
    public StockDemo() {
        stockList = new StockList();
    }

    // Method to test adding products
    public void testAddProducts() {
        Product p1 = new Product(98, "Watch", 50);
        Product p2 = new Product(99, "Ring", 80);
        Product p3 = new Product(100, "Earrings", 25);
        stockList.addProduct(p1);
        stockList.addProduct(p2);
        stockList.addProduct(p3);
    }

    // Method to test removing a product
    public void testRemoveProduct() {
        stockList.removeProduct(99);
    }

    // Method to test searching for a product
    public void testFindProduct() {
        Product found = stockList.findProduct(98);
        if (found != null) {
            found.print();
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to test printing all products
    public void testPrintProducts() {
        stockList.printAllProducts();
    }
    // Run method to call test methods
    public void run() {
        testAddProducts();
        System.out.println("After adding products:");
        testPrintProducts();

        testRemoveProduct();
        System.out.println("After removing a product:");
        testPrintProducts();

        System.out.println("Searching for a product:");
        testFindProduct();
    }
}

