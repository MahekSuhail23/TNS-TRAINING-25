package trainingTns;

public class Base {

	// declare all access modifier var
	int varDefault=10;
	private int varprivate=10;
	public int varpublic=10;
	protected int varprot=10;
	
	//declare methods with diff access modifier 
	void methodDef() {
		System.out.println("Def method");
	}
	public void methodpub() {
		System.out.println("Pub method");
	}
	private void methodpri() {
		System.out.println("Private method");
	}
	protected void methodprot() {
		System.out.println("prot method");
	}


}
