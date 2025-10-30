package Borgir;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class BurgerPurchase {
    private String flavor;
    private int quantity;
    private double price;

    public BurgerPurchase(String flavor, int quantity, double price) {
        this.flavor = flavor;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String toString() {
        return quantity + " " + flavor + " burger(s) at $" + price + " each";
    }
}

class ReceiptQueue {
    private Queue<BurgerPurchase> queue;
    private double totalBill;

    public ReceiptQueue() {
        queue = new ArrayDeque<>();
        totalBill = 0.0;
    }

    public void addBurgerPurchase(BurgerPurchase purchase) {
        queue.add(purchase);
        totalBill += purchase.getTotalPrice();
    }

    public void generateReceipt() {
        if (!queue.isEmpty()) {
            BurgerPurchase purchase = queue.poll();
            System.out.println("Receipt: " + purchase);
            System.out.println("Total Bill: $" + totalBill);
        } else {
            System.out.println("No more burger purchases in the queue.");
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public List<BurgerPurchase> getPurchases() {
        return new ArrayList<>(queue);
    }

    public double getTotalBill() {
        return totalBill;
    }
}

public class BurgerPurchaseSimulator {
    public static void main(String[] args) {
        ReceiptQueue receiptQueue = new ReceiptQueue();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Buy burgers");
            System.out.println("2. Display purchases");
            System.out.println("3. Check out");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter burger flavor (or 'done' to finish): ");
                    String flavor = scanner.nextLine();

                    if (flavor.equals("done")) {
                        break;
                    }

                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();

                    System.out.print("Enter price per burger: $");
                    double price = scanner.nextDouble();

                    BurgerPurchase purchase = new BurgerPurchase(flavor, quantity, price);
                    receiptQueue.addBurgerPurchase(purchase);

                    System.out.println("Burger purchase added. Total bill: $" + receiptQueue.getTotalBill());
                    break;

                case 2:
                    System.out.println("Purchases:");
                    for (BurgerPurchase purchaseItem : receiptQueue.getPurchases()) {
                        System.out.println(purchaseItem);
                    }
                    break;

                case 3:
                    System.out.println("Checking out...");
                    while (!receiptQueue.isEmpty()) {
                        receiptQueue.generateReceipt();
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}