import java.util.*;

public class E_2018_6_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		str1 = str1.toLowerCase(); // ��� �ҹ��ڷ� �ٲٱ�
		str2 = str2.toLowerCase();

		char[] c1 = str1.toCharArray(); // �迭�� ���� �ٲ�
		char[] c2 = str2.toCharArray();
		
		Arrays.sort(c1); // ���� �������� ����
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

// Ȥ�� �������� ���� ���Ŀ� �ٽ� String���� �ٲپ� equals�� ����� ���� ����
