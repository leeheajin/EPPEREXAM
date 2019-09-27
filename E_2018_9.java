
import java.util.*;

public class E_2018_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if (N<M) { // ���� ���� < ���� �� ��쿡�� ���θ� �� �� ������ ��ü
			int tmp = N;
			N = M;
			M = tmp;
		}
		
		ArrayList<Integer> tile = new ArrayList<>(); // ������ ������� ����
		
		tile.add(1); // 1X1 Ÿ���� ������ ����
		
		for (int i=2; i<=M; i++) { // �ִ� ���� ũ������� ����
			if (N%i>2) { // �������� 2 �̻��� ���, �ش� Ÿ���� ����� �� ����
				continue;
			}
			
			if (N%i==0) {
				if ((M-2)%i==0)  // ��Ī ������� ä������ ���
					tile.add(i);
				
				if ((N-2)%i==0 && (M-1)%i==0) 
					tile.add(i);
			}

			
			else if (N%i==1) {
				if ((M-1)%i==0) 
					tile.add(i);
			}
			
			else { // N%i==2
				if (M%i==0)
					tile.add(i);
			}
		}
		

		for (int i=0; i<tile.size(); i++) { // ���� Ÿ���� ��� ���
			System.out.print(tile.get(i)+" ");
		}

	}

}
