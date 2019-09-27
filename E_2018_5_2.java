import java.util.Scanner;

public class E_2018_5_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String st = sc.next();
		
		String asc = "1 2 3 4 5 6 7 8";
		String des = "8 7 6 5 4 3 2 1";
		
		if (sc.equals(asc)) System.out.println("ascending");
		
		else if(sc.equals(des)) System.out.println("descending");
		
		else System.out.println("mixed");

	}

}
