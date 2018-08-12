/*
There are N children standing in a line. Each child is assigned a rating value. You are giving candies to thesechildren 
subjected to the following requirements:
1. Each child must have at least one candy.
2. Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?
Input Size : N<=100000 
Example:
INPUT
5
1 2 4 1 2
OUTPUT
9
*/
package mypackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] ratings=new int[n];
        
        for(int i=0;i<n;i++)
            ratings[i]=sc.nextInt();
        int totalCandies=0;
        int candies=1;
        int count=0;
        while(count<n)
        {
            int min=getMinimum(ratings);
            for(int i=0;i<n;i++)
            {
                if(ratings[i]==min)
                {
                    totalCandies+=candies;
                    ratings[i]=Integer.MAX_VALUE;
                    count++;
                }
            }
            candies++;
        }
        System.out.println("Output :\n" + totalCandies);
        
    }
    private static int getMinimum(int[] array)
    {
        Arrays.sort(array);
        return array[0];
    }
}
