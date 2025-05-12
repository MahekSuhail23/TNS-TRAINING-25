package functions;
import java.util.*;
public class parametricfun {

    public static void add(int a,int b){
        int sum = a + b;
        System.out.println("Sum is:" +sum);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the two number!");
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        add(a,b) ;     

    }
}
