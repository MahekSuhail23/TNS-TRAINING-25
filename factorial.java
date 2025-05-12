package functions;
import java.util.*;
public class factorial {

    public static int Fact (int number){//factorial function 
        
        int f=1;
        for(int i=1;i<=number;i++){
            f=f*i;  
        }
        System.out.println("Factorial is:"+f);   
        return f;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you calculate the factorial:");
        int number= sc.nextInt();
        Fact(number);
    }
    
}
