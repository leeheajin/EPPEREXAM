import java.util.Scanner;

public class E_2018_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		str1 = str1.toLowerCase(); // ��� �ҹ��ڷ� �ٲٱ�
		str2 = str2.toLowerCase();
		
		if (str1.length()!=str2.length()) {
			System.out.println("No");
			return; // ���̰� ���� ������ ���ʿ� ���� �� ����
		}
		
		for (int i=0; i<str1.length(); i++) { // ���̰� ���� ���
			if(str2.indexOf(str1.charAt(i))==-1) {
				System.out.println("No");
				return;
			}
			if(str1.indexOf(str2.charAt(i))==-1) { // �ݴ� ������ ��쵵 ������ ���߾� �Ѵ� ex) Liii List�� ���� ���, �� �ʿ����� ���� ����
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}
