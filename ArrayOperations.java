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
