package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Cookies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int noOfIngredients=sc.nextInt();
        int magicPowder=sc.nextInt();
        int[] required=new int[noOfIngredients];
        int[] available=new int[noOfIngredients];
        
        int i,count=0;
        
        for(i=0;i<noOfIngredients;i++)
            required[i]=sc.nextInt();
        
        for(i=0;i<noOfIngredients;i++)
            available[i]=sc.nextInt();
        
        while(true)
        {
            for(i=0;i<noOfIngredients;i++)
            {
                if(available[i]-required[i]>=0)
                    available[i]-=required[i];
                else 
                {
                    if(required[i]-available[i] <= magicPowder)
                    {
                        magicPowder-=(required[i]-available[i]);
                        available[i]=0;
                    }
                    else
                        break;
                }                  
            }
            if(i!=noOfIngredients)
                break;
            count++;            
        }
        System.out.println("Output :\n"+count);
    }
}
