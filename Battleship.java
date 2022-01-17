
public class Battleship {

	public static void main(String[] args) {	
		
	int [][] z = new int [11][11];
	
	Welcome.main(args); // Refer to Welcome class. And yes, this is the same Welcome class made at the beginning of the year.
		
	System.out.println("\nWelcome! Let's play a game of BATTLESHIP!");	
	System.out.println("If you wish to view rules, type \"yes\". Otherwise, type \"no\".");
		boolean ruleView = TextIO.getBoolean();
		
	while (ruleView == true) {
		System.out.println ("\nThe goal of Battleship is to try and sink your opponent's ships.\nYou win if you sink all of your opponent's ships before they sink yours.");
		System.out.println ("\nWe will play on a 10x10 grid like the following:\n");
		
		// ************************GRID STARTS
		for (int populate = 0; populate < 11; populate ++) {
			z[populate][0] = populate;
			z[0][populate] = populate;
		}
		
		for (int [] bluh : z) {
			for (int check : bluh) {
				if (check != 0) {
					System.out.printf("%3d:", check);//prints colon after every index that has a value.
				}
				
				else {
					System.out.printf("%4d", check);
				}
			}
			System.out.println("");
		}
		//**************************GRID ENDS
		
		System.out.println("\nNote that the grid is probably not what you are used to.");
		System.out.println("The x-axis is up at the top, and the y axis at the side.");
		System.out.println("\nI will now teach you how to find a point. Take for example, points (3, 4)\n");
		
		z[4][3] = 2;
		
		for (int [] bluh : z) {
			for (int check : bluh) {
				if (check != 0) {
					System.out.printf("%3d:", check);//prints colon after every index that has a value.
				}
				
				else {
					System.out.printf("%4d", check);
				}
			}
			System.out.println("");
		}
		
		System.out.println("\nDo you see where the '2:' appeared on the grid? That's point (3, 4).\nSee what I did there?\n");
		System.out.println("Note: This grid would not be displayed all the time. \nI recommend you to draw your own grid like the one I showed you while you play.");
		
		System.out.println("\nWhen we start the game, I will ask you to input coordinates for your ships.\nThere are 5 ships in total and they take up different numbers of coordinates.\n");
		System.out.println("The ships include:\n   Aircraft carrier - 5 coordinates\n   Battleship - 4 coordinates\n   Submarine - 3 coordinates\n   Destroyer - 3 coordinates\n   Patrol Boat - 2 coordinates\n");
		System.out.println("Your opponent will place their ships on a separate grid.\nOnce the two of you finish placing their ships, you can start guessing which coordinates your opponent put their ships on.\n\n");
	
		System.out.println("\nDo you want to review the rules?\n\nType \"yes\" to see all that again.\nType \"no\" to start game.");
			ruleView = TextIO.getBoolean();
	}
	
	System.out.println("Let's begin!\n");
	
	//the actual game
	
	System.out.println("Select your opponent!\n\nType \"1\" to play against Computer Player 1.\nType \"2\" to play against Computer Player 2");
		int decision = TextIO.getInt();
		
	//verification check
			while (decision != 1 && decision != 2) {
				System.out.println("\nWhat? Excuse me? Can you try that again?\n\nType \"1\" to play against Computer Player 1.\nType \"2\" to play against Computer Player 2");
					decision = TextIO.getInt();
			}
		System.out.println("You chose to play against Computer Player " + decision + ".");	
		
	
	// placing of ships
	
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
						
				if (x != checker && y != keeper) {
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
						
						if (x != checker && y != keeper) {
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
					
					if (x != checker && y != keeper) {
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
					if (x != checker && y != keeper) {
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
				if (x != checker && y != keeper) {
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
		
//*****************************************************************************************
//END OF USER INPUT		

	System.out.println("\nOkay! Your opponent is done placing their boats too!\n");
	System.out.println("Here's a tip: If at any point you want to quit the game, enter a number bigger than 10.");

//***********************************	
	
	int [][] com;
	
	int [] aircraftC = {5,5,5,5,5}; //aircraft carrier
	int [] battleS = {4,4,4,4}; //battleship
	int [] sub = {3,3,3}; //destroyers
	int [] des = {2,2,2}; //submarine
	int [] patrolB = {1,1}; //patrol boat
	
	if (decision == 1) { //Setup 1
	com = new int [11][11];
			
			for (int laziness = 0; laziness < aircraftC.length; laziness ++) {
				com[10][laziness + 1]= aircraftC[laziness];
			}
			
			for (int laziness = 0; laziness < battleS.length; laziness ++) {
				com[laziness+2][6 ]= battleS[laziness];
			}
			
			for (int laziness = 0; laziness < sub.length; laziness ++) {
				com[laziness+4][4]= sub[laziness];
			}
			
			for (int laziness = 0; laziness < des.length; laziness ++) {
				com[1][laziness+3] = des[laziness];
			}
			
			for (int laziness = 0; laziness < patrolB.length; laziness ++) {
				com[5][laziness+1]= patrolB[laziness];
			}
	}
//**********************************************	
	else { //Setup 2
	com = new int [11][11];
		
		for (int laziness = 0; laziness < aircraftC.length; laziness ++) {
			com[7][laziness + 1]= aircraftC[laziness];
		}
		
		for (int laziness = 0; laziness < battleS.length; laziness ++) {
			com[laziness+3][8]= battleS[laziness];
		}
		
		for (int laziness = 0; laziness < sub.length; laziness ++) {
			com[5][laziness+2]= sub[laziness];
		}
		
		for (int laziness = 0; laziness < des.length; laziness ++) {
			com[2][laziness+3] = des[laziness];
		}
		
		for (int laziness = 0; laziness < patrolB.length; laziness ++) {
			com[laziness+9][4]= patrolB[laziness];
		}
	}
//*****************************
int loopEnder = 0;	
int store = 0;

int guess = 0;
int estimate = 0;

	int userACount = 0;
	int userBCount = 0;
	int userSCount = 0;
	int userDCount = 0;
	int userPCount = 0;

	int comACount = 0;
	int comBCount = 0;
	int comSCount = 0;
	int comDCount = 0;
	int comPCount = 0;
	
System.out.println("You go first!");
	
while (loopEnder == 0) {
	while (guess < 1) {
	System.out.println("\n\nGuess a x-coordinate (horizontal)");
		guess = TextIO.getInt();
			if (guess < 1) {
				System.out.println("UNAVAILABLE! NUMBER MUST BE BETWEEN 0 AND 10. \nTRY AGAIN.\n");
				guess = TextIO.getInt();
			}
			
			if (guess > 10) {
				System.out.println("You entered a number over 10. I will now quit the game.");
				loopEnder ++;
				break;
			}
			
	}
	
	if (guess > 10) {
		break;
	}
	
	while (estimate < 1) {
	System.out.println("Guess a y-coordinate (vertical)");
		estimate = TextIO.getInt();
			if (estimate < 1) {
				System.out.println("UNAVAILABLE! NUMBER MUST BE BETWEEN 0 AND 10. \nTRY AGAIN.\n");
				estimate = TextIO.getInt();
			}
	}	
	
	if (estimate > 10) {
		System.out.println("You entered a number over 10. I will now quit the game.");
		loopEnder ++;
		break;
	}
	
	if (guess > 10 || estimate > 10) {
		break;
	}

	
		if (com[estimate][guess] != 0) {
			System.out.println("It's a hit!!!");
			com[estimate][guess] = store;
			com[estimate][guess] = 0;
					if (store == 5) {
						comACount++;
							if (comACount == 5) {
								System.out.println("You sunk your opponent's aircraft carrier!");
							}
					}
					else if (store == 4) {
						comBCount ++;
							if (comBCount == 4) {
								System.out.println("You sunk your opponent's battleship!");
							}
					}
					else if (store == 3) {
						comSCount ++;
							if (comSCount == 3) {
								System.out.println("You sunk your opponent's submarine!");
							}
					}
					else if (store == 2) {
						comDCount ++;
							if (comDCount == 3) {
								System.out.println("You sunk your opponent's destroyer!");
							}
					}
					else {
					comPCount ++;
						if (comPCount == 2) {
							System.out.println("You sunk your opponent's patrol boat!");
						}
				}
		}
		
		else if (comACount == 5 && comBCount == 4 && comSCount == 3 && comDCount == 3 && comPCount == 2) {
			System.out.println("CONGRATULATIONS!!! YOU DEFEATED THE COMPUTER!!!! \n\nYOU WON!!!");
			loopEnder ++;
			break;
		}
		
		else {
			System.out.println("You missed... There were no ships where you guessed.\n");
		}
		
	System.out.println("Your opponent will now take their guess.");
		guess = ((int)Math.random()*10);
		estimate = ((int)Math.random()*10);
		
		if (guess == 0) {
			guess ++;
		}

		if (estimate == 0) {
			estimate ++;
		}
		
		System.out.println("The computer guessed point (" + estimate + ", " + guess +").");
		
			if (user[estimate][guess] != 0) {
				System.out.println("You got hit!!!");
					user[estimate][guess] = store;
					user[estimate][guess] = 0;
					if (store == 5) {
						System.out.println("It was your aircraft carrier that got hit!");
						userACount ++;
							if(userACount == 5) {
								System.out.println("Your aircraft carrier had completely sunk.");
							}
					}
					else if (store == 4) {
						System.out.println("It was your battleship that got hit!");
						userBCount ++;
							if (userBCount == 3) {
								System.out.println("Your battleship had completely sunk.");
						}
					}	
					else if (store == 2) {
						System.out.println("It was your submarine that got hit!");
						userSCount ++;
							if (userSCount == 1) {
								System.out.println("Your submarine had completely sunk.");
							}
					}
					else if (store == 4) {
						System.out.println("It was your destroyer that got hit!");
						userDCount ++;
							if (userDCount == 3) {
								System.out.println("Your destroyer had completely sunk.");
							}
					}
					else {
						System.out.println("It was your patrol boat that got hit!");
						userPCount ++;
							if (userPCount == 2) {
								System.out.println("Your patrol boat had completely sunk");
							}
					}
			}
			
			else {
				System.out.println("Your opponent missed you. Phew!");
			}
			
			System.out.println("This is your grid so far:\n");
							
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
			
				
			System.out.println("Remember, if you want to quit, enter a value greater than 10");
			if (userACount == 5 && userBCount == 4 && userSCount == 3 && userDCount == 3 && userPCount == 2){
				System.out.println("Nooooo!!! ALL YOUR SHIPS WERE SUNK!!! You lost...\n\nGAME OVER.");
				loopEnder ++;
			}
			
			
			guess = 0;
			estimate = 0;
			
	}// end of while loop	

	System.out.println("\n\nThank you for playing today!!!");
	
	}

}
