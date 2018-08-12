/*
You are given an array a of size n, and q queries to it. There are queries of two types:
1) li ri — perform a cyclic shift of the segment [li, ri] to the right. 
That is, for every x such that li ≤ x < ri new value of ax + 1 becomes equal to old value of ax, 
and new value of ali becomes equal to old value of ari.
2) li ri — reverse the segment [li, ri].There are m important indices in the array b1, b2, ..., bm. 
For each i such that 1 ≤ i ≤ m you have to output the number that will have index bi in the array 
after all queries are performed.
Input Size : N,Q<=100000, m<=100
Example:
INPUT
6 3 5
1 2 3 4 5 6
2 1 3
2 3 6
1 1 6
2 2 1 5 3
OUTPUT
3 3 1 5 2
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        //System.out.println("Number of elements ");
        int n=sc.nextInt();
        int[] array=new int[n];
        //System.out.println("Number of queries ");
        int q=sc.nextInt();
        //System.out.println("Number of positions ");
        int m=sc.nextInt();
        int[] pos=new int[m];
        
        //System.out.println("Enter the elements of the array ");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        //System.out.println("Enter the queries\n(1 for cyclic shift, 2 for reverse) with start and end indices\n");
        for(int i=0;i<q;i++)
        {
            if(sc.nextInt()==2)
                array=reverse(array,sc.nextInt(),sc.nextInt());
            else
                array=shift(array,sc.nextInt(),sc.nextInt());
            /*System.out.println("Current status : ");
            for(int j=0;j<n;j++)
            {
                System.out.print(array[j]+ " ");
            }
            System.out.println("");*/
        }
        
        //System.out.println("Enter the "+m+" positions\n");
        for(int i=0;i<m;i++)
        {
            pos[i]=sc.nextInt();
        }
        //System.out.println("Elements in the corresponding positions");
        System.out.println("Output :");
        for(int i=0;i<m;i++)
        {
            System.out.print(array[pos[i]-1] + " ");
        }
        
    }
    private static int[] shift(int[] array,int start,int end)
    {
        int last=array[end-1];
        for(int i=end-2;i>=start-1;i--)
        {
            array[i+1]=array[i];
        }
        array[start-1]=last;
        return array;
    }
    private static int[] reverse(int[] array,int start,int end)
    {
        int length=end-start+1;
        int count=1;
        for(int i=start-1;i<(start-1)+(length/2);i++)
        {
            int temp=array[i];
            array[i]=array[end-(count)];
            array[end-(count)]=temp; 
            count++;
        }
        return array;
    }
}
