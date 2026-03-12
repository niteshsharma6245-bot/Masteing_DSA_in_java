package Recursion;

public class L_14_Find_max_and_min
{
    static int [] minMax( int [] arr , int n )
    {
        if( n == arr.length )
        {
            int res[] = new int[2] ;
            res[0] = Integer.MAX_VALUE ;
            res[1] = Integer.MIN_VALUE ;
            return res ;
        }
        int res[] =  minMax( arr , n+1) ;
        if( arr[n] < res[0])
        {
            res[0] = arr[n] ;
        }
        if(arr[n] > res[1])
        {
            res[1] = arr[n] ;
        }
        return res ;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,3,4,7,9,6,4,2} ;
        int res[] = minMax(arr,0) ;
        for( int x : res )
        {
            System.out.println( x );
        }


    }
}
