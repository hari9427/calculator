package calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		int num1,num2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 1st number");
		num1= s.nextInt();
		System.out.println("enter the 2nd number");
		num2= s.nextInt();
		System.out.println("enter the operator(+,-,*,/):");
		 char operator = s.next().charAt(0);
		 int output;
		switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;
            case '-':
            	output = num1 - num2;
            	break;
            case '*':
            	output = num1 * num2;
            	break;
            case '/':
            	output = num1 / num2;
            	break;
            default:
            	System.out.print("enter the operator");
            return;
        }
		 System.out.println(num1+" "+operator+" "+num2+": "+output);
       
        }
	}

            	
            	
            	
            	
            	
            	
            	
            	
            	
            	
            	
       
		
				
				
				
		
				
		
		
		
	


