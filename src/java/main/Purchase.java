package src.java.main;

public class Purchase {
    private final String foodItem;
    private final double price;
    private final int quantity;

    public Purchase(String foodItem, double price, int quantity) {
        this.foodItem = foodItem;
        this.price = price;
        this.quantity = quantity;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "foodItem='" + foodItem + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
