/*
You are given an array 'a' of size N. Your task is to print the array one element in a line in the decreasing order of number 
of ones in its binary representation. In case of two numbers having same number of ones, the bigger number in its decimal 
representation comes first.
Input Size : N<=10000
Example:
INPUT
5
31 14 15 7 2
OUTPUT
31
15
14
7
2
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class BinaryDescendingOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] array=new int[n];
        
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(noOfOnesInBinary(array[i])<noOfOnesInBinary(array[j]))
                {
                    array=swap(array,i,j);
                }
                else if(noOfOnesInBinary(array[i])==noOfOnesInBinary(array[j]))
                {
                    if(array[i]<array[j])
                    {
                        array=swap(array,i,j);
                    }
                }
            }
        }
        
        System.out.println("Output :");
        for(int i=0;i<n;i++)
            System.out.println(array[i]);
      
    }
    static int[] swap(int[] array,int i,int j)
    {
        int temp=array[j];
        array[j]=array[i];
        array[i]=temp;
        return array;
    }
    static String convertToBinary(int decimal)
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
    static int noOfOnesInBinary(int decimal)
    {
        int count=0;
        String binary=convertToBinary(decimal);
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
