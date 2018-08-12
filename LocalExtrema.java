/*
You are given an array a. Some element of this array ai is a local minimum iff it is strictly less than both of its neighbours
(that is, ai < ai - 1 and ai < ai + 1). Also the element can be called local maximum iff it is strictly greater than its 
neighbours (that is, ai > ai - 1 and ai > ai + 1). Since a1 and an have only one neighbour each, they are neither local 
minima nor local maxima. An element is called a local extremum iff it is either local maximum or local minimum. Your task is 
to calculate the number of local extrema in the given array.
Input Size : N<=1000 
Example:
INPUT
3
1 2 3
OUTPUT
2
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class LocalExtrema {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        
        int localExtrema=0;
        for(int i=1;i<n-1;i++)
        {
            boolean localMinima=array[i] < array[i-1] && array[i] < array[i+1];
            boolean localMaxima=array[i] > array[i-1] && array[i] > array[i+1];
            if(localMinima || localMaxima)
            {
                localExtrema++;
            }
        }
        System.out.println("Output : \n" + localExtrema);
    }
}
