/*
Given K - which is the number of bits, print all the possible combinations of numbers formed by printing all numbers with one 
bit set, followed by two bits set, ... upto the point when all k-bits are set. They must be sorted according to the number of 
bits set, if two numbers have the same number of bits set then they should be placed as per their value.
Input Size : 1<=K<=1000
Example:
INPUT
3
OUTPUT
000
001
010
100
101
110
011
111
*/
package mypackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class BinaryAscendingOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] array=new int[1<<n];
        
        for(int i=0;i<(1<<n);i++)
        {
            array[i]=i;
        }
        
        for(int i=0;i<(1<<n);i++)
        {
            for(int j=i+1;j<(1<<n);j++)
            {
                if(noOfOnesInBinary(array[i],n)>noOfOnesInBinary(array[j],n))
                {
                    array=swap(array,i,j);
                }
                else if(noOfOnesInBinary(array[i],n)==noOfOnesInBinary(array[j],n))
                {
                    if(array[i]>array[j])
                    {
                        array=swap(array,i,j);
                    }
                }
            }
        }
        
        System.out.println("Output :");
        for(int i=0;i<(1<<n);i++)
            System.out.println(convertToBinary(array[i],n));
    }
    static int[] swap(int[] array,int i,int j)
    {
        int temp=array[j];
        array[j]=array[i];
        array[i]=temp;
        return array;
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
    static int noOfOnesInBinary(int decimal,int n)
    {
        int count=0;
        String binary=convertToBinary(decimal,n);
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
