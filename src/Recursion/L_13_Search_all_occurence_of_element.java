package Recursion;

public class L_13_Search_all_occurence_of_element
{
    static int[] search2Helper( int [] arr , int n , int key , int count  )
    {
        if( n == arr.length )
        {
            int res[] = new int[count] ;
            return res ;
        }
        if( arr[n] == key )
        {
            count++ ;
        }
        int res[] =  search2Helper(arr,n+1,key,count) ;
        if( arr[n]== key )
        {
            res[count-1]= n ;
            return res ;
        }
        return res ;

    }

    static int[] search2( int [] arr , int n , int key  )
    {
        // signature is given with 3 parameters
        //but we requeire 4 parameter to solve this  problem efficiently
        //so create another helper fucntion to do the job effectively
        return search2Helper( arr , n , key , 0 ) ;

    }
    public static void main(String[] args)
    {
        int arr[] = { 1 ,2, 3, 2 , 5, 7} ;
        int [] ans = search2( arr , 0, 2) ;
        for( int x : ans )
        {
            System.out.println( x );
        }

    }
}
