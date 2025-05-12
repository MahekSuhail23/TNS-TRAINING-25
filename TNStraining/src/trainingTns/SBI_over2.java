package trainingTns;

public class SBI_over2 extends RBI_over1
{//Overriding
	public float getInterest() 
	{
		return 6.8f;// cant change return type to int coz method in pc was float 
		//we use covariant overriding after java 5.0
		//before it was called as invariant wrt return type before java version 5
		//covariant is based on liskov substituion principle
		//pc ref obj is called as subtype
		// reduce classcasteexception 
	
	}
}
