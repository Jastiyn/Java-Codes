import java.util.Scanner;

class Item {
    String itemName;
    String itemDescription;
    double itemPrice;
    boolean itemPurchased;
    Item next;

    Item (String itemName, String itemDescription, double itemPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemPurchased = false;
        this.next = null;
    }
}

class Shoppinglist {
    Item head;

    void addItem(String itemName, String itemDescription, double itemPrice) {
        Item newItem = new Item(itemName, itemDescription, itemPrice);
        if (head == null) {
            head = newItem;
        } else {
            Item current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newItem;
        }
    }

    void displayList() {
        if (head == null) {
            System.out.println("Shopping list is empty.");
            return;
        }
        Item current = head;
        System.out.println("Shopping list:");
        while (current != null) {
            System.out.println("Name: " + current.itemName);
            System.out.println("Description: " + current.itemDescription);
            System.out.println("Price: " + current.itemPrice);
            System.out.println("Purchased: " + (current.itemPurchased ? "Yes" : "No"));
            System.out.println("--------------------");
            current = current.next;
        }
    }
    
    void removeItem(String itemName) {
    	if (head == null) {
    		System.out.println("Shopping list is empty.");
    		return;
    	}
    	
    	if (head.itemName.equals(itemName)) {
    		head = head.next;
    		System.out.println(itemName + " has been removed from the shopping list");
    		return;
    	}
    	
    	Item current = head;
    	while (current.next != null) {
    		if (current.next.itemName.equals(itemName)) {
    			current.next = current.next.next;
    			System.out.println(itemName + " has been removed from the shopping list");
    			return;
    		}
    		current = current.next;
    	}
    	System.out.println(itemName + " was not found in the shopping list.");
    }
    
    void Purchased (String itemName) {
    	Item current = head;
    	while (current != null) {
    		if (current.itemName.equals(itemName)) {
    			current.itemPurchased = true;
    			System.out.println(itemName + " has been marked as purchased");
    			return;
    		}
    		current = current.next;
    	}
    	System.out.println(itemName + " was not found in the shopping list");
    }
}

public class Main {
    public static void main(String[] args) {
        Shoppinglist myShoppinglist = new Shoppinglist();
        Scanner in = new Scanner(System.in);

        myShoppinglist.addItem("Maybelline lipstick", "Rosy Pink Shade", 190.00);
        myShoppinglist.addItem("Ben10 Brief", "Limited Edition", 1000.00);
        myShoppinglist.addItem("Butterfly Hairclip", "Cute hairclip", 13.00);
        myShoppinglist.addItem("Tobleron", "White Chocolate", 150.00);
        myShoppinglist.addItem("Shabu", "Sikret", 300.00);
        
        int choice;
        
        do {
        	System.out.println("My Shopping Item list");
        	myShoppinglist.displayList();
        	System.out.println("[1] Add Item");
        	System.out.println("[2] Remove Item");
        	System.out.println("[3] Mark Item as Purchased");
        	System.out.println("[4] Exit");
        	System.out.print("Enter your choice: ");
        	choice = in.nextInt();
        	in.nextLine();
        	
        	switch (choice) {
        	case 1:
        		System.out.print("Enter item name: ");
        		String name = in.nextLine();
        		System.out.print("Enter item description: ");
        		String description = in.nextLine();
        		System.out.print("Enter item price: ");
        		double price = in.nextDouble();
        		myShoppinglist.addItem(name, description, price);
        		break;
        	case 2:
        		System.out.print("Enter item name to remove: ");
        		String itemToRemove = in.nextLine();
        		myShoppinglist.removeItem(itemToRemove);
        		break;
        	case 3:
        		System.out.print("Enter item name to mark as purchased: ");
        		String itemToMark = in.nextLine();
        		myShoppinglist.Purchased(itemToMark);
        		break;
        	case 4:
        		break;
        	default:
        		System.out.println("Invalid choice. Please try again.");
        	}
        }
        while (choice != 4);
        System.out.println("Exiting shopping list application");
        
        
       // System.out.println("My Shopping Item list:");
       // myShoppinglist.displayList();

    }
}

