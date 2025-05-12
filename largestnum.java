import java.util.*;
public class largestnum {

    public static int getlargest (int array[]){
        int largest=Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;

        //FOR LARGEST VALUE
        for(int i=0;i<array.length;i++){
            if(largest<array[i]){
                largest =array[i];
            }

        }
        return largest;

        // //FOR SMALLEST VALUE
        // for(int i=0;i<array.length;i++){
        //     if(smallest>array[i]){
        //         smallest=array[i];
        //     }

        // }
        // return smallest;



    }
    public static void main(String[]agrs){
        int array[]={2,5,7,4,8};

        //Approach -1 

        int max=array[0];//initializing 1st elements as max element
        for(int i=0;i<array.length;i++){
            if(array[i]>max){ //if another elemet is max ,update max
                max =array[i];
            }
        }
        System.out.println(" by approach -1 largest element is " +max);
    

//****************************************************************************************************************************
          System.out.println(" By approach-2 largest numeber is " +getlargest(array));
        System.out.println(" By approach-2 smallest numeber is " +getlargest(array));


}
}
