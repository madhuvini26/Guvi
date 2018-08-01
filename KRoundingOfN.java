package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class KRoundingOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        long n=sc.nextInt();
        long k=sc.nextInt();
        
        int i=1;
        while(true)
        {
            long product=n*i;
            if(product%(Math.pow(10,k))==0)
            {
                System.out.println("Output :\n"+product);
                break;
            }   
            i+=(i>1)?10:9;
        }
    }
}
