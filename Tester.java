
public class Tester {

	public static void main(String[] args) {
		
	int user [][] =	new int [11][11];
	
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
