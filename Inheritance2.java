package OOP;

public class Inheritance2 {
    public static void main(String[]args){
        Dog doggy=new Dog();
        doggy.legs();
        

    }
    
}
//multilevel inheritance 

class Animal{
    String color;
    void eat(){
        System.out.println("Animal eatsss");

    }

    void brethe(){
        System.out.println("Animal can breths");
    }
}

class Mammels extends Animal{
    void legs(){
        System.out.println("mammels can walk");

    } 
}

class Dog extends Mammels{

}
