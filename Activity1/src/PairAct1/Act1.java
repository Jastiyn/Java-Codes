package PairAct1;

public class Act1 {

	public static void main(String[] args) {
		String cats[] = {"Chloe", "Oreo", "Uji", "Meiji", "Toothless", "Cotton"};
		
		System.out.println("List of Available Cats for Adoption:");
		for (int i = 0; i < cats.length; i++) {
			
			System.out.println("cat no." + (i + 1) + ": " + cats[i]);
		}

	}

}
