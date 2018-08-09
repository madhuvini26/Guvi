package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class StringConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String initialString=sc.next();
        int len1=initialString.length();
        String convertTo=sc.next();
        int len2=convertTo.length();
        System.out.println("Output :\n" + 
                conversionCost(initialString,convertTo,len1,len2));
    }
    static int min(int x,int y,int z)
    {
        return Math.min(Math.min(x, y), z);
    } 
    static int conversionCost(String string1,String string2,int len1,int len2)
    {
        int insertionCost=Integer.MAX_VALUE;
        int deletionCost=Integer.MAX_VALUE;
        int updationCost;
        
        if(len1==0)
            return len2;
        if(len2==0)
            return len1;
        if(string1.charAt(len1-1)==string2.charAt(len2-1))
            return conversionCost(string1,string2,len1-1,len2-1);

        if(len1<len2)
            insertionCost=conversionCost(string1,string2,len1,len2-1);
        else if(len1>len2)
            deletionCost=conversionCost(string1,string2,len1-1,len2);
        updationCost=conversionCost(string1,string2,len1-1,len2-1);
        
        return 1+min(insertionCost,deletionCost,updationCost);
    }
}
