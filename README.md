# VersionControl
```java
package ASSIGNMENT_2;
import java.util.Scanner;
public class question_4 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    char s;
	    do{
	    	int sum = 0;
	      System.out.println("Enter two numbers");
	      int num1= sc.nextInt();
	      int num2 = sc.nextInt();
	      sum = sum+num1+num2;
	      System.out.println("sum "+sum);
	      System.out.println("Do you wish to perform another operation, Y/N");
	      s =sc.next().charAt(0);
	    }while(s =='Y'||s=='y');
	   
	  sc.close();}
	}
