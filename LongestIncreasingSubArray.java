package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class LongestIncreasingSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();        
        int[] array=new int[n];
        
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        
        int maxLength=1;
        
        for(int i=0;i<n;i++)
        {
            int length=1;
            for(int j=i+1;j<n;j++)
            {
                if(array[j] > array[j-1])
                    length++;
                else
                    break;
            }
            if(length > maxLength)
                maxLength=length;
        }
        System.out.println("Output :\n" + maxLength);
    }
}
