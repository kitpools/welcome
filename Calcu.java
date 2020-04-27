public class Calcu {

	public static void main(String[] args) {
				
		int sum = 0;
				
		for(int i = 0; i<args.length; i++) {
			
			try {				
				sum += Integer.parseInt(args[i]);
			}
			catch (NumberFormatException e) {
				System.out.println(args[i] + "�� �Ǽ��Դϴ�. ������ �ٽ� �Է����ּ���");
				
				continue;				
			}
		}
		
		System.out.println("�������� �հ�: " + sum);
	}
}