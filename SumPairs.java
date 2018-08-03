/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class SumPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int sum=sc.nextInt();
        int[] numbers=new int[n];
        for(int i=0;i<n;i++)
        {
            numbers[i]=sc.nextInt();
        }
        
        System.out.println("Output :\n"+(sumPairsExists(numbers,sum)?"yes":"no"));
    }
    static boolean sumPairsExists(int[] numbers,int sum)
    {
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]+numbers[j]==sum)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
