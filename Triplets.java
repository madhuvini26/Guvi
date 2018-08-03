package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Triplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");       
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int count=0;
        
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                for(int k=j+1;k<n;k++)                
                    if(array[i] < array[j] && array[j] < array[k])
                        count++;                      
        System.out.println("Output :\n" + count);
    }
}
