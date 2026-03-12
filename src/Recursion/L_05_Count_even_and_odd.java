package Recursion;

import java.util.Scanner;

public class L_05_Count_even_and_odd
{
    static int[] oddEven( int n )
    {
        // base case
        if( n == 0 )
        {
            int [] res = new int[2] ;
            return res;
        }
        int[] count = oddEven( n-1) ;   //previous fucntion will return something you must store it to fully use stack unwinding phase of recursion
        if( n % 2 == 0 )
        {
            count[0]++ ;
        }
        else
        {
            count[1]++ ;
        }
        return count ;
    }

    static void oddEven( int n , int odd , int even  )
    {
        if( n == 0 )
        {
            System.out.println("odd:" + odd);
            System.out.println("even:" + even);
            return ;
        }
        if(n%2==0)
        {
            even++ ;
        }
        else {
            odd++ ;
        }
        oddEven( n-1 , odd , even );


    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println(" enter value of n ");
        int n = sc.nextInt() ;
        int odd_count = 0 ;
        int even_count = 0 ;
         oddEven( n , odd_count , even_count);
        System.out.println(oddEven(n)[1]);


    }
}
