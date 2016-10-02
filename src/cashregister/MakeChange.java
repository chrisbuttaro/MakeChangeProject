package cashregister;

import java.util.Scanner;
import java.text.DecimalFormat; 

public class MakeChange {
	public static void main(String[] args) {
   
        countChange(userInput());
       
	}// end main
	

	static float userInput(){
		DecimalFormat twoPlaces=new DecimalFormat("0.00");
	    Scanner  keyboard=new Scanner(System.in);
		float total=0.0f, tender=0.0f;
		
		System.out.print("Enter the total: ");
		total=keyboard.nextFloat();
		
		System.out.print("Enter amount tendered: ");
		tender=keyboard.nextFloat(); 
		keyboard.close(); 
		
		
		total=roundTwoDecimal(total); 
		total=(tender-total); 
		System.out.println("");
		System.out.println("Change Due: $" + twoPlaces.format(total));
		System.out.println("");
		
		if (total < 0){
			System.out.println("Insufficent Tender");
		} 
		if(total == 0.0){
			System.out.println("No Change Due");
		}
		return total;
	}//end userInput
	
	static void countChange(float Total){
	
	int twenty=0; 
	int ten=0; 	
	int five=0; 
	int one=0; 
	int quarter=0; 
	int dime=0; 
	int nickel=0; 
	int penny=0; 
	
	while(Total > 0 ){
		
		Total=roundTwoDecimal(Total); 
		
		if (Total >= 20f){
			twenty++;
			Total=Total-20f;
		}

		if (Total >= 10f && Total <20f ){
			ten++; 
			Total=Total-10;
		}
		if (Total >= 5f && Total <10f ){
			five++; 
			Total=Total-5;
		}
		if (Total >= 1f && Total <5f ){
			one++;
			Total=Total-1;
		}
		if (Total >= 0.25f && Total <1f ){
			quarter++; 
			Total=Total-0.25f;
		}
		if (Total >= 0.1f && Total < 0.25f ){
			dime++; 
			Total=Total-0.1f;
		}	
		if (Total >= 0.05f && Total <0.1f ){
			nickel++; 
			Total=Total-0.05f;
		}
		
		if (Total >=0.01f && Total <0.05f ){
			penny++; 
			Total=Total-0.01f; 
		}
		
		
	}//end while	

	
	if(twenty>1){
	System.out.println(twenty+ " Twenty Dollar Bills ");
		}else if(twenty ==1){
		System.out.println(twenty+ " Twenty Dollar Bill ");
		}
	
	if(ten>1){
		System.out.println(ten+ " Ten Dollar Bills ");
		}else if(ten ==1){
		System.out.println(ten+ " Ten Dollar Bill ");
		}
	
	if(five>1){
		System.out.println(five+ " Five Dollar Bills ");
		}else if(five==1){
		System.out.println(five+" Five Dollar Bill ");
		}

	if(one>1){
		System.out.println(one+" One Dollar Bills ");
		}else if(one==1){
		System.out.println(one+" One Dollar Bill ");
		}

	if(quarter>1){
		System.out.println(quarter+" Quarters ");
		}else if(quarter==1){
		System.out.println(quarter+" Quarter ");
		}

	if(dime>1){
		System.out.println(dime+" Dimes");
		}else if(dime==1){
		System.out.println(dime+" Dime");
		}
	if(nickel>1){
		System.out.println(nickel+" Nickels ");
		}else if(nickel==1){
		System.out.println(nickel+" Nickel ");
		}

	if(penny>1){
		System.out.println(penny+" Pennies ");
	}else if(penny==1){
		System.out.println(penny+" Penny ");
		
	}


	
}///end countBills
	static float roundTwoDecimal(float Total) {
		Total = (Total + .005f) * 100;
		Total = (int) Total;
		Total = Total / 100;
		return Total;
	}// end roundTwoDecimal


}
