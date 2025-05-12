
package trainingTns;
import java.util.*;


public class ControlStatements {

	public static void main(String[] args) {
		// Decision Making
		/*1.If
		 * 2.If---else
		 * 3.If-- else if--else
		 * */
		
		
int age=18;
if(age==21) {
System.out.print("Married");
	}

int age1=91;
if (age1==18) {System.out.println("Teen");}
else  {System.out.println("Adult");}


int n1=4;
int n2=8;
if(!(n1>n2) || (n1==n2)) {
	System.out.println("Condition is True");
}
else {
	System.out.println("Condition is False");
}


//Nested 
int x=8,y=9,z=4;
if(x>y) {
	if(x>z) {
		System.out.println("X is greater");
	}
	else {System.out.println("z is greater");}
}

	
	if(y>z) {
		if(y>x) {
			System.out.println("y is greater");
		}
		else {System.out.println("x is greater");}
	}

	
	
	//Jump Statements
	
	//break
	for (int i=5;i<10;i++)
	{
		if(i==5)
		System.out.println(i);
		System.out.println("HIii");
		break;
	}
	
	//continue
	for(int i=5;i<15;i++) {
		if(i%2!=0)
			continue; // skip the above operation of odd
		System.out.println(i+" ");
	}
	
	//switch
	int demo=1;
	switch(demo)
	{
	case 1:
		System.out.println("You ordered Pizza");
		break;
	case 2:
		System.out.println("You ordered White sauce pasta");
		break;
	default:
		System.out.println("Order not placed");
		
	}
	
	
	
	
	
	
	
	
	
	
		}
	
}
