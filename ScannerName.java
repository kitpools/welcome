import java.util.Scanner;

public class ScannerName {

	public static void main(String[] args) {
	
		System.out.println("�̸��� �й��� �Է� : ");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.println("�̸��� : " + name);
		
		int code = scanner.nextInt();
		System.out.println("�й��� : " + code);
		
		scanner.close();
		
		int sum = code%100 + 100;
		
		byte num = (byte)sum;
		
		
		System.out.print("������ �� ���� +100�� : ");
		System.out.println(num&0xff);

	}

}
