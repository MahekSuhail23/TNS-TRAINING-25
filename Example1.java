package OOP;

public class Example1 {
    public static void main(String[]args){
        Employee emp =new Employee();

        emp.name="Pranita Pisal";
        emp.salary=30000;

        System.out.println("Information of employee one  :="+emp.getName());
        System.out.println(emp.getSalary());



    }
    
}

class Employee{
   
    String name;
    int salary;
//setting and getting the value of salaray
    public int getSalary(){
        return salary;
    }

    public void setSalary(int s){
        salary=s;
    }
// ********************************************
//getting and setting the value of name     
public String getName(){
        return name;
    }

    public void setName(String n){
        name=n;
    }
}
