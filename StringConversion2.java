package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class StringConversion2 {
    final static String ALPHABETS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String initialString=sc.next().toUpperCase();
        int len1=initialString.length();
        String convertTo=sc.next().toUpperCase();
        int len2=convertTo.length();
        System.out.println("Output :\n" + 
                conversionCost(initialString,convertTo,len1,len2));
    }
    
    private static int min(int x,int y,int z)
    {
        return Math.min(Math.min(x, y), z);
    }
    
    private static int conversionCost(String string1,String string2,int len1,int len2)
    {
        int insertionCost=Integer.MAX_VALUE;
        int deletionCost=Integer.MAX_VALUE;
        int updationCost;
        
        if(len1==0)
        {
            return insertionCostOfRemainingChars(string2,len2);
        }
        if(len2==0)
        {
            return insertionCostOfRemainingChars(string1,len1);
        }
        char lastChar1=string1.charAt(len1-1);
        char lastChar2=string2.charAt(len2-1);
        if(lastChar1==lastChar2)
            return conversionCost(string1,string2,len1-1,len2-1);
        
        if(len1<len2)
            insertionCost=position(lastChar2)+conversionCost(string1,string2,len1,len2-1);
        else if(len1>len2)
            deletionCost=position(lastChar1)+conversionCost(string1,string2,len1-1,len2);
        updationCost=Math.abs(position(lastChar1)-position(lastChar2))+
                conversionCost(string1,string2,len1-1,len2-1);
        
        return min(insertionCost,deletionCost,updationCost);
    }
    private static int position(char letter)
    {
        return ALPHABETS.indexOf(letter)+1;
    }
    private static int insertionCostOfRemainingChars(String string,int end)
    {
        int cost=0;
        for(int i=0;i<end;i++)
        {
            cost+=position(string.charAt(i));
        }
        return cost;
    }
}
