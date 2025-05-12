package OOP;

public class overriding {

    public static void main(String[]args){
        // Animal a=new Animal();
        // a.eat();


        Deer d= new Deer();
        d.eat();

    }
    
}
 
class Animal{
    void eat(){
        System.out.println("Animal can eat anything");

    }
}

class Deer extends Animal{
    @Override
    void eat(){
        System.out.print("Deer can only eat grass");

    }
}
