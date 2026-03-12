package Recursion;

import java.util.Scanner;

public class L_20_Right_triangle_star_pattern
{
    static void printStar( int n )
    {
        if( n == 0 )
        {
            return ;
        }
        System.out.print("*");
        printStar(n-1);
    }
    static void printLines( int n )
    {
        if( n == 0 )
        {
            return ;
        }
        printLines( n-1 ) ;
        printStar( n );
        System.out.println();
    }
    public static void main(String[] args)
    {
        printLines(5 );



    }
}
