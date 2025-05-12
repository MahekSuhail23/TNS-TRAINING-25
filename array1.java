import java.util.*;
public class array1 {
    public static void main (String args[]){
        //creating array(different way)
        int marks[] = new int[50];

        int number[]={1,2,3,4};

        String colour[]={"red","yellow","green","blue","orange"};

        System.out.println( " The length colour array is "+colour.length);//length of array


        //input and out of array
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the marks of first subject:");
        marks[0]=Sc.nextInt();
        System.out.println("enter the marks of second subject:");
        marks[1]=Sc.nextInt();
        System.out.println("enter the marks of third subject:");
        marks[2]=Sc.nextInt();

        
        
        
        System.out.println(+marks[0]);
        System.out.println(+marks[1]);
        System.out.println(+marks[2]); 
        float percentage =(marks[0]+marks[1]+marks[2])/3;
        
        marks[1]=marks[1]+2;//updating value of array

        System.out.println("percentage is" +percentage);
        System.out.println("correct marks of subject two is " +marks[1]);

        


       





         


    }
    
}
