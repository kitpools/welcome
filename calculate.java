import java.util.Scanner;
 
public class calculate {
 
  public static void main(String[] args) {
	  
	  
	  String id;
	  String trueID = "calculate";
	  String trueexit = "exit";
	  Scanner scan = new Scanner(System.in);
	  
	  
	  
	  while(true){
		  
		  System.out.print("°è»ê±â¸¦ ½ÇÇàÇÏ·Á¸é calculate¸¦ ÀÔ·ÂÇÏ¼¼¿ä >> ");
		  id = scan.next();		  
		  
	  if(id.equals(trueID)) {
		  
		  //°è»ê±â
		  
		  int sum = 0;
		  System.out.print("ÀÔ·ÂÇÏ¼¼¿ä : ");
		  int num = scan.nextInt();
		  System.out.println("1.µ¡¼À 2.»¬¼À 3.°ö¼À 4.³ª´°¼À");
		  int sign = scan.nextInt();
		  System.out.println("ÀÔ·ÂÇÏ¼¼¿ä : ");
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
			  System.out.println("Á¾·á.");
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
