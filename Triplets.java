/*
Given a number N and an array of N elements, find the number of triplets ai < aj < ak(i < j < k) in the array.
Input Size : 3<=N<=100000
Example:
INPUT
5
1 3 2 4 5 4
OUTPUT
4
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Triplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");       
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int count=0;
        
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                for(int k=j+1;k<n;k++)                
                    if(array[i] < array[j] && array[j] < array[k])
                        count++;                      
        System.out.println("Output :\n" + count);
    }
}
