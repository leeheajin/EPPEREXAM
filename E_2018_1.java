
import java.util.*;

public class E_2018_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int n = sc.nextInt(); // �Է¹��� ������ ����
		for (int i=0; i<n; i++) {
			list.add(sc.nextInt()); // n���� ���ڸ� arraylist�� ����
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
