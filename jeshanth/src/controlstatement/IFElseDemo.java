package controlstatement;

import java.util.Scanner;

public class IFElseDemo {

int number; 


void checkIFElseDemo(int number) {

if (number%2==0) { 
	System.out.printf( number+ "is an Even Number ."); 
}

else { 
	System.out.printf(number+ "is an Odd Number .") ;
}




} 




public static void main(String[] args) {
	IFElseDemo demo=new IFElseDemo();  
	Scanner Scanner=new Scanner(System.in); 
	System.out.printf("Enter Number : " ); 
	int number=Scanner.nextInt(); 
	demo.checkIFElseDemo(number);
	
}


void checkElseIF(int number) { 
	if (number<35) { 
		System.out.printf("FAIL"); 
		
	} 
	else if(number>=35 && number<60) { 
		System.out.printf("pass class"); 
	} 
	else if(number>=74 && number<74) { 
		System.out.printf("first class"); 
		
	}  
	
	else if(number>=74 && number<=100) { 
		System.out.printf("Distinction"); 
	} 
	else { 
		System.out.printf("Invalid"); 
	}
	
		
		
		
		
		
	}
	
} 











