package trainingTns;

import java.util.Arrays;

public class Arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Array1[]= {2,4,6,8,10};
	System.out.println(Arrays.toString(Array1));//array format print
	for(int i=0;i<Array1.length;i++) {System.out.println(Array1[i]+" ");
	}
	//sort
	Arrays.sort(Array1);
	System.out.println(Arrays.toString(Array1));//array sort print
	
	System.out.println(Arrays.binarySearch(Array1,9));//array format print
	
	
	//compare
	int arr2[]= {2,4,6,8,10};
	System.out.println(Arrays.toString(arr2));
	//Arrays.sort(arr2);
	
	if(Arrays.compare(Array1, arr2)==0)
	{System.out.println("Same");}
	else {System.out.println("Not Same");}
	
	
	//.equals=checks data by data
	
	System.out.println(Arrays.equals(Array1, arr2));//array format print
	
	//copy array
	int a2[]=Arrays.copyOf(Array1, 3);
	System.out.println(Arrays.toString(a2));
	
	//fill method
	Arrays.fill(a2,87);
	System.out.println(Arrays.toString(a2));
	
	
	
	
	
	
	
	
	
	}

	
	
}
