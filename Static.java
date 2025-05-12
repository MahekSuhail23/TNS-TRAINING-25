package OOP;

public class Static {
    
    public static void main(String[]args){
        Student s1=new Student();
        s1.Clgname ="KSE";
        System.out.println(s1.Clgname);
        Student s2=new Student();
        System.out.println(s2.Clgname);
     

    }
}
//sts
class Student{
    String name;
    int rollno;
    static String Clgname;//declaration of static key word 

    String getname(){
        return this.name;
    }

    void Setname(String n){
        this.name=n;
    }
}
