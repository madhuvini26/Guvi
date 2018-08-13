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

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Hariharan
 */
public class Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int rating;
        int totalCandies=0;
        TreeMap<Integer,Integer> count=new TreeMap<>();
        for(int i=0;i<n;i++)
        {
            rating=sc.nextInt();
            if(count.containsKey(rating))
                count.put(rating,count.get(rating)+1);
            else
                count.put(rating, 1);
        }
        int candies=1;
        for(Map.Entry<Integer,Integer> entry : count.entrySet())
        {
            totalCandies+=entry.getValue()*candies;
            candies++;
        }
        System.out.println("Output :\n" + totalCandies);
    }
}
