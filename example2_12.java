import java.util.Scanner;

public class example2_12 {

	public static void main(String[] args) {
		
		String grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(0~100):");
		int score = scanner.nextInt();
		if(score >= 95)
			grade = "A+";
		else if(score >= 90)
			grade = "A";
		else if(score >= 85)
			grade = "B+";
		else if(score >= 80)
			grade = "B";
		else if(score >= 75)
			grade = "C+";
		else if(score >= 70)
			grade = "C";
		else if(score >= 65)
			grade = "D+";
		else if(score >= 60)
			grade = "D";
		else
			grade = "F";
		System.out.println("������ " + grade + "�Դϴ�.");
		
		scanner.close();
		
	}

}
