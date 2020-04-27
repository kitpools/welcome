public class Calcu {

	public static void main(String[] args) {
				
		int sum = 0;
				
		for(int i = 0; i<args.length; i++) {
			
			try {				
				sum += Integer.parseInt(args[i]);
			}
			catch (NumberFormatException e) {
				System.out.println(args[i] + "는 실수입니다. 정수로 다시 입력해주세요");
				
				continue;				
			}
		}
		
		System.out.println("정수들의 합계: " + sum);
	}
}
