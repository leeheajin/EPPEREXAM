import java.util.*;

public class E_2018_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int sum = 0;
		
		ArrayList<Integer> num = new ArrayList<>(); // 9���� ���ڸ� ���� �ϱ� ���� ��̸���Ʈ
		
		for (int i=0; i<9; i++) { // 9���� ���ڸ� �Է� ����
			num.add(sc.nextInt());
		}
		
		
		for (int i=0; i<9; i++) { // 9�� ������ �� ���� ����
			sum+=num.get(i);
		}
		
		for (int x=0; x<8; x++) {
			for (int y=x+1; y<9; y++) {

				if (sum-num.get(x)-num.get(y)==100 && x!=y) { // �ش� ��츦 ã�� ���
					num.remove(y); // �ڿ� �ִ� y���� �����ؾ� ������ �߻����� ����
					num.remove(x);
					
					
					for (int i=0; i<7; i++) {
						System.out.print(num.get(i)+" ");
					}
					return;
				}
			}
		}
	}

}
