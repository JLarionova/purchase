package src.java.main;

public class PurchaseFactory {
    public Purchase getPurchase(String line) {
        if (line == null) {
            return null;
        }

        line = line.trim();
        String[] array = line.split(";");

        String foodItem = array[0];
        double price = Double.parseDouble(array[1]);
        int quantity = Integer.parseInt(array[2]);

        if (array.length == 3) {
            return new Purchase(foodItem, price, quantity);
        } else {
            int discount = Integer.parseInt(array[3]);
            return new PricePurchase(foodItem, price, quantity, discount);
        }
    }
}
