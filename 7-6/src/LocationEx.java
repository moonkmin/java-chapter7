/* ��7�� Programming ���� 6��
 * �̸� : �����
 * �й� : 20163014
 * ������ : 2017.11.14 */
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
	HashMap<String, Location> a = new HashMap<String, Location>();     // �ؽø� ����
	Scanner scanner = new Scanner(System.in);

	private void read() {
		System.out.println("����,�浵,������ �Է��ϼ���.");
		
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");     // ,�� text ���ڿ��� �и��ϴ� ��Ʈ�� ��ũ������ ����
			
			String city = st.nextToken().trim();
			int x = Integer.parseInt(st.nextToken().trim());
			int y = Integer.parseInt(st.nextToken().trim());
			
			Location location = new Location(city, x, y);
			a.put(city, location);     //�ؽøʿ� ����
		}
	}
	private void printAll() {
		Set<String> key = a.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("---------------------------");
		
		while (it.hasNext()) {     
			String city = it.next();     // ���� �˾Ƴ�
			Location location = a.get(city);     // ���ø� Ű���Ͽ� �ؽø����� Location ��ü ��

			System.out.println(location.city + " " + location.x + " " + location.y);
		}		
		System.out.println("---------------------------");
	}

	private void search() {
		while(true) {
			System.out.print("���� �̸� >> ");
			String city = scanner.nextLine();     // ���� �̸� �Է�
			if(city.equals("�׸�"))
				return;     // ����
			
			Location location = a.get(city);      // �ؽøʿ��� ���ø� Ű�� �˻�
			if(location == null)      // ���ð� �ؽøʿ� ���ٸ�
				System.out.println(city + "�� �����ϴ�.");
			else      // �ؽøʿ��� �˻���  Location ��ü
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
