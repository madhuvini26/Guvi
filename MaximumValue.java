package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class MaximumValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");
        int n=sc.nextInt();
        long[] array=new long[n];
        
        long p=sc.nextLong();
        long q=sc.nextLong();
        long r=sc.nextLong();
        
        for(int i=0;i<n;i++)
            array[i]=sc.nextLong();
        
        long maxSumProduct=Long.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=j;k<n;k++)
                {
                    long sumProduct=p*array[i] + q*array[j] + r*array[k];
                    if(sumProduct>maxSumProduct)
                        maxSumProduct=sumProduct;
                }
            }
        }
        System.out.println("Output :\n" + maxSumProduct);
    }
}
