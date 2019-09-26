
import java.util.*;

public class E_2018_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int n = sc.nextInt(); // 입력받을 숫자의 개수
		for (int i=0; i<n; i++) {
			list.add(sc.nextInt()); // n개의 숫자를 arraylist에 저장
		}
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		int sum = 0;
		
		for(int x=i; x<=j; x++) {
			sum += list.get(x-1);
		}
		
		System.out.println(sum);
		
	}

}
