package trainingTns;

public class Loops {

	public static void main(String[] args) {
		// For loop
		System.out.println("For Loop");
		for (int i=1;i<=100;i++) {System.out.println(i);}
		
		// while loop
		System.out.println("While Loop");
		int j=100;
		while(j>=0) {
			System.out.println(j);
			j--;
		}
		//Do while loop
		System.out.println("Do-While Loop");
		int k=-11;
		do {
			System.out.println("This is do while executed once");
		k++;
		}while(k>=1);
		
		
		//For each
		int a[]= {1,2,3,4,5};
		for(int i:a) {System.out.println(i);}
		
		char c[]= {'M','a','h','e','k'};
		for(char i:c) {System.out.print(i);}
		
	}

}
