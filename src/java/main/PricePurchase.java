package src.java.main;

public class PricePurchase extends Purchase {
    private final int discount;

    public PricePurchase(String foodItem, double price, int quantity, int discount) {
        super(foodItem, price, quantity);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "foodItem='" + super.getFoodItem() + '\'' +
                ", price=" + super.getPrice() +
                ", quantity=" + super.getQuantity() +
                ", discount=" + discount +
                '}';
    }
}
