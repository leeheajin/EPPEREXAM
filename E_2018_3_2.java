import java.util.*;

public class E_2018_3_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		String str = sc.next(); // �� ���� �Է� ����
		
		StringTokenizer st = new StringTokenizer(str,"-",false); // -�� ������� �ʱ� ���� false�� ���ڰ����� ����

		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken().charAt(0));
		}
		
		System.out.println(); 
		
	}

}
