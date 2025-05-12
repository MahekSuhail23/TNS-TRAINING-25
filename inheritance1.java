package OOP;
public class inheritance1 {

    public static void main(String[]args){
        animal shark=new animal();
        shark.brethe();
        shark.setColor("black");
        System.out.println("Color of shark is  "+shark.getColor());
    }
    
}

class animal{
    String color;
    void eat(){
        System.out.println("Animal eatsss");

    }

    void brethe(){
        System.out.println("Animal can breths");
    }

    public String getColor(){
        return color;

    }

    public void setColor(String c){
        this.color=c;
    }
    
}
//single inheritance 
class fish extends animal{
    void swim(){
        System.out.println("Fishes swimsss");
    }

 
}



