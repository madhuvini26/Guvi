package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class PrimeNumbersEndingWith3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=3;i<n;i+=10)
            if(isPrime(i))
                sum+=i;
        System.out.println("Output : \n" + sum);
                
    }
    public static boolean isPrime(int n) 
    {
        for (int i=2;i<=Math.sqrt(n)+1;i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}
