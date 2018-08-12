/*
Given a number N and an array of N numbers, find if it is possible to divide the array into 2 arrays with equal average.
Input Size : 2<=N<=100000
Example:
INPUT
5
4 2 3 4 2
OUTPUT
yes
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class EqualAverageArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] array=new int[n];
        
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        
        boolean equalAveragePossible=false;
        int split=1;
        while(split<n)
        {
            int sum=0,count=0;
            float avg1,avg2;
            for(int i=0;i<split;i++)
            {
                sum+=array[i];
                count++;
            }
            avg1=sum/(float)count;    
            sum=count=0;
            for(int i=split;i<n;i++)
            {
                sum+=array[i];
                count++;
            }
            avg2=sum/(float)count;
            if(avg1==avg2)
            {
                equalAveragePossible=true;
                break;
            }
            split++;
        }
        System.out.println("Output :");
        if(equalAveragePossible)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
