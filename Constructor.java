package trainingTns;

public class Constructor {
	//data members
	private String custname;
	private int custid;
	private String custcity;
public Constructor() {
	System.out.println("Default Constructor");
	
	}







@Override
public String toString() {
	return "Constructor [custname=" + custname + ", custid=" + custid + ", custcity=" + custcity + "]";
}







public String getCustname() {
	return custname;
}







public void setCustname(String custname) {
	this.custname = custname;
}







public int getCustid() {
	return custid;
}







public void setCustid(int custid) {
	this.custid = custid;
}







public String getCustcity() {
	return custcity;
}







public void setCustcity(String custcity) {
	this.custcity = custcity;
}







public Constructor(String custname, int custid, String custcity) {
	super();
	this.custname = custname; // this: notify towards curr var
	this.custid = custid;
	this.custcity = custcity;
	System.out.println("Parameterized Constructor");
}







	
		// Constructor-initialize obj
		// can't be final , sync,static and abstract
		
		
		

	

}
