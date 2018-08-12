/*
Given a number N followed by an array of N numbers, find the maximum sum which can be obtained by picking the elements of the 
array based on the following rule:
'If you pick the current element u cannot pick its neighbors'.
Input Size : 1<=N<=100000
Example:
INPUT
5
1 2 3 4 5
OUTPUT
9
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class MaximumSumByPicking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] array=new int[n];
        
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Output : \n" + maximumSum(array));
    }
    private static int maximumSum(int[] array)
    {
        int including=array[0];
        int excluding=0;
        
        for(int i=1;i<array.length;i++)
        {
            int newExcluding=(including>excluding)?including:excluding;
            including=excluding+array[i];
            excluding=newExcluding;            
        }
        return including>excluding?including:excluding;
    }
}
