/* ��7�� Programming ���� 2��
 * �̸� : �����
 * �й� : 20163014
 * ������ : 2017.11.14 */
import java.util.*;
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();     // ���ڿ��� ���� ������ ArrayList ����
		Scanner scanner = new Scanner(System.in);     // Scanner ��ü ����
		
		System.out.print("6�� ������ �� ĭ���� �и� �Է�(A/B/C/D/F) >> ");
		for(int i=0; i<6; i++) {
			String s = scanner.next();     // Ű����κ��� ������ �Է�
			a.add(s);     // ArrayList �÷��ǿ� ����
		}
		
		double score[] = new double [a.size()];
		double sum = 0;
		
		for(int i=0; i<a.size(); i++) {     // ArrayList�� �ִ� ������ ������ ��ȯ
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
		System.out.println(sum/a.size());     // ������ ���� �Է� ���� ���� ��ŭ ���� ��� ���
		scanner.close();
	}
}
