
import java.util.Scanner;

public class E_2018_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		String str = sc.next();

		String data[] = str.split("-"); // �ش� ���ڿ��� �������� �߶� ���ڿ� �迭�� ����
		
		for (int i=0; i<data.length; i++) {
			System.out.print(data[i].charAt(0));
		}
		
	}

}
