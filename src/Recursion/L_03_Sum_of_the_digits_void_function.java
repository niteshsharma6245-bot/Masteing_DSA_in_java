package Recursion;
import java.util.Scanner;
public class L_03_Sum_of_the_digits_void_function
{
    static void PrintSum( int num , int sum  )
    {
        if( num == 0 )
        {
            System.out.println(sum);
            return ;
        }
        sum += num%10 ;
        PrintSum( num/10 , sum );
    }
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in) ;
        System.out.println("enter the number ");
        int num = sc.nextInt() ;
        int sum = 0 ;
        PrintSum( num , sum );
    }
}
