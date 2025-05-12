package OOP;
public class Abstraction {
    public static void main(String[]args){
        Cat c=new Cat();
        c.Animalsound();
        c.sleep();



    }
    
}


abstract class Animal{
    //can have both regular and abstract method 
    public abstract void Animalsound(); //abstract method

    public void sleep(){
        System.out.println("ZZZZ");
    }

}

class Cat extends Animal{
    public void Animalsound(){
        System.out.println("Meow...Meow");
    }

}