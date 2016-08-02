package com.explorermode;

public class AdventurerMode {

	public static void main(String[] args) {
		String[] favoriteMusicians = new String [10];
		favoriteMusicians[0] = "Young Dolph";
		favoriteMusicians[1] = "Gucci Mane";
		favoriteMusicians[2] = "Future Hendrix";
		favoriteMusicians[3] = "Wale Folarin";
		favoriteMusicians[4] = "J. Cole";
		favoriteMusicians[5] = "Nas";
		favoriteMusicians[6] = "Young Scooter";
		favoriteMusicians[7] = "Doe B";
		favoriteMusicians[8] = "Oj da Juiceman";
		favoriteMusicians[9] = "Peewee Longway";

		String[] movies = {"Saving Private Ryan", "Taken", "Insidious", "Seven", "Menace to Society", "Enemy at the Gates",
				"Waterboy", "Hostel", "Friday", "Saw"};

		String[] [] favoritesTable = new String [3] [3];
		//first row movie values
		favoritesTable[0][0] = "Menace to Society";
		favoritesTable[0][1] = "Friday";
		favoritesTable[0][2] = "Taken";
		//second row music value
		favoritesTable[1][0] = "Young Dolph";
		favoritesTable[1][1] = "Gucci Mane";
		favoritesTable[1][2] = "Future Hendrix";
		//third row book values
		favoritesTable[2][0] = "Book 1";
		favoritesTable[2][1] = "Book 2";
		favoritesTable[2][2] = "Book 3";

		for (int i = 0; i < favoritesTable.length; i++) {
			for (int j = 0; j < favoritesTable.length; j++) {
				System.out.print(favoritesTable[i][j] + "\n");
			}
			System.out.println("");
		}

	}		

public String cat(){
	return "Hello Cat";
}
private int dog() {
	return 0;
}
public boolean areYouADolphin(){
	return false;
}
public void elephant(){
	System.out.println("I like elephants.");
}
protected String zebra(){
	return "Hi Zebra";
}
private int hamster(){
	return 1;
}
public double taxReturn(){
	return 1402.25;
} 
public char letterGrade(){
	return 'B';
}
public void diamondRingsAndShinyThings(){
	System.out.println("Balling is a habit");
}
protected int  orderOfCompletion(){
	return 3;
}
}

