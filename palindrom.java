import java.util.Scanner;

public class palindrom {

	
	public static String Palindrom(String str) {
		
		return (new StringBuffer(str)).reverse().toString();		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		String str = sc.nextLine();		

		System.out.printf("�Ųٷ� ����� �� : %s\n", Palindrom(str));
				
	}

}
