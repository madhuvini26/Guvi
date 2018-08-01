package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Pie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] pie=new int[n];
        int aPie=0,bPie=0,sum=0;
        for(int i=0;i<n;i++)
            pie[i]=sc.nextInt();
        
        for(int i=n-1;i>=0;i--)
        {
            bPie=maximum(bPie,pie[i]+sum-bPie);
            sum+=pie[i];
        }
        aPie=sum-bPie;
        System.out.println("Output :\n" + aPie + " " + bPie);
    }
    
    private static int maximum(int a,int b)
    {
        return a>b?a:b;
    }
}
