/* ��7�� Programming ���� 5�� - (2)
 * �̸� : �����
 * �й� : 20163014
 * ������ : 2017.11.14 */
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
	HashMap<String, Student> a = new HashMap<String, Student>();     // �ؽø� ����
	Scanner scanner = new Scanner(System.in);
	
	private void read() {
		System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
		
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");     // ,�� text ���ڿ��� �и��ϴ� ��Ʈ�� ��ũ������ ����
			
			String name = st.nextToken().trim();
			String dep = st.nextToken().trim();
			int num = Integer.parseInt(st.nextToken().trim());
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, dep, num, grade);
			a.put(name, student);     // �ؽøʿ� ����
		}
	}
	
	private void printAll() {
		Set<String> key = a.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("---------------------------");
		
		while (it.hasNext()) {     
			String name = it.next();     // �̸� �˾Ƴ�
			Student student = a.get(name);     // �̸��� Ű���Ͽ� �ؽø����� Student ��ü ��

			System.out.println("�̸� : " + student.name);
			System.out.println("�а� : " + student.dep);
			System.out.println("�й� : " + student.num);
			System.out.println("������� : " + student.grade);
			System.out.println("---------------------------");
		}		
	}
	
	private void search() {
		while(true) {
			System.out.print("�л� �̸� >> ");
			String name = scanner.nextLine();     // �л� �̸� �Է�
			if(name.equals("�׸�"))
				return;     // ����
			
			Student student = a.get(name);      // �ؽøʿ��� �̸��� Ű�� �˻�
			if(student == null)      // �̸��� �ؽøʿ� ���ٸ�
				System.out.println(name + " �л��� �����ϴ�.");
			else      // �ؽøʿ��� �˻���  Student ��ü
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
