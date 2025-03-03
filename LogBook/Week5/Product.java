package LogBook.Week5;

public class Product {
    private int id;
    private String name;
    private int quantity;

    // Constructor
    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Print method to display product details
    public void print() {
        System.out.println("ID: " + id + ", Name: " + name + ", Quantity: " + quantity);
    }
}

