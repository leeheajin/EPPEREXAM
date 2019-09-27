
import java.util.*;

public class E_2018_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if (N<M) { // 만약 가로 < 세로 일 경우에는 가로를 더 긴 값으로 교체
			int tmp = N;
			N = M;
			M = tmp;
		}
		
		ArrayList<Integer> tile = new ArrayList<>(); // 가능한 정답들을 저장
		
		tile.add(1); // 1X1 타일은 무조건 가능
		
		for (int i=2; i<=M; i++) { // 최대 세로 크기까지만 가능
			if (N%i>2) { // 나머지가 2 이상인 경우, 해당 타일을 사용할 수 없음
				continue;
			}
			
			if (N%i==0) {
				if ((M-2)%i==0)  // 대칭 모양으로 채워지는 경우
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
		

		for (int i=0; i<tile.size(); i++) { // 정답 타일을 모두 출력
			System.out.print(tile.get(i)+" ");
		}

	}

}
