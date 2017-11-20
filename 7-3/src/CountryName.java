/* 제7장 Programming 문제 3번
 * 이름 : 문경민
 * 학번 : 20163014
 * 제출일 : 2017.11.14 */
import java.util.*;
public class CountryName {
	public static void main(String[] args) {
		// 나라와 인구를 저장할 해시맵 생성
		HashMap<String, Integer> country = new HashMap<String, Integer>();   
		Scanner scanner = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
		
		while(true) {
			System.out.print("나라 이름, 인구 >> ");     
			String k = scanner.next();     // 나라 입력
			if(k.equals("그만")) {
				break;     // 입력 끝 
			}
			int v = scanner.nextInt();     // 인구 입력
			country.put(k, v);     // 해시맵에 나라 이름과 인구 저장
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String con = scanner.next();
			if(con.equals("그만")) {
				break;     // 검색 끝
			}
		
			Integer people = country.get(con);     // 인구 알아내기
			
			if(people == null)
				System.out.println(con + " 나라는 없습니다.");
			else
				System.out.println(con + "의 인구는 " + people);
		}
		scanner.close();
	}
}
