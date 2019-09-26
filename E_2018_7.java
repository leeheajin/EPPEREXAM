import java.util.*;

public class E_2018_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int sum = 0;
		
		ArrayList<Integer> num = new ArrayList<>(); // 9개의 숫자를 저장 하기 위한 어레이리스트
		
		for (int i=0; i<9; i++) { // 9개의 숫자를 입력 받음
			num.add(sc.nextInt());
		}
		
		
		for (int i=0; i<9; i++) { // 9개 숫자의 총 합을 저장
			sum+=num.get(i);
		}
		
		for (int x=0; x<8; x++) {
			for (int y=x+1; y<9; y++) {

				if (sum-num.get(x)-num.get(y)==100 && x!=y) { // 해당 경우를 찾은 경우
					num.remove(y); // 뒤에 있는 y부터 삭제해야 오류가 발생하지 않음
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
