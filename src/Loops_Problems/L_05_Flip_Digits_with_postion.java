package Loops_Problems;


import java.util.Scanner;

public class L_05_Flip_Digits_with_postion
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter your number ");
        int num = sc.nextInt() ;

        int pos = 0 ;
        int finalDigit = 0 ;
        while( num != 0 )
        {
            pos++ ;
            finalDigit += (int) (pos*(Math.pow(10 , ( (num % 10) - 1 ))));
            num /= 10 ;
        }
        System.out.println( finalDigit);



    }
}
