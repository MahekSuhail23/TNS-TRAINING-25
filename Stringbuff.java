package trainingTns;

public class Stringbuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer buff=new StringBuffer("Hello");
System.out.println(buff);
System.out.println(buff.length());
System.out.println(buff.capacity()); // 16 is already predefined capacity of 16 for string buffer 
//capacity is for string buffer 

String s;
int a=42;
buff=new StringBuffer(40);
s=buff.append("a=").append(a).append("!").toString();
System.out.println(s);
System.out.println(buff);

buff=new StringBuffer ("I  study JAVA");
buff.insert(2, "Need to");
System.out.println(buff);

buff.delete(2, 4);
System.out.println(buff);

System.out.println(buff.reverse());
	}

	

}
