package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class LongestAlternatingSubArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int[] count=new int[n];
        count[n-1]=1;
        for(int i=n-2;i>=0;i--) 
        {
            if(array[i]*array[i+1]<0)
                count[i]=count[i+1]+1;
            else
                count[i]=1;
        }
        System.out.println("Output :");
        for(int i=0;i<n;i++)
            System.out.print(count[i] + " ");
    }
}
    
