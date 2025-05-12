import java.util.*;
public class array2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[]= new int[size];
        for (int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println("number are " +number[i]);
        }

        //searching an elements in array 
        System.out.println("enter number u want to search");
        int x = sc.nextInt();
        for(int i=0;i<size;i++){
            if (number[i]==x){
                System.out.println("number found at " +i);
            }
        }
        

    }
    
}
