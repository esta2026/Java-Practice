public class Inventory {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", "Electronics", 1200.00, 5);
        Product tshirt = new Product("T-Shirt", "Clothing", 15.00, 20);
        Product book = new Product("Java Programming", "Books", 45.00, 0);
        Product rice = new Product("Rice", "Food", 32.50, 10);

        laptop.applyDiscount(10);

        Product[] products = {laptop, tshirt, book, rice};

        System.out.println("============================================================");
        System.out.println("CS 234 - PRODUCT INVENTORY REPORT");
        System.out.println("============================================================");

        double totalInventoryValue = 0.0;
        Product mostValuableProduct = null;

        for (Product product : products) {
            System.out.println(product.getLabel());
            totalInventoryValue += product.getTotalValue();

            if (mostValuableProduct == null ||
                    product.getTotalValue() > mostValuableProduct.getTotalValue()) {
                mostValuableProduct = product;
            }
        }

        System.out.println("============================================================");
        System.out.printf("Total Products Created : %d%n", Product.getTotalProductsCreated());
        System.out.printf("Total Inventory Value : %.2f%n", totalInventoryValue);
        if (mostValuableProduct != null) {
            System.out.printf("Most Valuable Product : %s (%.2f)%n",
                    mostValuableProduct.getLabel(),
                    mostValuableProduct.getTotalValue());
        }
        System.out.println("============================================================");
    }
}

class Product {
    private String name;
    private String category;
    private double price;
    private int quantity;
    private static int totalProductsCreated = 0;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
        this.price = 0.0;
        this.quantity = 0;
        totalProductsCreated++;
    }

    public Product(String name, String category, double price, int quantity) {
        this(name, category);
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public void applyDiscount(double percent) {
        price = Math.max(0.0, price * (1 - percent / 100));
    }

    public String getLabel() {
        String stockStatus = isInStock() ? "IN STOCK" : "OUT OF STOCK";
        return String.format("%-15s %-20s %-10.2f %-5d %-10.2f %-15s",
                category.toUpperCase(),
                name,
                price,
                quantity,
                getTotalValue(),
                stockStatus);
    }

    public boolean isInStock() {
        return quantity > 0;
    }

    public static int getTotalProductsCreated() {
        return totalProductsCreated;
    }
}
