import java.util.Scanner;

public class ScannerName {

	public static void main(String[] args) {
	
		System.out.println("이름과 학번을 입력 : ");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.println("이름은 : " + name);
		
		int code = scanner.nextInt();
		System.out.println("학번은 : " + code);
		
		scanner.close();
		
		int sum = code%100 + 100;
		
		byte num = (byte)sum;
		
		
		System.out.print("마지막 두 숫자 +100은 : ");
		System.out.println(num&0xff);

	}

}
