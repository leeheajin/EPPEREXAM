import java.util.*;

public class E_2018_6_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		str1 = str1.toLowerCase(); // 모두 소문자로 바꾸기
		str2 = str2.toLowerCase();

		char[] c1 = str1.toCharArray(); // 배열로 직접 바꿈
		char[] c2 = str2.toCharArray();
		
		Arrays.sort(c1); // 각각 오름차순 정렬
		Arrays.sort(c2);
		
		if (c1.length!=c2.length) {
			System.out.println("No");
			return;
		}
		
		else {
			for (int i=0; i<c1.length; i++) {
				if (c1[i]!=c2[i]) {
					System.out.println("No");
					return;
				}
			}
		}
		
		System.out.println("Yes");
	}

}

// 혹은 오름차순 정렬 이후에 다시 String으로 바꾸어 equals를 사용할 수도 있음
