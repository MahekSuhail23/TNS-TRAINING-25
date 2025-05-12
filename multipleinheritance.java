package OOP;

public class multipleinheritance {
    public static void main(String[]agrs){
        BMW b= new BMW();
        b.model();
        b.price();
    }
    
}

interface carmodel{
    void model();
}

interface carBrand{
    void price();
}

class BMW implements carmodel,carBrand{
    public void model(){
        System.out.println("Latest model of car is BMW-XI");
    }

    public void price(){
        System.out.println("price of car is 50k");
    }
}