package trainingTns;
 class Citizen{
	String name="Mahek";
	int phone=123456;
	String Address="Ashoka Summit Coop Soc";
	char Gender='F';
}
public class Admission extends Citizen {
void Details() {
	System.out.println(name+phone+Address+Gender);
	System.out.println("This was from Citizen Class");
	
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Admission ad=new Admission();
ad.Details();
	}

}
