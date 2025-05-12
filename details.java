package trainingTns;

public class details {

	public static void main(String[] args) {
		// to overcome multiple memory allocation for person class we use dynamic binding by means of making reference obj of PC to all CC
hperson p1=new hperson();
System.out.println("Details ");
System.out.println(p1);

hperson p;
p=new hperson("Mahek","Banglore");
System.out.println("Bio Details"+p);

p=new Student("Pranita","Capetown","BE",90);
System.out.println("Bio Details"+p);

p=new Student("Pranav","Hydrabad","Manager",18);
System.out.println("Bio Details"+p);
	}

}
