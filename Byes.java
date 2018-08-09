package mypackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Byes {
    static boolean powerOfTwo;
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        long number=sc.nextInt();
        System.out.println("Output :\n" + (number-nearestLesserPowerOfTwo(number))%2);
    }
    static long nearestLesserPowerOfTwo(long number)
    {
        return (long)Math.pow(2, convertToBinary(number).length()-1);
    }
    static String convertToBinary(long decimal)
    {
        String binary=new String();
        while(decimal!=0)
        {
            if(decimal%2==0)
                binary= "0" + binary;
            else
                binary= "1" + binary;
            decimal/=2;
        }
        return binary;
    }
}
