package Recursion;

import java.util.Scanner;

public class L_19_Print_adjacent_stars
{
    static String printStars( String s )
    {
        if( s.length() == 1 )
        {
            return s ;
        }
        String res = printStars( s.substring(1)) ;
        if( s.charAt(0)== s.charAt(1))
        {
            return s.charAt(0)+"*"+res ;
        }
        else
        {
            return s.charAt(0)+res ;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the string ");
        String s = sc.nextLine() ;
        System.out.println( printStars(s));

    }
}
