package trainingTns;

public class Executer {

	public static void main(String[] args) {

		Base b=new Base();
		b.methodDef();
		b.methodprot();
		b.methodpub();

		b.varDefault=12;
		b.varprot=89;
		b.varpublic=888;
		System.out.println(b.varDefault);
		System.out.println(b.varprot);
		System.out.println(b.varpublic);

	}

}
