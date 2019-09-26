import java.util.Scanner;

public class E_2018_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		str1 = str1.toLowerCase(); // 모두 소문자로 바꾸기
		str2 = str2.toLowerCase();
		
		if (str1.length()!=str2.length()) {
			System.out.println("No");
			return; // 길이가 같지 않으면 애초에 같을 수 없음
		}
		
		for (int i=0; i<str1.length(); i++) { // 길이가 같은 경우
			if(str2.indexOf(str1.charAt(i))==-1) {
				System.out.println("No");
				return;
			}
			if(str1.indexOf(str2.charAt(i))==-1) { // 반대 방향의 경우도 생각해 보야아 한다 ex) Liii List와 같은 경우, 한 쪽에서만 검출 가능
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}
