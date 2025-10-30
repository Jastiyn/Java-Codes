package Borgir;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

class Burger {
	   private String flavor;
	   private double price;
	   private int quantity; 
	    
	   public void setFlavor(String flavor){
	    this.flavor = flavor;
	   }

	    public String getFlavor(){
	        return flavor;
	   }

	   public void setPrice(double price){
	    this.price = price;
	   }

	    public double getPrice(){
	        return price;
	   }

	   public void setQuantity(int quantity){
	    this.quantity = quantity;
	   }

	    public int getQuantity(){
	        return quantity;
	   }
	   
	}

class RecieptQueue {
	   private Deque<Burger> queue = new ArrayDeque<>();

	   Scanner sc = new Scanner(System.in);

	   public void addBurger(Burger burger) {
	    queue.add(burger);
	  }

	  public void buyBurger() {
	    while (true) {
	        try {
	            Burger burger = new Burger();

	            System.out.print("Enter Burger Flavor: ");
	            burger.setFlavor(sc.next());
	        
	            System.out.print("Enter Price: Php ");
	            burger.setPrice(sc.nextDouble());
	        
	            System.out.print("Enter Quantity: ");
	            burger.setQuantity(sc.nextInt());
	        
	            addBurger(burger);
	        
	            System.out.println("\nDo you want to buy again?");
	            System.out.println("[1] YES");
	            System.out.println("[2] NO");
	            System.out.print("Enter your choice: ");
	            
	            int choice = sc.nextInt();
	            sc.nextLine();

	            if (choice == 2) {
	                Main.Menu();
	                break;
	            }

	        } catch (java.util.InputMismatchException e) {
	            System.out.println("Please enter a number.");
	            sc.nextLine();
	        }
	            
	        }
	    }    
	        

	    public void displayBurger() {
	        System.out.println("Burger in Queue: \n");
	        for (Burger burger : queue) {
	            System.out.println("Flavor: " + burger.getFlavor() + "burger");
	            System.out.printf("Price: Php %.2f%n",  burger.getPrice());
	            System.out.println("Quantity: " + burger.getQuantity());
	            System.out.println();
	        }
	       
	        while(true){
	            try {
	            System.out.println("[1] EXIT");
	            int choice = sc.nextInt();
	            sc.nextLine(); 
	        
	            if (choice == 1) {
	                Main.Menu();
	                break;
	            }else{
	                System.out.println("That's not in the choices. Please try again.");
	            }
	            
	      } catch (java.util.InputMismatchException e) {
	                System.out.println("Please enter a valid number.");
	                sc.nextLine(); 
	        }
	      }
	     
	        
	    }

	   public void printReciept(){
	    System.out.println("Here is your Receipt: ");
	    double total = 0.0;
	     
	      for(Burger burger : queue){ 
	        String flavor = burger.getFlavor();
	        double price = burger.getPrice();
	        int qty = burger.getQuantity();
	        double subtotal = price * qty;

	        System.out.println("Flavor: " + flavor);
	        System.out.printf("Price: Php %.2f%n",  price);
	        System.out.println("Quantity: " + qty);
	        System.out.println();

	        total += subtotal;
	      }

	        System.out.println("--------------------------------------");
	        System.out.printf("Total: Php %.2f%n", total);
	        System.out.println("--------------------------------------");
	   }
	}

public class Main {
    private static RecieptQueue queue = new RecieptQueue();
    
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Duday's Borgir Shop!");
        Menu();
    }

    static void Menu() {
        Scanner in = new Scanner(System.in);
        boolean validInput = false;
        
        while (!validInput) {
            System.out.println("\nMenu: ");
            System.out.println("[1] Buy Burger");
            System.out.println("[2] Display purchases");
            System.out.println("[3] Check out");
            System.out.println("[4] Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = in.nextInt();
                in.nextLine(); 

                switch (choice) {
                    case 1:
                        queue.buyBurger();
                        break;

                    case 2:
                        queue.displayBurger();
                        break;

                    case 3:
                        queue.printReciept();
                        break;

                    case 4:
                        System.out.print("Thank you for buying at Duday's Borgir Shop!");
                        return; 

                    default:
                        System.out.println("This is not in the choices. Please try again.");
                }
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                in.nextLine();
            }
        }
        in.close();
    }
}
