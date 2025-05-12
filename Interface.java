package OOP;

public class Interface {
    public static void main(String[]args){
    BMW B=new BMW();
    B.model();
    B.price();
    }
    
}
//creation of interfaces
interface Cars{
    void model();
    void price();   
}

class BMW implements Cars{
    public void model(){
        System.out.println("LATEST MODEL OF BMW IS BMW iX");
    }

    public void price(){
        System.out.println("PRICE OF BMW iX IS Rs. 49.00 Lakh");
    }

}