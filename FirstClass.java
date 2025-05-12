package OOP;
public class FirstClass {
    public static void main(String args[]){
        Employee emp1=new Employee();//creating object

        emp1.name="Pranita";//setting the value of object
        emp1.id=1;
        emp1.salary=20000;

        emp1.info();//calling the method using .operator
     
    }
    
}

class Employee{//creating class
    int id;
    String name;
    int salary;
        
        
   void info(){
       System.out.println("My name is"+name);
       System.out.println("and have id" +id);
       System.out.println("have salary" +salary);
   }
}
