/*
Maxwell wants to buy an apartment in a new house at Line Avenue of Metropolis. The house has n apartments that are numbered 
from 1 to n and are arranged in a row. Two apartments are adjacent if their indices differ by 1. Some of the apartments can 
already be inhabited, others are available for sale. Maxwell often visits his neighbors, so apartment is good for him if it 
is available for sale and there is at least one already inhabited apartment adjacent to it. Maxwell knows that there are 
exactly k already inhabited apartments, but he doesn't know their indices yet. Find out what could be the minimum possible 
and the maximum possible number of apartments that are good for Maxwell.
Input Size : N<=K<=1000000000
Example:
INPUT
6 3
OUTPUT
1 3
*/
package mypackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Apartment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int k=sc.nextInt();
        int min=n;
        int max=0;
        int count;
        for(int i=1;i<(1<<n);i++)
        {
            
            String binary=convertToBinary(i,n);
            if(noOfOnes(binary)==k)
            {
                count=0;
                for(int j=0;j<binary.length();j++)
                {
                    if(!(j==0 && j==(binary.length()-1)))
                    {
                        if(binary.charAt(j)=='0')
                        {
                            if((j==0 && binary.charAt(j+1)=='1')
                                    ||(j==binary.length()-1 && binary.charAt(j-1)=='1')
                                    ||( (j!=0 && binary.charAt(j-1)=='1') || (j!=binary.length()-1 && binary.charAt(j+1)=='1')))
                            {
                                count++;
                            }
                        }
                    }
                }
                if(count>max)
                    max=count;
                else if(count<min)
                    min=count;
            }
        }
        System.out.println("Output :");
        System.out.print(min + " " + max);
    }
    static String convertToBinary(int decimal,int n)
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
        char[] repeat = new char[n-binary.length()];
        Arrays.fill(repeat,'0');
        binary = new String(repeat) + binary;
        return binary;
    }
    static int noOfOnes(String binary)
    {
        int count=0;
        for(int i=0;i<binary.length();i++)
        {
            if(binary.charAt(i)=='1')
            {
                count++;
            }
        }
        return count;
    }
}
