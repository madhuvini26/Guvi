package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class PeaceLighting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        boolean even=true;
        int count=0;
        System.out.println("Output : \n" + (n+(n/2)));
        for(int i=1;i<=n;i++)
        {
            //System.out.println(i);
            if(count==(n+(n/2)))
                break;
            if(even)
            {
                if(i%2==0)
                {
                    System.out.print(i + " ");
                    count++;
                }
                if(i==n)
                {
                    even=false;
                    i=0;
                }
            }
            else
            {
                if(i%2!=0)
                {
                    System.out.print(i + " ");
                    count++;
                }
                if(i==n)
                {
                    even=true;
                    i=0;
                }
            }
        }
    }
}
