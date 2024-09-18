package src.java.main;

import java.io.*;
import java.time.DayOfWeek;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String path = "C:/Users/jekat/source/repos/GitHub/JLarionova/purchase/src/in.csv";
        PurchaseFactory factory = new PurchaseFactory();
        Map<Purchase, DayOfWeek> purchase = new HashMap<>();


        String line;
        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((line = reader.readLine()) != null) {
                lineCount++;

                if (lineCount % 2 != 0) {
                    Purchase currentPurchase = factory.getPurchase(line);

                    String day = reader.readLine().strip();
                    lineCount++;

                    try {
                        DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
                        purchase.put(currentPurchase, dayOfWeek);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Invalid day of week: " + day);
                    }
                }
            }
        } catch (IOException exc) {
            System.err.println("Error reading file: " + exc.getMessage());
        }


        System.out.println("Initial purchase data: ");
        purchase.forEach((key, value) -> System.out.println("Key = " + key + ", Value = " + value));
        System.out.println();


        System.out.println("Find the first and last day of the week on which bread was bought for 155: ");
        purchase.entrySet().stream()
                .filter(entry -> "bread".equals(entry.getKey().getFoodItem()) && entry.getKey().getPrice() == 155)
                .forEach(entry -> System.out.print(entry.getValue() + " ")); // expected: MONDAY SUNDAY
        System.out.println("\n");

        Map<Purchase, DayOfWeek> map = new HashMap<>(purchase);

        System.out.println("Delete all data from the map \"purchase\" for meat: ");
        purchase.entrySet().removeIf(entry -> "meat".equals(entry.getKey().getFoodItem()));
        purchase.forEach((key, value) -> System.out.println("Key = " + key + ", Value = " + value));
        System.out.println();


        System.out.println("Delete all data from the second map on purchases on Friday: ");
        map.entrySet().removeIf(entry -> DayOfWeek.FRIDAY.equals(entry.getValue()));
        map.forEach((key, value) -> System.out.println("Key = " + key + ", Value = " + value));
    }
}