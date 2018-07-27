package mypackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class LargestNonRepeatingSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String string=sc.next();
        String largestNonRepeatingsubstring=new String();
        int maxLength=0;
        
        for(int i=0;i<string.length();i++)
        {
            for(int j=i+1;j<=string.length();j++)
            {
                String subString=string.substring(i,j);
                if(!hasRepeatedChars(subString))
                {
                    if(subString.length()>maxLength)
                    {
                        largestNonRepeatingsubstring=subString;
                        maxLength=subString.length();
                    }
                }
                
            }
        }
        System.out.print("Output :\n"+largestNonRepeatingsubstring.length());
    }
    
    private static boolean hasRepeatedChars(String string)
    {
        char [] charArray = string.toCharArray();
        Arrays.sort(charArray);
        for(int i=0; i<charArray.length-1; i++)
        {
            if (charArray[i] == charArray[i+1])
                return true;
        }
        return false;
    }
}
