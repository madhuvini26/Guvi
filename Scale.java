/*
59 -  Kedar has ordinary pan scales and several weights of an equal mass. Kedar has already put some weights on the scales, 
while other weights are untouched. Kedar is now wondering whether it is possible to put all the remaining weights on the scales 
so that the scales were in equilibrium. The scales is in equilibrium if the total sum of weights on the left pan is equal to 
the total sum of weights on the right pan. The first line has a non-empty sequence of characters describing the scales. 
In this sequence, an uppercase English letter indicates a weight, and the symbol '|' indicates the delimiter (the character 
occurs in the sequence exactly once). All weights that are recorded in the sequence before the delimiter are initially on the 
left pan of the scale. All weights that are recorded in the sequence after the delimiter are initially on the right pan of the 
scale. The second line contains a non-empty sequence containing uppercase English letters. Each letter indicates a weight which 
is not used yet. It is guaranteed that all the English letters in the input data are different. It is guaranteed that the input 
does not contain any extra characters.
Example:
INPUT
AC|T
L
OUTPUT
AC|TL
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Scale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String[] scaleStatus=sc.next().split("\\|",2);
        String remainingWeights=sc.next();
        int left=scaleStatus[0].length();
        int right=scaleStatus[1].length();
        int remaining=remainingWeights.length();
        boolean possible=false;
        if(left<right)
        {
            if(remaining>=right-left)
            {
                scaleStatus[0]+= remainingWeights.substring(0,right-left);
                remainingWeights=remainingWeights.substring(right-left);
                possible=true;
            }
        }
        else if(left>right)
        {
            if(remaining>=left-right)
            {
                scaleStatus[1]+= remainingWeights.substring(0,left-right);
                remainingWeights=remainingWeights.substring(left-right);
                possible=true;
            }
        }
        else
        {
            possible=true;
        }
        
        if(remainingWeights.length()%2==0 && remainingWeights.length()!=0 && possible)
        {
            for(int i=0;i<remainingWeights.length();i+=2)
            {
                scaleStatus[0]+=remainingWeights.charAt(i);
                scaleStatus[1]+=remainingWeights.charAt(i+1);
                if(remainingWeights.length()!=2)
                {
                    remainingWeights=remainingWeights.substring(2);
                }
            }
            possible=true;
        }
        else if(remainingWeights.length()%2!=0)
            possible=false;
            
        System.out.println("Output :");
        if(possible)
        {
            System.out.println(scaleStatus[0] + "|" + scaleStatus[1]);
        }
        else
        {
            System.out.println("Impossible");
        }
    }
}
