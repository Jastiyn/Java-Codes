import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class StudentDirectory {
	HashMap<Integer, StudentInformation> hashtable = new HashMap<>();
	Scanner in = new Scanner (System.in);
	static StudentDirectory directory = new StudentDirectory();
	
	public static void main(String[] args) throws Exception {
		directory.start();
		
	}
	
	void start() {
		boolean isValid = false;
		System.out.println("-----------------------------------");
		System.out.println("[1] ADD");
		System.out.println("[2] DISPLAY");
		System.out.println("[3] SEARCH");
		System.out.println("[4] DELETE");
		System.out.println("[5] EXIT");
		System.out.println("-----------------------------------");
		while (!isValid) {
			System.out.print("Your Choice: ");
			int choice = in.nextInt();
			
			switch (choice) {
			
			case 1:
				Add();
				break;
			
			case 2:
				Display();
				break;
				
			case 3:
				Search();
				break;
				
			case 4:
				Delete();
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("Input error, enter available choices");
			
			}
			isValid = true;
			
		}
		
	}
	
	void Add() {
		System.out.println("-----------------------------------");
		System.out.println("ADD STUDENT \n");
		System.out.print("Input Student Number: ");
		int Number = in.nextInt();
		in.nextLine();
		
		System.out.print("Input Student Name: ");
		String Name = in.nextLine();
		
		System.out.print("Input Student Course: ");
		String Course = in.nextLine();
		
		StudentInformation studentInformation = new StudentInformation (Name, Course);
		hashtable.put (Number, studentInformation);
		
		directory.start();
		
	}
	
	void Display() {
		System.out.println("-----------------------------------");
		System.out.println("LIST OF STUDENTS: \n");
		if (hashtable.isEmpty()) {
			System.out.println("Student Record is Empty.");
			directory.start();
			
		}
		else {
			for (Map.Entry<Integer, StudentInformation> entry : hashtable.entrySet()) {
				Integer key = entry.getKey();
				StudentInformation studentInformation = entry.getValue();
				String Name = studentInformation.getName();
				String Course = studentInformation.getCourse();
				System.out.println("Student Number: " + key);
				System.out.println("Student Name: " + Name);
				System.out.println("Course: " + Course);
				
			}
			System.out.println("-----------------------------------");
			directory.start();
			
		}
		
	}
	
	void Search() {
		System.out.println("-----------------------------------");
		System.out.println("SEARCH STUDENT \n");
		System.out.print("Input Student Number: ");
		int Number = in.nextInt();
		
		if (hashtable.containsKey(Number)) {
			StudentInformation studentInformation = hashtable.get(Number);
			String Name = studentInformation.getName();
			String Course = studentInformation.getCourse();
			System.out.println("Student Number: " + Number);
			System.out.println("Student Name: " + Name);
			System.out.println("Course: " + Course);
		}
		else {
			System.out.println("Student with Student Number " + Number + " not found");
		}
		System.out.println("-----------------------------------");
		directory.start();
		
	}
	
	void Delete() {
		System.out.println("-----------------------------------");
		System.out.println("DELETE STUDENT \n");
		System.out.print("Input Student Number: ");
		int Number = in.nextInt();
		
		if (hashtable.containsKey(Number)) {
			hashtable.remove(Number);
			System.out.println("Student numbe: " + Number + " has been deleted.");
		}
		else {
			System.out.println("Student with Student Number " + Number + " not found");
		}
		System.out.println("-----------------------------------");
		directory.start();
	}
}

class StudentInformation {
	private String Name;
	private String Course;
	
	public StudentInformation(String Name, String Course) {
		this.Name = Name;
		this.Course = Course;
		
	}
	public String getName() {
		return Name;
		
	}
	public void setName(String Name) {
		this.Name = Name;
		
	}
	public String getCourse() {
		return Course;
	
	}
	public void setCourse(String Course) {
		this.Course = Course;
		
	}
	
}