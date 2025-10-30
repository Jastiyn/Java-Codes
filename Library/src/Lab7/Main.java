package Lab7;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    private Stack <Book> books = new Stack<>();
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.Start();
        
    }
	
	public void Start() {
		Scanner in = new Scanner(System.in);
        boolean Input = false;
            System.out.println("\nLibrary Menu: ");
            System.out.println("[1] Add a Book");
            System.out.println("[2] Display Books");
            System.out.println("[3] Borrow a Book");
            System.out.println("[4] Return a Book");
            System.out.println("[5] Exit");
            System.out.print("Enter your choice: ");
            
        while (!Input) {

            try {
                int choice = in.nextInt();
                in.nextLine(); 

                switch (choice) {
                    case 1:        
                    	System.out.print("Enter book title: ");
						String bookTitle = in.nextLine();
						System.out.print("Enter author's name: "); 
						String bookAuthor = in.nextLine(); 
						addBook(bookTitle, bookAuthor); 
						Input = true;
						break;

					case 2:
						displayBooks();
                        Input = true;
                        break;

                    case 3:
                    	System.out.print("Enter book title: ");
                    	String borrow = in.nextLine();
                    	borrowBook(borrow);
                        Input = true;
                        break;

                    case 4:
                    	System.out.print("Enter book title: ");
						String bookReturn = in.nextLine();
						System.out.print("Enter author's name: "); 
						String authorReturn = in.nextLine(); 
						returnBooks(bookReturn, authorReturn); 
						Input = true;
						break;
                        
                    case 5:
                        System.out.println("Thank you, see u never!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please select again");
                        Start();
                }
                
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                in.nextLine(); 
            }
        }
	}
	
	public void displayBooks(){  
		   System.out.println("\nSelect what you want: ");
		   System.out.println("[1] Peek");
           System.out.println("[2] View Library");
           System.out.println("[3] Exit");
           System.out.print("Enter your choice: ");
		   
		   while (true) {
			   int choice = in.nextInt();
			   
			if (books.isEmpty()) {
				System.out.println("Library is empty");
			    Start();
			}
			else {
				if (choice == 1) {
			   System.out.println("Latest book: " + books.peek());
			   Start();
			   
		   }
			else if (choice == 2) {
			   System.out.println("Library: " + books);
			   Start();  
			   
		   }
			else if (choice == 3) {
			   Start();
			   
		   }
			else {
			   System.out.println("Invalid choice. Please select again");
			   displayBooks();
		   }
	    }   
	}     
}
	   
	public void addBook(String bookTitle, String bookAuthor) {
        Book book = new Book(bookTitle, bookAuthor);
        books.push(book);
        System.out.println(bookTitle + " by " + bookAuthor + " has been added to the library");
        Start(); 
    }
	   
	public void borrowBook(String bookTitle) {
		while (true) {
            if (books.isEmpty()) {
                System.out.println("The library is empty");
                Start();
            } else {
                if (books.removeIf(book -> book.getTitle().equals(bookTitle))) {
                    System.out.println(bookTitle + " has been borrowed");
                } else {
                    System.out.println(bookTitle + " not found");
                }
                Start();
            }
        }
	}
	 
	   public void returnBooks(String bookTitle, String bookAuthor) {
        Book book = new Book(bookTitle, bookAuthor);
        books.push(book);
        System.out.println(bookTitle + " by " + bookAuthor + " has been returned");
        Start();
    }

	   class Book {
        private String Title;
        private String Author;

        public Book(String Title, String Author) {
            this.Title = Title;
            this.Author = Author;
        }

        public String getTitle() {
            return Title;
        }

        public String getAuthor() {
            return Author;
        }

        @Override
        public String toString() {
            return Title + " by " + Author;
        }
    }

}
