/*Q wap to demonstrate ternary operator .define a variable marks  .
ask its value from user and using ternary operator 
check if marks > 40 store "Pass" in result variable else store "Fail"*/

package assignment_1;


import java.util.Scanner;
public class question_1 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Your Mark");
		int mark = s1.nextInt();
		String result= (mark>40)?"Pass":"Fail";
		System.out.println(result);
	}

	

}