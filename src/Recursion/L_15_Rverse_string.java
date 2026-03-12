package Recursion;

import java.util.Scanner;

public class L_15_Rverse_string
{
    static String reverse( String s , int index )
    {
        if( index == s.length() )
        {
            return "" ;
        }
        String res = reverse( s , index+1 ) ;
        res = res + ( s.charAt( index )) ;
        return res ;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println(" enter the string ");
        String s = sc.next();
        System.out.println( reverse( s , 0 ));


    }
}
