/*
There's an array A consisting of N non-zero integers A1..N. A subarray of A is called alternating if any two adjacent elements 
in it have different signs (i.e. one of them should be negative and the other should be positive). For each x from 1 to N, 
compute the length of the longest alternating subarray that starts at x - that is, a subarray Ax..y for the maximum possible 
y ≥ x. The length of such a subarray is y-x+1.
Example:
INPUT
4
1 -5 1 -5
OUTPUT
4 3 2 1
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class LongestAlternatingSubArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int[] count=new int[n];
        count[n-1]=1;
        for(int i=n-2;i>=0;i--) 
        {
            if(array[i]*array[i+1]<0)
                count[i]=count[i+1]+1;
            else
                count[i]=1;
        }
        System.out.println("Output :");
        for(int i=0;i<n;i++)
            System.out.print(count[i] + " ");
    }
}
    
