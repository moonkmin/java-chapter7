/* 제7장 Programming 문제 5번 - (2)
 * 이름 : 문경민
 * 학번 : 20163014
 * 제출일 : 2017.11.14 */
import java.util.*;
class Student {     
	String name, dep;
	int num;
	double grade;
	public Student(String name, String dep, int num, double grade) {
		this.name = name;
		this.dep = dep;
		this.num = num;
		this.grade = grade;
	}
}
public class StudentEx {
	HashMap<String, Student> a = new HashMap<String, Student>();     // 해시맵 생성
	Scanner scanner = new Scanner(System.in);
	
	private void read() {
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");     // ,로 text 문자열을 분리하는 스트링 토크나이저 생성
			
			String name = st.nextToken().trim();
			String dep = st.nextToken().trim();
			int num = Integer.parseInt(st.nextToken().trim());
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, dep, num, grade);
			a.put(name, student);     // 해시맵에 저장
		}
	}
	
	private void printAll() {
		Set<String> key = a.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("---------------------------");
		
		while (it.hasNext()) {     
			String name = it.next();     // 이름 알아냄
			Student student = a.get(name);     // 이름을 키로하여 해시맵으로 Student 객체 얻어냄

			System.out.println("이름 : " + student.name);
			System.out.println("학과 : " + student.dep);
			System.out.println("학번 : " + student.num);
			System.out.println("학점평균 : " + student.grade);
			System.out.println("---------------------------");
		}		
	}
	
	private void search() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.nextLine();     // 학생 이름 입력
			if(name.equals("그만"))
				return;     // 종료
			
			Student student = a.get(name);      // 해시맵에서 이름을 키로 검색
			if(student == null)      // 이름이 해시맵에 없다면
				System.out.println(name + " 학생은 없습니다.");
			else      // 해시맵에서 검색된  Student 객체
				System.out.println(student.name + ", " + student.dep + ", " + student.num + ", " + student.grade);
		}
	}
	
	public void run() {
		read();
		printAll();
		search();
	}

	public static void main(String[] args) {
		StudentEx s = new StudentEx();
		s.run();
	}
}
