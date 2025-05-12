public class linearsearch {
    public static int search(int number[],int key){
        //linear search
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int number[]={3,6,9,12,15,18,21};
        int key=15;

        int index=search(number,key);
        if(index==-1){
            System.out.print("key not found");

        }
        else{

            System.out.println( "key found at index " +index);
        }
    }
    
}
