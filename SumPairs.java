/*
Given 2 numbers N and K followed by N numbers find if there exists a pair of numbers such that it adds upto K.
Input Size : N<=100000 
Example:
INPUT
5 4
1 2 2 4
OUTPUT
yes 
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class SumPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int sum=sc.nextInt();
        int[] numbers=new int[n];
        for(int i=0;i<n;i++)
        {
            numbers[i]=sc.nextInt();
        }
        
        System.out.println("Output :\n"+(sumPairsExists(numbers,sum)?"yes":"no"));
    }
    static boolean sumPairsExists(int[] numbers,int sum)
    {
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]+numbers[j]==sum)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
