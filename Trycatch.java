package ExceptionHandling;

public class Trycatch {
    public static void main(String[]args){
        int [] numerator ={100,200,50,60,800};
        int [] denominator ={2,3,4,0,5};

        for(int i=0;i<=numerator.length;i++){
            System.out.println(divide(numerator[i],denominator[i]));
            
        }

    }

    public static int divide(int a,int b){
        try{
            return a/b;
        }
        catch(Exception e){
            System.out.println(e);
            return -1;
        }

    }
    
}
