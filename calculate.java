import java.util.Scanner;
 
public class calculate {
 
  public static void main(String[] args) {
	  
	  
	  String id;
	  String trueID = "calculate";
	  String trueexit = "exit";
	  Scanner scan = new Scanner(System.in);
	  
	  
	  
	  while(true){
		  
		  System.out.print("���⸦ �����Ϸ��� calculate�� �Է��ϼ��� >> ");
		  id = scan.next();		  
		  
	  if(id.equals(trueID)) {
		  
		  //����
		  
		  int sum = 0;
		  System.out.print("�Է��ϼ��� : ");
		  int num = scan.nextInt();
		  System.out.println("1.���� 2.���� 3.���� 4.������");
		  int sign = scan.nextInt();
		  System.out.println("�Է��ϼ��� : ");
		  int num2 = scan.nextInt();
		  
		  switch(sign)
		  {
		  case 1:
			  sum = num+num2;
			  System.out.println(num + " + " + num2 + " = " + sum);
			  
			  break;
			  
		  case 2:
			  sum = num-num2;
			  System.out.println(num + " - " + num2 + " = " + sum);
			  
			  break;
		  case 3:
			  sum = num*num2;
			  System.out.println(num + " * " + num2 + " = " + sum);
			  
			  break;
		  case 4:
			  sum = num/num2;
			  System.out.println(num + " / " + num2 + " = " + sum);
			  
			  break;
		  }
		  
		  
		  
		  
		  
		  
		  
	
		  }
	  
	  else {
		  if(id.equals(trueexit)) {
			  System.out.println("����.");
			  break;
		  }
		  else {
			  System.out.println("wrong input");
			  continue;
		  }
		  
	  }
	  break;
	  
  } 
 
}
}
