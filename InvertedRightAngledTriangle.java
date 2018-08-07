package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        
        int n=sc.nextInt();
        
        System.out.println("Output : ");
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("1");
            System.out.println();
        }   
    }
}
