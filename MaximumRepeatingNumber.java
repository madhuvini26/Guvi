/*
Given a number N followed by N numbers. Keep the count of each number and print the maximum repeating number.
Input Size : N <= 100000 
Sample Testcase :
INPUT
5
15 5 -20 -20 -45
OUTPUT
-20
*/
package mypackage;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class MaximumRepeatingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] array=new int[n];
        HashMap<Integer,Integer> count = new HashMap<>();
        
        int maxCount=0;
        int maxRepeatingNumber=array[0];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
            if(count.containsKey(array[i]))
                count.put(array[i],count.get(array[i])+1);
            else
                count.put(array[i],1);
            
            if(count.get(array[i]) > maxCount)
            {
                maxCount=count.get(array[i]);
                maxRepeatingNumber=array[i];
            }
        }
        System.out.println("Output :\n" + maxRepeatingNumber);
    }
}
