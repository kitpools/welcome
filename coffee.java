import java.util.Scanner;

public class coffee {
	
	static int coffee_machine(int button) {
	
		System.out.println("# 1.(�ڵ�����) �߰ſ� ���� �غ��Ѵ�.");
		
		System.out.println("# 2.(�ڵ�����) �������� �غ��Ѵ�.");
		
		
		switch(button) {
		
		case 1:
			System.out.println("# 3.(�ڵ�����) ����Ŀ�Ǹ� ź��.");
			break;
			
		case 2:
			System.out.println("# 3.(�ڵ�����) ����Ŀ�Ǹ� ź��.");
			break;
			
		case 3:
			System.out.println("# 3.(�ڵ�����) ��Ŀ�Ǹ� ź��.");
			break;
			
		default:
			System.out.println("# 3.(�ڵ�����) �ƹ��ų��� ź��.");
			break;
		}
		
		System.out.println("# 4.(�ڵ�����) ���� �״´�.");
		System.out.println("# 5.(�ڵ�����) ��Ǭ���� ��� ���δ�.\n");
		
		return 0;
		
		
			
		
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int coffee;
		int ret;
		String name;
		String none = "none";
		
		
		while (true) {
			
			System.out.print("������ �����ּ��� : ");
		
			name = scan.nextLine();

			if(name.equals(none)) {
			
				System.out.println("���α׷��� �����մϴ�.");
				
				break;
			}
			
			else {
				System.out.println(name + "��, � Ŀ�Ǹ� �帱���? (1:����, 2:����, 3:��)");
				coffee = scan.nextInt();
				ret = coffee_machine(coffee);
			
				System.out.println(name + "��, Ŀ�� ���Խ��ϴ�.\n");
				
				scan.nextLine();
				
			}
		
			
		}
		
	}
	
}
