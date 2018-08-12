/*
60 - Bob has a strange counter. At the first second, t = 1, it displays the number 3. At each subsequent second, the number 
displayed by the counter decrements by 1. The counter counts down in cycles. In the second after the counter counts down to 1, 
the number becomes 2x the initial number for that countdown cycle and then continues counting down from the new initial number 
in a new cycle.
Input Size : t<=100000
Example:
INPUT
4
OUTPUT
6
*/
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
