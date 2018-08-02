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
