package functions;

public class fun_overload {
    //FUNCTION LOADING USING PARAMETER
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a,int b, int c){
        return a+b+c;
    }

    //USING DATA TYPE
    public static int mult(int p , int q){
        return p*q;
    }

    public static float mult(float p , float q){
        return p*q;
    }

    public static void main(String[]args){
        System.out.println(sum(1,5));
        System.out.println(sum(1,5 ,3));
        System.out.println(mult(4,2));
        System.out.println(mult(4.2f,2.1f));
    
    }



    
}
