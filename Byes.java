/*
Given a number N which is the number of people in the tournament, If the tournament starts with number of players N not 
equal to a power of 2, some players need to be given byes, which transfers players directly to the next round because they 
have no opponent assigned to them. Find the minimum number of byes that has to be given.
Input Size : 3<=N<=100000
Example:
INPUT
5
OUTPUT
1
*/
package mypackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Byes {
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
