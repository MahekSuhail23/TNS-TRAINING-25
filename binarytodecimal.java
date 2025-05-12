package functions;

public class binarytodecimal {
    public static void BD(int binnum){
        int pow = 0;
        int decinum1 = 0; // Declare the variable here only once
        int originalBinnum = binnum; // Save the original binary number for printing later
        
        while (binnum > 0) {
            int lastdigit = binnum % 10;
            decinum1 = decinum1 + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binnum = binnum / 10;
        }
        
        System.out.println("Decimal of " + originalBinnum + " = " + decinum1);
    }

    public static void DC( int decinum){
        
    }

    public static void main(String[] args) {
        BD(11111);
    }
}
