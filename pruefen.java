public class pruefen extends main{
	static boolean temp;
	static boolean temp1;
	static int gewinnAddition;
	static int y = 2;

	static boolean gewinnPruefen(int feld[], int spieler) {
		for (int i = 0; i<9; i++) {
			gewinnAddition += feld[i];
			if (i<=y && gewinnAddition == 0) {
				i = y;
				y +=3;
				gewinnAddition = 0;
				continue;
			}
			if (gewinnAddition == 3*spieler && i==y) {
				temp1 = true;
			}
		}
		return temp1;
	}
	
	static boolean zugPruefen(int feld[], int kasten) {
		if(feld[kasten] == 0) {
			temp = true;
		}
		return temp;
	}
}