package Recursion;

import java.util.Scanner;

public class L_18_remove_consecutive_duplicates
{
    static String removeDuplicate( String s )
    {
        if( s.length() == 1 )
        {
            return s ;
        }
        String res = removeDuplicate( s.substring(1)) ;
        if( s.charAt(0) == s.charAt(1))
        {
            return res ;
        }
        else
        {
            return s.charAt(0)+res ;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the string");
        String s = sc.nextLine() ;
        System.out.println( removeDuplicate(s));

    }
}
