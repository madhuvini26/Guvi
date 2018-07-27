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
public class BonAppetit {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int k=sc.nextInt();
        int bill[]=new int[n];
        int total=0;
        for(int i=0;i<n;i++)
        {
            bill[i]=sc.nextInt();
            if(i!=k)
            {
                total+=bill[i];
            }
        }
        int annaShare=total/2;
        int b=sc.nextInt();
        System.out.println("Output :");
        if(b==annaShare)
            System.out.println("Bon Appetit");
        else
            System.out.println(b-annaShare);
        
    }
}
