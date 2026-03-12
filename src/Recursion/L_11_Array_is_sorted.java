package Recursion;

import java.util.Scanner;

public class L_11_Array_is_sorted
{
    static boolean is_Sorted( int [] arr , int n )
    {
        if( n == arr.length -1 )
        {
            return true ;
        }
        if( arr[n] > arr[n+1])
        {
            return false ;
        }
        return is_Sorted( arr , n+1 ) ;
    }
    static void isSorted( int [] arr , int n  )
    {
        if( n == arr.length - 1  )
        {
            System.out.println(" sorted array");
            return ;
        }
        if( arr[n] > arr[n+1])
        {
            System.out.println("unsorted array");
            return ;
        }
        isSorted(arr, n+1);
    }
    public static void main(String[] args)
    {
        Scanner cs = new Scanner(System.in) ;
        int [] arr = new int[]{ 10 , 20 , 30  , 50} ;
        isSorted( arr , 0 );
        System.out.println( is_Sorted( arr , 0 ));


    }
}
