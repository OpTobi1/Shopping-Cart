package ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product("Milk", 6.5);
        Product p2 = new Product("Bread", 7.0);
        Product p3 = new Product("Chocolate", 9.9);

        // Create first shopping cart
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addProduct(p1, 2); // Add 2 Milk
        cart1.addProduct(p2, 1); // Add 1 Bread
        cart1.addProduct(p3, 3); // Add 3 Chocolate
        cart1.addProduct(p1, 1); // Add 1 more Milk

        // Create second shopping cart
        ShoppingCart cart2 = new ShoppingCart();
        cart2.addProduct(p2, 2); // Add 2 Bread
        cart2.addProduct(p1, 1); // Add 1 Milk
        cart2.addProduct(p3, 1); // Add 1 Chocolate

        // Print the content of the carts
        System.out.println("Cart 1:\n" + cart1);
        System.out.println("Cart 2:\n" + cart2);

        // Print the most expensive product in each cart
        System.out.println("Most expensive in Cart 1: " + cart1.getMostExpensiveProduct());
        System.out.println("Most expensive in Cart 2: " + cart2.getMostExpensiveProduct());

        // Print the total number of carts created
        System.out.println("Total carts created: " + ShoppingCart.getCartsCreated());
    }
}