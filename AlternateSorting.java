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
