package trainingTns;

public class Poly1 {
	//reduce coupling(dep of 1class on other | support single var|code reusability
	//retrn type can be changed in subclass by overriding ? no cant
// implicit type conversion
	//co-variant overriding - for object for pritimive dt to change return type in sub class by giving ref object
	Poly1()
	{System.out.println("Def cons");}

Poly1(int a, int b){
	int c=a+b;
	System.out.println(c);}

public static void main(String agrs[]) {
	Poly1 n=new Poly1();
	Poly1 n1=new Poly1(5,8);
	
}}