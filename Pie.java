/*
You may have heard of the pie rule before. It states that if two people wish to fairly share a slice of pie, 
one person should cut the slice in half, and the other person should choose who gets which slice. A and B have many slices of 
pie, and rather than cutting the slices in half, each individual slice will be eaten by just one person. The way A and B decide 
who eats each slice is as follows. First, the order in which the pies are to be handed out is decided. There is a special token 
called the 'decider' token, initially held by B. Until all the pie is handed out, whoever has the decider token will give the 
next slice of pie to one of the participants, and the decider token to the other participant. They continue until no slices of 
pie are left. All of the slices are of excellent quality, so each participant obviously wants to maximize the total amount of 
pie they get to eat. Assuming both players make their decisions optimally, how much pie will each participant receive?
Input Size : 1<=N<=50
Example:
INPUT
3
141 592 653
OUTPUT
653 733
*/
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
