package Recursion;

import java.util.Scanner;

public class L_21_Climbing_stairs
{
    static int climbingStairs( int n )
    {
        if(n<=1)
        {
            return 1 ;
        }
        int step1 = climbingStairs( n-1) ;
        int step2 = climbingStairs( n-2 ) ;
        return step1 + step2 ;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter number of stairs ");
        int n = sc.nextInt() ;

        System.out.println(climbingStairs(n));


    }
}
