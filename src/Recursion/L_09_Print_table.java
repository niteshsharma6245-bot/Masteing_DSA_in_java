package Recursion;

import java.util.Scanner;

public class L_09_Print_table
{
    static String printTable2( int n , int m )
    {
        if( m == 0 )
        {
            return "" ;
        }
        String res1 = printTable2( n , m-1 ) ;
        String expression = n + "*" + m + "=" + (n*m) + "\n" ;
        return res1 + expression ;

    }

    static void printTable( int n , int f )
    {
        if( f == 0 )
        {
            return ;
        }
        printTable( n , f-1 ) ;
        System.out.println( n + "*" + f + "=" + n*f);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the number ");
        int n = sc.nextInt() ;
        printTable( n , 10 );
        String result = printTable2( n+1 , 10 ) ;
        System.out.println(result);

    }
}
