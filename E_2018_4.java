
import java.util.Scanner;

public class E_2018_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt(); // 5
		
		int line;; // 1
		
		for (line=1; line<=(n-1)/2; line++) { // 중간 이전까지의 부분
			for (int i=0; i<(n-(2*line-1))/2; i++) System.out.print(" ");
			for (int i=0; i<2*line-1; i++) System.out.print("*");
			System.out.println(); // 줄을 바꿈
		}
		
		for (int i=0; i<n; i++) {
			System.out.print("*"); // 중간에 꽉찬 별 라인 프린트
		}
		System.out.println();

		for (line=(n-1)/2; line>=1; line--) { // 중간 이전까지의 부분	
			for (int i=0; i<(n-(2*line-1))/2; i++) System.out.print(" ");
			for (int i=0; i<2*line-1; i++) System.out.print("*");
			System.out.println(); // 줄을 바꿈
		}
	}

}
