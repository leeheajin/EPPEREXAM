
import java.util.*;

public class E_2018_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt(); // ¹øÈ£Ç¥ n
		
		int roomnumber;
		int number;
		
		if (n%15==0) {
			roomnumber = n/15;
			number = 15;
		}

		else {
			roomnumber = n/15 + 1;
			number = n%15;
		}
		
		System.out.println(roomnumber+" "+number);
	}

}
