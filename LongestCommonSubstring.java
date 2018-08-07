package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String s1=sc.next();
        String s2=sc.next();
        String longestCommonString=new String();
        int maxLength=Integer.MIN_VALUE;
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i+1;j<s1.length();j++)
            {
                String substring=s1.substring(i,j);
                if(s2.contains(substring))
                {
                    if(substring.length()>maxLength)
                    {
                        maxLength=substring.length();
                        longestCommonString=substring;
                    }
                }                    
            }
        }
        System.out.println("Output :\n" + longestCommonString);
    }
}
