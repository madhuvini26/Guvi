/*
Given 2 numbers N,K followed by an array of N integers perform the following operation:
1)Split the array into exactly k non-empty subsegments.
2)Compute the minimum integer on each subsegment.
3)Take the maximum integer over the k obtained minimums.
What is the maximum possible integer you can get if u split optimally?
Input Size : 1<=K<=N<=100000
Example:
INPUT
5 2
1 2 3 4 5
OUTPUT
5
*/
package mypackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class MaxOfSegmentMins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] array=new int[n];
        
        int segments=sc.nextInt();
        
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        
        System.out.println("Output :");
        if(segments==1)
        {
            Arrays.sort(array);
            System.out.println(array[0]);
        }
        else if(segments==2)
        {
            System.out.println(Math.max(array[0], array[n-1]));
        }
        else if(segments >=3)
        {
            Arrays.sort(array);
            System.out.println(array[n-1]);
        }
    }
}
