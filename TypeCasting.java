package trainingTns;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Type Casting Session
		 * 1.Widening -implicit
		 * 2.Narrowing-explicit
		 * Wrapper-Converting to object
*/
		
		byte a=10; //implicit
		int b=a;
		System.out.println(b);
		
		char i='a'; // implicit
		int j=i;
		System.out.println(j);
		
		float f=10.52f;
		long k=(long)f;
		System.out.println(k);
		
		int ii=(int)k;
		System.out.println(ii); //explicit
		
		int i1=130;
		byte b1=(byte)i1;
		System.out.println(b1);
		
	}

}
