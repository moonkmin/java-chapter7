/* 제7장 Programming 문제 2번
 * 이름 : 문경민
 * 학번 : 20163014
 * 제출일 : 2017.11.14 */
import java.util.*;
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();     // 문자열만 삽입 가능한 ArrayList 생성
		Scanner scanner = new Scanner(System.in);     // Scanner 객체 생성
		
		System.out.print("6의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		for(int i=0; i<6; i++) {
			String s = scanner.next();     // 키보드로부터 학점을 입력
			a.add(s);     // ArrayList 컬렉션에 삽입
		}
		
		double score[] = new double [a.size()];
		double sum = 0;
		
		for(int i=0; i<a.size(); i++) {     // ArrayList에 있는 학점을 점수로 변환
			switch(a.get(i)) {
			case "A":
				score[i] = 4.0;
				break;
			case "B":
				score[i] = 3.0;
				break;
			case "C":
				score[i] = 2.0;
				break;
			case "D":
				score[i] = 1.0;
				break;
			case "F":
				score[i] = 0;
				break;
			}
			sum += score[i];
		}
		System.out.println(sum/a.size());     // 학점의 합을 입력 받은 개수 만큼 나눠 평균 출력
		scanner.close();
	}
}
