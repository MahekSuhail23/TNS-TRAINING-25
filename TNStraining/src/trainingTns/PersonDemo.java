package trainingTns;
import java.util.*;
public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
 
 
System.out.println("Enter name: ");
String name=sc.nextLine();
System.out.println("Enter Gender: ");
String gender=sc.nextLine();
System.out.println("Enter age: ");
int age=sc.nextInt();
System.out.println("Enter Income: ");
int income=sc.nextInt();


Person person=new Person();
person.setName(name);
person.setGender(gender);
person.setAge(age);
person.setIncome(income);


//display data

TaxCalc calc=new TaxCalc();
calc.calctax(person);

System.out.println(person);

	}

}
