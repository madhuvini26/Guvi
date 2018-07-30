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
