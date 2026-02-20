package Basic_Data_structure;

import java.util.Scanner ;
public class L_06__Exception_Handling
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter two numbers :");
        int a = sc.nextInt() ;
        int b = sc.nextInt() ;

        int[] arr = new int[5] ;
        // arr[5] = 10 ;  exception occurs : index out of bounds

        try
        {
            System.out.println(a/b);
            arr[5] = 10 ; // exception index out of bounds
        }
        catch(Exception e) // Exception included all types of exceptions
        {
            System.out.println("Something happ......."); // instead of exception it prints this meessage
        }

        // if you want to know the name of the exception which occurs you can write this code


        System.out.println("====================================");
        try
        {
            System.out.println(a/b);
            arr[5] = 10 ;
        }
        catch( ArithmeticException e)
        {
            System.out.println("arithmatic exception occured ");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index out of bound exception ");
        }

    }
}
