/* 제7장 Programming 문제 6번
 * 이름 : 문경민
 * 학번 : 20163014
 * 제출일 : 2017.11.14 */
import java.util.*;
class Location {     
	String city;
	int x, y;
	public Location(String city, int x, int y) {
		this.city = city;
		this.x = x;
		this.y = y;
	}
}
public class LocationEx {
	HashMap<String, Location> a = new HashMap<String, Location>();     // 해시맵 생성
	Scanner scanner = new Scanner(System.in);

	private void read() {
		System.out.println("도시,경도,위도를 입력하세요.");
		
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");     // ,로 text 문자열을 분리하는 스트링 토크나이저 생성
			
			String city = st.nextToken().trim();
			int x = Integer.parseInt(st.nextToken().trim());
			int y = Integer.parseInt(st.nextToken().trim());
			
			Location location = new Location(city, x, y);
			a.put(city, location);     //해시맵에 저장
		}
	}
	private void printAll() {
		Set<String> key = a.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("---------------------------");
		
		while (it.hasNext()) {     
			String city = it.next();     // 도시 알아냄
			Location location = a.get(city);     // 도시를 키로하여 해시맵으로 Location 객체 얻어냄

			System.out.println(location.city + " " + location.x + " " + location.y);
		}		
		System.out.println("---------------------------");
	}

	private void search() {
		while(true) {
			System.out.print("도시 이름 >> ");
			String city = scanner.nextLine();     // 도시 이름 입력
			if(city.equals("그만"))
				return;     // 종료
			
			Location location = a.get(city);      // 해시맵에서 도시를 키로 검색
			if(location == null)      // 도시가 해시맵에 없다면
				System.out.println(city + "는 없습니다.");
			else      // 해시맵에서 검색된  Location 객체
				System.out.println(location.city + " " + location.x + " " + location.y);
		}
	}
	
	public void run() {
		read();
		printAll();
		search();
	}
	
	public static void main(String[] args) {
		LocationEx n = new LocationEx();
		n.run();
	}
}
