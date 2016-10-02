package cashregister;
import java.util.Scanner;
public class MakeChange {
	public static void main(String[] args) {
	
	Scanner keyboard=new Scanner(System.in);
	double total=0.0, tender=0.0;
	int twenty=0; 
	int ten=0; 	
	int five=0; 
	int one=0; 
	int quarter=0; 
	int dime=0; 
	int nickel=0; 
	int penny=0; 
	
	System.out.print("Enter the total :");
	total=keyboard.nextDouble();
	
	System.out.print("Enter amount tendered :");
	tender=keyboard.nextDouble(); 
	
	
	total=(tender-total); 
	System.out.println(+total);
	total = (total+.005)*100;
	total = (int) total;
	total = total/100;
	System.out.println(+total);
	
	while(total >= .01 ){
	
		
		if (total > 20){
			twenty++;
			total=total-20;
		}
		
		if (total >= 10 && total <20 ){
			ten++; 
			total=total-10;
		}
		if (total >= 5 && total <10 ){
			five++; 
			total=total-5;
		}
		if (total >= 1 && total <5 ){
			one++;
			total=total-1;
			System.out.println("one");
		}
		if (total >= 0.25 && total <1 ){
			System.out.println("quarter");
			quarter++; 
			total=total-0.25;
		}
		if (total >= 0.1 && total < 0.25 ){
			dime++; 
			total=total-0.1;
		}	
		if (total >= 0.05 && total <0.1 ){
			System.out.println("Nickel");
			nickel++; 
			total=total-0.05;
		}
		
		if (total >= 0.01 && total <0.05 ){
			System.out.println("Penny");
			penny++; 
			total=total-0.01; 
			System.out.println(total);
		}
		
	}// end while
	
	System.out.println("Change = ");
	System.out.println(twenty+ " x $20");
	System.out.println(ten+ " x $10");
	System.out.println(five+ " x $5");
	System.out.println(one+ " x $1");
	System.out.println(quarter+ " x Quarter");
	System.out.println(dime+ " x Dime");
	System.out.println(nickel+ " x Nickel");
	System.out.println(penny+ " x Penny");	
		
	
		
		

		//The user is prompted asking for the price of the item.
		//The user is then prompted asking how much money was tendered by the customer.
		//Display an appropriate message if the customer provided too little money or the exact amount.
		//If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.


	}//end main

}
