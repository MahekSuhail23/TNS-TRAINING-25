package functions;

public class prime {

    //NORMAL METHOD OF CHEACKING NUMBER IS PRIME OR NOT?
    public static boolean isprime1(int n1){
        if (n1==2){
            return true;
        }
        for(int i=2;i<=n1-1;i++){
            if(n1 % i ==0){
                return false;
            }
        }
        return true;
    }
    //OPTIMIZATION METHOD OF CHEAKING NUMBER IS PRIME OR NOT?
    public static boolean isprime2(int n2){
        if(n2==2){
            return true;
        }
        for (int i=2;i<=Math.sqrt(n2);i++){//using sqrt of the number
            if(n2%i==0){
                return false;
            }
        }
        return true;
    }

    //PRINTING ALL PRIMR NUMBERS IN GIVEN RANGE!    
    public static void primerange(int range){
        for(int i=2;i<=range;i++){
            if(isprime2(i)){//true
                System.out.print(i+" ");
            }

        }  
        System.out.println(" "); 
    } 


    public static void main(String[] args){
        System.out.println("using normal method");
        System.out.println(isprime1(4));
        System.out.println("using optimiztion method");
        System.out.println(isprime2(3));
        System.out.println("PRINTING ALL PRIME NUMBERS IN RANGE");
        primerange(50);
    }
    
}
