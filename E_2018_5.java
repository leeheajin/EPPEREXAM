
import java.util.Scanner;

public class E_2018_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		String str = "";
		
		for (int i=0; i<8; i++) { 
			str = str.concat(sc.next()); // 이어 붙이는 방법
		}
		
		if (str.contains("87654321")) System.out.println("descending");
		
		else if (str.contains("12345678")) System.out.println("ascending");
		
		else System.out.println("mixed");

	}

}
