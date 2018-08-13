/*
Given a number N followed by N numbers. Find if in any index of the array, the sum of numbers in the previous indices is 
equal to the sum of elements after the index. i.e., at a particular position the prefix sum should be equal to suffix sum,
if yes print 'yes' else 'no'.
Input Size : N <= 100000
Sample Testcase :
INPUT
5
 1 1 1 1 1
OUTPUT
yes
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class EqualSumArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] array=new int[n];
        
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        
        boolean equalSumPossible=false;
        int split=0;
        while(split<n)
        {
            int sum1=0,sum2=0;
            for(int i=0;i<split;i++)
            {
                sum1+=array[i];
            }
            for(int i=split+1;i<n;i++)
            {
                sum2+=array[i];
            }
            if(sum1==sum2)
            {
                equalSumPossible=true;
                break;
            }
            split++;
        }
        System.out.println("Output :");
        if(equalSumPossible)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
