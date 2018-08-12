/*
Shapur has to find weaknesses in the roman army to defeat them. So he gives the army a weakness number. In Shapur's opinion 
the weakness of an army is equal to the number of triplets i, j, k such that i < j < k and ai > aj > ak where ax is the power 
of man standing at position x. The Roman army has one special trait — powers of all the people in it are distinct. Help Shapur 
find out how weak the romans are.
Input Size : N<=100000 
Example:
INPUT
3
3 2 1 
OUTPUT
1
*/
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
