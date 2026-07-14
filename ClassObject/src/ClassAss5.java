class ShoppingCart {
    // Private variables
    private String productName;
    private double price;
    private int quantity;

    // Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public double getTotalCost() {
        double total = price * quantity;

        if (total > 5000) {
            total = total - (total * 10 / 100); // 10% discount
        }

        return total;
    }
}

public class ClassAss5 {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();

        sc.setProductName("Laptop");
        sc.setPrice(3000);
        sc.setQuantity(2);

        System.out.println("Product Name: " + sc.getProductName());
        System.out.println("Total Cost: " + sc.getTotalCost());
    }
}
//public class ClassAss5 {

//}
