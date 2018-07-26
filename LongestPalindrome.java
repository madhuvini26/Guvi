import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        String largestPalindrome=new String();
        int startIndex;
        int endIndex;
        int maxLength=0;
        
        for(int i=0;i<string.length();i++)
        {
            for(int j=i+1;j<=string.length();j++)
            {
                String subString=string.substring(i,j);
                if(isPalindrome(subString))
                {
                    if(subString.length() > maxLength)
                    {
                        largestPalindrome=subString;
                        startIndex=i;
                        endIndex=j;
                        maxLength=subString.length();
                    }
                }
            }
        }
        System.out.println("After removing largest Pallindrome : "+string.replace(largestPalindrome,""));
    }
    private static boolean isPalindrome(String string)
    {
        return string.equalsIgnoreCase((new StringBuilder(string).reverse()).toString());
    }
    
}
