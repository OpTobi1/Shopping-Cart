package ShoppingCart;

public class Product {
    private static int idCounter = 100;
    private final int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = idCounter++;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Product id=" + id + ", name=" + name + ", price=" + String.format("%.2f", price);
    }
}