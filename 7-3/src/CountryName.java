/* ��7�� Programming ���� 3��
 * �̸� : �����
 * �й� : 20163014
 * ������ : 2017.11.14 */
import java.util.*;
public class CountryName {
	public static void main(String[] args) {
		// ����� �α��� ������ �ؽø� ����
		HashMap<String, Integer> country = new HashMap<String, Integer>();   
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(��: Korea 5000)");
		
		while(true) {
			System.out.print("���� �̸�, �α� >> ");     
			String k = scanner.next();     // ���� �Է�
			if(k.equals("�׸�")) {
				break;     // �Է� �� 
			}
			int v = scanner.nextInt();     // �α� �Է�
			country.put(k, v);     // �ؽøʿ� ���� �̸��� �α� ����
		}
		
		while(true) {
			System.out.print("�α� �˻� >> ");
			String con = scanner.next();
			if(con.equals("�׸�")) {
				break;     // �˻� ��
			}
		
			Integer people = country.get(con);     // �α� �˾Ƴ���
			
			if(people == null)
				System.out.println(con + " ����� �����ϴ�.");
			else
				System.out.println(con + "�� �α��� " + people);
		}
		scanner.close();
	}
}
