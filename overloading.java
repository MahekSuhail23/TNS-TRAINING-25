package OOP;

public class overloading {
    public static void main(String[]args){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,9));
        System.out.println(calc.sum((float)2.1, (float)9.3));
        System.out.println(calc.sum(2,9,6));
    }
    
}
///method overloading(Same function name with differnt parameter type and count)
class Calculator{
   public int sum(int a,int b){//sum(int)
    return a+b;
   }

   public float sum(float a,float b){//sum(float)
    return a+b;
   }

   public int sum(int a,int b,int c){//sum(differnt count)
    return a+b+c;
   }
}
