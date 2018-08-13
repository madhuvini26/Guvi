/*
Given a string S, remove the characters which exist more than one times, and print the remaining string.
Input Size : |S| <= 10000000
Sample Testcase :
INPUT
Engineering
OUTPUT
Er
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class RemoveRepeatedChars {
    static final String ALPHABETS="abcdefghijklmnopqrstuvwxyz";
    static boolean[] found;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        found=new boolean[ALPHABETS.length()];
        System.out.print("Input : ");
        String word=sc.next();
        
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            int index=ALPHABETS.indexOf(c);
            if(index!=-1)
            {
                if(!found[index])
                    found[index]=true;
                else
                    word=word.replace(c,' ');
            }
        }
        System.out.println("Output :\n" + word.replace(" ", ""));
    }
}
