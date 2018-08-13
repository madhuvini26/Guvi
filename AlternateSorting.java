/*
Alternate sorting: Given a number N and followed by N numbers, sort the array in such a way that the first number is 
first maximum and second number is 1st minimum 3rd number is 2nd maximumand so on..
Input Size : N <= 100000
Sample Testcase :
INPUT
8
7 623 19 10 11 9 3 15
OUTPUT
623 3 19 7 15 9 11 10
*/
package mypackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class AlternateSorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] array=new int[n];
        int i,j;
        
        for(i=0;i<n;i++)
            array[i]=sc.nextInt();
        Arrays.sort(array);
        
        for(i=0;i<n;i+=2)
        {
            int temp=array[n-1];
            for(j=n-1;j>i;j--)
            {
                array[j]=array[j-1];
            }
            array[i]=temp;
        }
        System.out.println("Output :");
        for(i=0;i<n;i++)
            System.out.print(array[i] + " ");
    }
}
