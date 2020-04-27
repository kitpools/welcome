import java.util.Scanner;

public class palindrom {

	
	public static String Palindrom(String str) {
		
		return (new StringBuffer(str)).reverse().toString();		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		String str = sc.nextLine();		

		System.out.printf("거꾸로 변경된 값 : %s\n", Palindrom(str));
				
	}

}
