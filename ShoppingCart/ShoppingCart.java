package ShoppingCart;

public class ShoppingCart {
    private Item[] items;
    private int numOfItems;
    private final int MAX_ITEMS = 50;
    private static int cartsCreated = 0;

    public ShoppingCart() {
        this.items = new Item[MAX_ITEMS];
        this.numOfItems = 0;
        cartsCreated++;
    }

    public void addProduct(Product p, int amount) {
        for (int i = 0; i < numOfItems; i++) {
            if (items[i].getProduct().getId() == p.getId()) {
                items[i].addQuantity(amount);
                return;
            }
        }

        if (numOfItems < MAX_ITEMS) {
            items[numOfItems] = new Item(p, amount);
            numOfItems++;
        } else {
            System.out.println("No space to add more items!");
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < numOfItems; i++) {
            total += items[i].getTotalPrice();
        }
        return total;
    }

    public Product getMostExpensiveProduct() {
        if (numOfItems == 0) return null;
        Product mostExpensive = items[0].getProduct();
        for (int i = 1; i < numOfItems; i++) {
            if (items[i].getProduct().getPrice() > mostExpensive.getPrice()) {
                mostExpensive = items[i].getProduct();
            }
        }
        return mostExpensive;
    }

    public static int getCartsCreated() {
        return cartsCreated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numOfItems; i++) {
            sb.append(items[i].toString()).append("\n");
        }
        sb.append("Total price: ").append(String.format("%.2f", getTotalPrice()));
        return sb.toString();
    }
}