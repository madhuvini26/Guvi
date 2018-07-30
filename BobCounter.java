package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class BobCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int t=sc.nextInt();
        int counterValue=3;
        int currentInitialValue=3;
        
        for(int i=1;i<t;i++)
        {
            counterValue--;
            if(counterValue==0)
            {
                counterValue=2*currentInitialValue;
                currentInitialValue=counterValue;
            }
        }
        System.out.println("Output :\n" + counterValue);
    }
}
