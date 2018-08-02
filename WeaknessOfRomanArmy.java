package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class WeaknessOfRomanArmy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");       
        int n=sc.nextInt();
        int[] powers=new int[n];
        for(int i=0;i<n;i++)
        {
            powers[i]=sc.nextInt();
        }
        int weakness=0;
        
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                for(int k=j+1;k<n;k++)                
                    if(powers[i] > powers[j] && powers[j] > powers[k])
                        weakness++;                      
        System.out.println("Output :\n" + weakness);
    }
}
