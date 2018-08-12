/*
Given a number N and an array of N integers, find the length of the Longest Increasing Subsequence.
Input Size : 1<=N<=1000
Example:
INPUT
5
1 2 2 1 3
OUTPUT
2
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();        
        int[] array=new int[n];
        
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        
        int maxLength=1;
        
        for(int i=0;i<n;i++)
        {
            int length=1;
            for(int j=i+1;j<n;j++)
            {
                if(array[j] > array[j-1])
                    length++;
                else
                    break;
            }
            if(length > maxLength)
                maxLength=length;
        }
        System.out.println("Output :\n" + maxLength);
    }
}
