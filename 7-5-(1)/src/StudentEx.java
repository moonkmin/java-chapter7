/* ��7�� Programming ���� 5 - (1)
 * �̸� : �����
 * �й� : 20163014
 * ������ : 2017.11.14 */
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
	ArrayList<Student> a = new ArrayList<Student>();     // Student ��ü�� �����ϴ� ArrayList ����
	Scanner scanner = new Scanner(System.in);
	
	private void read() {
		System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");     // ,�� text ���ڿ��� �и��ϴ� ��Ʈ�� ��ũ������ ����
			
			String name = st.nextToken().trim();
			String dep = st.nextToken().trim();
			String num = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, dep, num, grade);
			a.add(student);      // ArrayList�� ����
		}			
		System.out.println("---------------------------");
	}
	
	private void printAll() { 
		Iterator<Student> it = a.iterator();     // Student ��ü ��Ҹ� ���� �˻��� Iterator ��ü ����
		
		while (it.hasNext()) {
			Student student = it.next();
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
			
			for(int i=0; i<a.size(); i++) {     // a�� �ִ� ��� �л� �˻�
				Student student = a.get(i);     // i��° �л� ��ü
				if(student.name.equals(name)) {     //  �̸��� ���� Student ã��
					System.out.println(student.name + ", " + student.dep + ", " + student.num + ", " + student.grade);
					break;     // for ���� ���
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
