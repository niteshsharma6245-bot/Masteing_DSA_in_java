package Recursion;

import java.util.Scanner;

public class L_16_Search_and_replace_char
{
    static String replace1( String s , char org_char , char final_char , int index )
    {
        if( index == s.length())
        {
            return "" ;
        }
        String res = replace1( s ,  org_char , final_char , index+1 ) ;
        if( s.charAt( index ) == 'e')
        {
            res = 'a' + res  ;
            return res ;
        }
        res = s.charAt( index ) + res   ;
        return res ;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the string");
        String s = sc.next() ;
        System.out.println( replace1( s , 'e' , 'a' , 0   ));

    }
}
