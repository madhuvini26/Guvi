package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class SubstringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String string=sc.next();
        List<String> palindromes=new ArrayList<>();      
        
        for(int i=0;i<string.length();i++)
        {
            for(int j=i+2;j<=string.length();j++)
            {
                String substring=string.substring(i,j);
                if(isPalindrome(substring))
                {
                   palindromes.add(substring);
                }
            }
        }
        Collections.sort(palindromes);
        System.out.println("Output : ");
        for(int i=0;i<palindromes.size();i++)
            System.out.println(palindromes.get(i));
    }
    private static boolean isPalindrome(String string)
    {
        return string.equalsIgnoreCase((new StringBuilder(string).reverse()).toString());
    }
    
}
