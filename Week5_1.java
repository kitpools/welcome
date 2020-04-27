import java.util.Scanner;

public class Week5_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str, strrep, strss, strspl[];
		int strlen, strind, strlind;
		
		System.out.print("문자열을 입력하세요. \n>> ");
		
		str = sc.nextLine();
		strlen = str.length();
		strind = str.indexOf("java");
		strlind = str.lastIndexOf("java");
		strrep = str.replace("java", "자바");
		strss = str.substring(0, 2);
		strspl = str.split(" ");
		
		
		
		
		System.out.println("문자열 길이: " + strlen);
		System.out.println("java가 처음 나오는 위치: " + strind);
		System.out.println("java가 마지막으로 나오는 위치: " + strlind);
		System.out.println("맨 처음 2글자: " + strss);
		System.out.println("대문자로 치환: " + str.toUpperCase());
		System.out.println("소문자로 치환: " + str.toLowerCase());
		
		for(int i = 0; i < strspl.length; i++)
			System.out.println("분리한 문자열" + i + ": " + strspl[i]);

		System.out.println("java를 자바로 바꾼 문자열: " + strrep);
		System.out.println("공백 제거: " + str.trim());
		
		

	}

}
