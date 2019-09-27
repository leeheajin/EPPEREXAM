import java.util.Scanner;

public class E_2018_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); 
		int R = sc.nextInt();
		
		int time [] = new int [N+1]; // �� ������ �ҿ�Ǵ� �ð�
		int relation [][] = new int [N+1][N+1]; // [0][]���� ������ �ް�����ȣ�� ����� ��
		
		for (int i=1; i<=N ;i++) {
			time[i] = sc.nextInt();
		}
		
		for (int i=0; i<R; i++) {
			int first = sc.nextInt();
			int last = sc.nextInt();
			relation[first][last] = 1;
			relation[0][last]++;
		}
		

		int number = sc.nextInt(); // ��ǥ�Ǵ� ���� ��ȣ
		
		System.out.println(min_time(number,0,relation,time, N));
		
	}
	
	public static int min_time (int num, int now_time, int relation[][], int time[], int N) {
		
		if (relation[0][num]==0) { // ������ ������ �ϳ��� ���� ���
			return time[num] + now_time;
		}
		
		else {
			int min_time = 0;
			
			for (int i=1; i<=N; i++) {
				if (relation[i][num]!=0) {
					int x = min_time (i, time[num]+now_time, relation, time, N);
					if (min_time<x) min_time = x;
				}
			}
			
			return min_time;
		}
	}

}
