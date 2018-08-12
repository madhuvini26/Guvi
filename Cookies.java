/*
Waking up in the morning, Apollo decided to bake cookies. To bake one cookie, he needs n ingredients, and for each ingredient 
he knows the value ai — how many grams of this ingredient one needs to bake a cookie. To prepare one cookie Apollo needs to use 
all n ingredients. Apollo has bi gram of the i-th ingredient. Also she has k grams of a magic powder. Each gram of magic powder 
can be turned to exactly 1 gram of any of the n ingredients and can be used for baking cookies. Your task is to determine the 
maximum number of cookies, which Apollo is able to bake using the ingredients that he has and the magic powder.
Input Size : N<=100000, k<=1000000000
Example:
INPUT
3 1
2 1 4
11 3 16
OUTPUT
4
*/

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
