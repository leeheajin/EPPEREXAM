import java.util.*;

public class E_2018_3_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		String str = sc.next(); // 한 줄을 입력 받음
		
		StringTokenizer st = new StringTokenizer(str,"-",false); // -은 출력하지 않기 위해 false를 인자값으로 전달

		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken().charAt(0));
		}
		
		System.out.println(); 
		
	}

}
