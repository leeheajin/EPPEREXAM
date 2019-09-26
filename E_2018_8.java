import java.util.Scanner;

public class E_2018_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt(); // testcase
		
		int num [] = new int [n];
		int width[] = new int [n]; // ������ ����, ���� ���� �����ϱ� ���� ��
		int height[] = new int [n];
		
		for (int i=0; i<n; i++) {
			num[i] = sc.nextInt(); // n���� �Է��� �����ϴ� �迭
		}
		
		for (int i=0; i<n; i++) { // �Է¿� ���� n�� ����
			
			int count;

			for (count=0; num[i]>=Math.pow(count,2)+1; count++);
			count--;
			
			int start = (int)Math.pow(count, 2)+1; // �ش� ���ο��� ������ (���� ���� ��)
			
			if (count%2==0) { // count�� ¦���� ���
				width[i]=count;
				height[i]=0;
				for (int j=start; j<=num[i]; j++) { // ���������� ��ĭ �� �̵�
					if (j<=start+count) height[i]++;
			
					else width[i]--;
				}
			}
			
			else { // count�� Ȧ���� ���
				width[i]=0;
				height[i]=count;
				for (int j=start; j<=num[i]; j++) { // ���������� ��ĭ �� �̵�
					if (j<=start+count) width[i]++;
			
					else height[i]--;
				}
			}
			
		}
		
		for (int i=0; i<n; i++) {
			System.out.println(width[i]+1+" "+height[i]);
		}
		
	}
		
}
