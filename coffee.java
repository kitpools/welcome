import java.util.Scanner;

public class coffee {
	
	static int coffee_machine(int button) {
	
		System.out.println("# 1.(자동으로) 뜨거운 물을 준비한다.");
		
		System.out.println("# 2.(자동으로) 종이컵을 준비한다.");
		
		
		switch(button) {
		
		case 1:
			System.out.println("# 3.(자동으로) 보통커피를 탄다.");
			break;
			
		case 2:
			System.out.println("# 3.(자동으로) 설탕커피를 탄다.");
			break;
			
		case 3:
			System.out.println("# 3.(자동으로) 블랙커피를 탄다.");
			break;
			
		default:
			System.out.println("# 3.(자동으로) 아무거나를 탄다.");
			break;
		}
		
		System.out.println("# 4.(자동으로) 물을 붓는다.");
		System.out.println("# 5.(자동으로) 스푼으로 저어서 녹인다.\n");
		
		return 0;
		
		
			
		
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int coffee;
		int ret;
		String name;
		String none = "none";
		
		
		while (true) {
			
			System.out.print("성함을 적어주세요 : ");
		
			name = scan.nextLine();

			if(name.equals(none)) {
			
				System.out.println("프로그램을 종료합니다.");
				
				break;
			}
			
			else {
				System.out.println(name + "님, 어떤 커피를 드릴까요? (1:보통, 2:설탕, 3:블랙)");
				coffee = scan.nextInt();
				ret = coffee_machine(coffee);
			
				System.out.println(name + "님, 커피 나왔습니다.\n");
				
				scan.nextLine();
				
			}
		
			
		}
		
	}
	
}
