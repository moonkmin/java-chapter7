/* ��7�� Programming ���� 4��
 * �̸� : �����
 * �й� : 20163014
 * ������ : 2017.11.14 */
import java.util.*;
public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();     // ���� ���� �ٷ�� ���� ����
		Scanner scanner = new Scanner(System.in);
		int count = 0, sum = 0, avg = 0;;
		
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����) >> ");
			int rain = scanner.nextInt();

			if(rain == 0) {     // 0�� �Է��ϸ� ����
				System.out.println("�����մϴ�...");
				break;
			}
			
			v.add(v.size(), rain);     // v.size()��° �ش��ϴ� �迭�� ������ ����
			sum += v.get(v.size()-1);     // �� ���ϱ�
			avg = sum / v.size();     // ���� ������ ũ��� ������ ��� ���ϱ�
			
			for(int i=0; i<v.size(); i++) {
				System.out.print(v.get(i) + " ");     // ���� ���� ��� ���� ���
			}
			
			System.out.println("");
			System.out.println("���� ��� " + avg);
		}
		scanner.close();
	}
}
