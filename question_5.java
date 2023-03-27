/*Q 5 wap to ask product name and price of product from user and calculate discount i.e 
if price > 2000 then discount is 10 percent of price 
else 
discount is 7 % of price*/
package assignment_1;
import java.util.Scanner;
public class question_5 {

	public static void main(String[] args) {
		Scanner s5=new Scanner(System.in);
		System.out.println("Enter the name of the product");
		String P_name=s5.nextLine();
		System.out.println("Enter the price of the product");
		double P_price=s5.nextDouble();
		
		double Discount=(P_price>2000)?0.1*P_price:0.07*P_price;
		double FinalPrice= P_price-Discount;
		
		System.out.printf("The discount on %s is %f\n",P_name,Discount);
		System.out.printf("The final price of %s after the discount is %f\n",P_name,FinalPrice);
		
	}

}
