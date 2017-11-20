/* 제7장 Programming 문제 4번
 * 이름 : 문경민
 * 학번 : 20163014
 * 제출일 : 2017.11.14 */
import java.util.*;
public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();     // 정수 값만 다루는 벡터 생성
		Scanner scanner = new Scanner(System.in);
		int count = 0, sum = 0, avg = 0;;
		
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			int rain = scanner.nextInt();

			if(rain == 0) {     // 0을 입력하면 종료
				System.out.println("종료합니다...");
				break;
			}
			
			v.add(v.size(), rain);     // v.size()번째 해당하는 배열에 강수량 삽입
			sum += v.get(v.size()-1);     // 합 구하기
			avg = sum / v.size();     // 합을 벡터의 크기로 나누어 평균 구하기
			
			for(int i=0; i<v.size(); i++) {
				System.out.print(v.get(i) + " ");     // 벡터 속의 모든 정수 출력
			}
			
			System.out.println("");
			System.out.println("현재 평균 " + avg);
		}
		scanner.close();
	}
}
