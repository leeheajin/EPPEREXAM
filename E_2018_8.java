import java.util.Scanner;

public class E_2018_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt(); // testcase
		
		int num [] = new int [n];
		int width[] = new int [n]; // 각각의 가로, 세로 값을 저장하기 위한 값
		int height[] = new int [n];
		
		for (int i=0; i<n; i++) {
			num[i] = sc.nextInt(); // n개의 입력을 저장하는 배열
		}
		
		for (int i=0; i<n; i++) { // 입력에 대해 n번 수행
			
			int count;

			for (count=0; num[i]>=Math.pow(count,2)+1; count++);
			count--;
			
			int start = (int)Math.pow(count, 2)+1; // 해당 라인에서 시작점 (제일 작은 값)
			
			if (count%2==0) { // count가 짝수인 경우
				width[i]=count;
				height[i]=0;
				for (int j=start; j<=num[i]; j++) { // 시작점부터 한칸 씩 이동
					if (j<=start+count) height[i]++;
			
					else width[i]--;
				}
			}
			
			else { // count가 홀수인 경우
				width[i]=0;
				height[i]=count;
				for (int j=start; j<=num[i]; j++) { // 시작점부터 한칸 씩 이동
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
