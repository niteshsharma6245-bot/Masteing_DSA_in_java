package Loops_Problems;

import java.util.Scanner;

public class L_02_Prime_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");

        int num = sc.nextInt() ;
        if( num < 0 )
        {
            System.out.println("Negative numbers ");
        }
        if( num == 0 || num == 1 )
        {
            System.out.println("Neither prime not composite");
        }
        int count = 0 ;
        for( int i = 2 ; i*i < num ; i++ )
        {
            if( num % i == 0 )
            {
                count++ ;
                break ;
            }
        }
        if( count == 0 )
        {
            System.out.println("Prime number ");
        }
        else {
            System.out.println("composite number ");
        }

    }
}
