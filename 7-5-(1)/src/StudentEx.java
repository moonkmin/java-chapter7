/* 제7장 Programming 문제 5 - (1)
 * 이름 : 문경민
 * 학번 : 20163014
 * 제출일 : 2017.11.14 */
import java.util.*;
class Student {
	String name, dep, num;
	double grade;
	
	public Student(String name, String dep, String num, double grade) {
		this.name = name;
		this.dep = dep;
		this.num = num;
		this.grade = grade;
	}
}
public class StudentEx {
	ArrayList<Student> a = new ArrayList<Student>();     // Student 객체를 삽입하는 ArrayList 생성
	Scanner scanner = new Scanner(System.in);
	
	private void read() {
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");     // ,로 text 문자열을 분리하는 스트링 토크나이저 생성
			
			String name = st.nextToken().trim();
			String dep = st.nextToken().trim();
			String num = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, dep, num, grade);
			a.add(student);      // ArrayList에 저장
		}			
		System.out.println("---------------------------");
	}
	
	private void printAll() { 
		Iterator<Student> it = a.iterator();     // Student 객체 요소를 순차 검색할 Iterator 객체 리턴
		
		while (it.hasNext()) {
			Student student = it.next();
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
			
			for(int i=0; i<a.size(); i++) {     // a에 있는 모든 학생 검색
				Student student = a.get(i);     // i번째 학생 객체
				if(student.name.equals(name)) {     //  이름이 같은 Student 찾음
					System.out.println(student.name + ", " + student.dep + ", " + student.num + ", " + student.grade);
					break;     // for 문을 벗어남
				}
			} 
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
