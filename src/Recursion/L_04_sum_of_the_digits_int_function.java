package Recursion;

import java.util.Scanner;
public class L_04_sum_of_the_digits_int_function
{
    static int PrintSum( int num  )
    {

        if( num == 0 )
        {
            return 0  ;
        }
        return num % 10 + PrintSum( num/10 ) ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the number ");
        int num = sc.nextInt() ;
        int sum = 0 ;
        System.out.println(PrintSum(num  )) ;
    }
}
