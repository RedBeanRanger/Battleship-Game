
public class UserInput {

	public static void main(String[] args) {
		
	int [][] user = new int [11][11];
	int x, y; //x axis number of rows (vertical), y axis number of columns (horizontal)
	
	//the different boats
	int [] fivespace = {5, 5, 5, 5, 5};
	int [] fourspace = {4, 4, 4, 4}; // By making an array for each of these, we can separately print out "you sank my submarine!" and so on
	int [] threespace = {3, 3, 3}; 
	int [] threeS = {2, 2, 2};
	int [] twospace = {1, 1};
	
	//How the user will input their points
	
//***********************************//
int keeper = 0;	
int checker = 0;

	
	System.out.println("\nPlace your aircraft carrier! It will take up 5 coordinates.\nThink carefully as you will not be able to change the points after you put them in.\n");
	
for (int acplace = 0; acplace < fivespace.length; acplace ++) {
	
	System.out.print("Please enter x coordinate (horizontal)");
	y = TextIO.getInt();
	while (y < 0 || y > 10) {
		System.out.print("NOT AVAILABLE.\nEnter only values greater than 0 and less than or equal to 10");
		y = TextIO.getInt();
	}
	keeper = y;
	
	System.out.print("Please enter y coordinate (vertical)");
		x = TextIO.getInt();
		while (x < 0 || x > 10) {
			System.out.print("NOT AVAILABLE.\nEnter only values greater than 0 and less than or equal to 10");
			x = TextIO.getInt();
		}	
		checker = x;
		
		if (user[x][y] != 0) {
			System.out.print("\n\nSpot ("+ y + ", " + x +") is ALREADY OCCUPIED!!!\nPlease choose new coordinate\n");
			acplace --;
				if (acplace < 0) {
					acplace = -1;
				}
				
		if (x != checker || y != keeper) {
			System.out.println("Your coordinates are not in a line!!! Please try again.\n\nCoordinates placed must be next to each other.\n");
			acplace --;
			if (acplace < 0) {
				acplace = -1;
			}
		}
		}
		
		else {
			user[x][y] = fivespace[acplace];
		}
		System.out.println("\nYou have " + (fivespace.length - (acplace + 1)) + " spaces left for your aircraft carrier.\n");


		
}// end of placing your aircraft carrier space

//***********************************//
	
	System.out.println("\nPlace your battleship! (Takes up 4 coordinates)");

for (int bsplace = 0; bsplace < fourspace.length; bsplace ++) {
	System.out.println("Please enter x coordinate (horizontal)");
	y = TextIO.getInt();
	while (y < 0 || y > 10) {
		System.out.println("NOT AVAILABLE.\nEnter only values greater than 0 and less than or equal to 10");
		y = TextIO.getInt();
	}	
	keeper = y;
	
	System.out.println("Please enter y coordinate (vertical)");
		x = TextIO.getInt();
		while (x < 0 || x > 10) {
			System.out.println("NOT AVAILABLE.\nEnter only values greater than 0 and less than or equal to 10");
			x = TextIO.getInt();
		}
		checker = x;
		
		if (user[x][y] != 0) {
			System.out.println("\nSpot ("+ y + ", " + x +") is ALREADY OCCUPIED!!!\nPlease choose new coordinate\n");
			bsplace --;
				if (bsplace < 0) {
					bsplace ++;
				}
				
				if (x != checker || y != keeper) {
					System.out.println("Your coordinates are not in a line!!! Please try again.\n\nCoordinates placed must be next to each other.\n");
					bsplace --;
					if (bsplace < 0) {
						bsplace = -1;
					}
				}
		}
		
		else {
			user[x][y] = fourspace[bsplace];
		}
		System.out.println("\nYou have " + (fourspace.length - (bsplace + 1)) + " spaces left for your battleship.\n");
	}// end of forloop

	//***********************************//

	System.out.println("\nPlace your submarine! (Takes up 3 coordinates");

for (int sbmplace = 0; sbmplace < threespace.length; sbmplace ++) {
	System.out.println("Please enter x coordinate (horizontal)");
	y = TextIO.getInt();
	while (y < 0 || y > 10) {
		System.out.println("NOT AVAILABLE.\nEnter only values greater than 0 and less than or equal to 10");
		y = TextIO.getInt();
	}
	keeper = y;
	
	System.out.println("Please enter y coordinate (vertical)");
		x = TextIO.getInt();
		while (x < 0 || x > 10) {
			System.out.println("NOT AVAILABLE.\nEnter only values greater than 0 and less than or equal to 10");
			x = TextIO.getInt();
		}
		checker = x;
		
		if (user[x][y] != 0) {
			System.out.println("\nSpot ("+ y + ", " + x +") is ALREADY OCCUPIED!!!\nPlease choose new coordinate\n");
			sbmplace --;
			if (sbmplace < 0) {
				sbmplace ++;
			}
			
			if (x != checker || y != keeper) {
				System.out.println("Your coordinates are not in a line!!! Please try again.\n\nCoordinates placed must be next to each other.\n");
				sbmplace --;
				if (sbmplace < 0) {
					sbmplace = -1;
				}
		}
		}		
		else {
			user[x][y] = threespace[sbmplace];
		}
	System.out.println("\nYou have " + (threespace.length - (sbmplace + 1)) + " spaces left for your submarine.\n");
}//end of forloop

//***********************************//

	System.out.println("\nPlace your destroyer! (Takes up 3 coordinates");//destroyer

for (int dsplace = 0; dsplace < threeS.length; dsplace ++) {
	System.out.println("Please enter x coordinate (horizontal)");
	y = TextIO.getInt();
	while (y < 0 || y > 10) {
		System.out.println("NOT AVAILABLE.\nEnter only values greater than 0 and less than or equal to 10");
		y = TextIO.getInt();
	}	
	keeper = y;
	
	System.out.println("Please enter y coordinate (vertical)");
		x = TextIO.getInt();
		while (x < 0 || x > 10) {
			System.out.println("NOT AVAILABLE.\nEnter only values greater than 0 and less than or equal to 10");
			x = TextIO.getInt();
			checker = x;
		}
			
			if (user[x][y] != 0) {
				System.out.println("\nSpot ("+ y + ", " + x +") is ALREADY OCCUPIED!!!\nPlease choose new coordinate\n");
				dsplace--;
				if (dsplace < 0) {
					dsplace = -1;
				}
			}
			if (x != checker || y != keeper) {
				System.out.println("Your coordinates are not in a line!!! Please try again.\n\nCoordinates placed must be next to each other.\n");
				dsplace --;
				if (dsplace < 0) {
					dsplace = -1;
				}
			else {
				user[x][y] = threeS[dsplace];
			}
			}	
		System.out.println("\nYou have " + (threeS.length - (dsplace + 1)) + " spaces left for your destroyer.\n");
	}//end of forloop	

//***********************************//

	System.out.println("\nPlace your patrolboat! (Takes up 2 coordinates)");
	
for (int pbplace = 0; pbplace < twospace.length; pbplace ++) {//patrol boat
	System.out.println("Please enter x coordinate (horizontal)");
	y = TextIO.getInt();
	while (y < 0 || y > 10) {
		System.out.println("NOT AVAILABLE.\nEnter only values greater than 0 and less than or equal to 10");
		y = TextIO.getInt();
	}	
	keeper = y;
	
	System.out.println("Please enter y coordinate (vertical)");
	x = TextIO.getInt();
	while (x < 0 || x > 10) {
		System.out.println("NOT AVAILABLE.\nEnter only values greater than 0 and less than or equal to 10");
		x = TextIO.getInt();
	}
	checker = x;
		
		if (user[x][y] != 0) {
			System.out.println("\nSpot ("+ y + ", " + x +") is ALREADY OCCUPIED!!!\nPlease choose new coordinate\n");
			pbplace--;
			if (pbplace < 0) {
				pbplace ++;
			}
		}
		if (x != checker || y != keeper) {
			System.out.println("Your coordinates are not in a line!!! Please try again.\n\nCoordinates placed must be next to each other.\n");
			pbplace --;
			if (pbplace < 0) {
				pbplace = -1;
			}
		else {
			user[x][y] = twospace[pbplace];
		}
		}
	System.out.println("\nYou have " + (twospace.length - (pbplace + 1)) + " spaces left for your patrol boat.\n");
}//end of forloop

//***********************************//

System.out.println("\nHere is where you placed your boats.");
System.out.println("The 5's is the coordinates for your aircraft carrier.\n4's the coordinates for your battleship.\n3's for your submarine.\n2's for your destroyer.\n1's for your patrol boat.\n\n");

for (int populate = 0; populate < 11; populate ++) {
	user[populate][0] = populate;
	user[0][populate] = populate;
}

for (int [] bluh : user) {
	for (int check : bluh) {
		if (check != 0) {
			System.out.printf("%3d:", check); //yes, yes, I know. it's going to print after the ships' coordinates too. But I think it would actually look clearer that way...
		}
		
		else {
			System.out.printf("%4d", check);
		}
	}

	System.out.println("");
}	

}

}
