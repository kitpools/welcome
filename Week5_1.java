import java.util.Scanner;

public class Week5_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str, strrep, strss, strspl[];
		int strlen, strind, strlind;
		
		System.out.print("���ڿ��� �Է��ϼ���. \n>> ");
		
		str = sc.nextLine();
		strlen = str.length();
		strind = str.indexOf("java");
		strlind = str.lastIndexOf("java");
		strrep = str.replace("java", "�ڹ�");
		strss = str.substring(0, 2);
		strspl = str.split(" ");
		
		
		
		
		System.out.println("���ڿ� ����: " + strlen);
		System.out.println("java�� ó�� ������ ��ġ: " + strind);
		System.out.println("java�� ���������� ������ ��ġ: " + strlind);
		System.out.println("�� ó�� 2����: " + strss);
		System.out.println("�빮�ڷ� ġȯ: " + str.toUpperCase());
		System.out.println("�ҹ��ڷ� ġȯ: " + str.toLowerCase());
		
		for(int i = 0; i < strspl.length; i++)
			System.out.println("�и��� ���ڿ�" + i + ": " + strspl[i]);

		System.out.println("java�� �ڹٷ� �ٲ� ���ڿ�: " + strrep);
		System.out.println("���� ����: " + str.trim());
		
		

	}

}
