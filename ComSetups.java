
public class ComSetups {

	public static void main(String[] args) {
//*************************************************SET UP NO. 1	
	int [][] com1 = new int [11][11];
		
		int [] aircraftC = {5,5,5,5,5}; //aircraft carrier
		int [] battleS = {4,4,4,4}; //battleship
		int [] sub = {3,3,3}; //destroyers
		int [] des = {2,2,2}; //submarine
		int [] patrolB = {1,1}; //patrol boat
			
			for (int laziness = 0; laziness < aircraftC.length; laziness ++) {
				com1[10][laziness + 1]= aircraftC[laziness];
			}
			
			for (int laziness = 0; laziness < battleS.length; laziness ++) {
				com1[laziness+2][6 ]= battleS[laziness];
			}
			
			for (int laziness = 0; laziness < sub.length; laziness ++) {
				com1[laziness+4][4]= sub[laziness];
			}
			
			for (int laziness = 0; laziness < des.length; laziness ++) {
				com1[1][laziness+3] = des[laziness];
			}
			
			for (int laziness = 0; laziness < patrolB.length; laziness ++) {
				com1[5][laziness+1]= patrolB[laziness];
			}
			
//*************************************************SET UP NO. 2
	int [][] com2 = new int [11][11];
		
		for (int laziness = 0; laziness < aircraftC.length; laziness ++) {
			com2[7][laziness + 1]= aircraftC[laziness];
		}
		
		for (int laziness = 0; laziness < battleS.length; laziness ++) {
			com2[laziness+3][8]= battleS[laziness];
		}
		
		for (int laziness = 0; laziness < sub.length; laziness ++) {
			com2[5][laziness+2]= sub[laziness];
		}
		
		for (int laziness = 0; laziness < des.length; laziness ++) {
			com2[2][laziness+3] = des[laziness];
		}
		
		for (int laziness = 0; laziness < patrolB.length; laziness ++) {
			com2[laziness+9][4]= patrolB[laziness];
		}
		

	}

}
