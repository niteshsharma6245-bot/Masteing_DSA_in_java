package Recursion;

public class L_12_Searching_element
{
    static int search1( int [] arr , int n , int key )
    {
        if( n == arr.length )
        {
            return -1 ;
        }
        if( arr[n] == key )
        {
            return n ;
        }
        return search1( arr , n + 1 , key ) ;
    }
    static void search( int [] arr , int n , int key )
    {
        if( n == arr.length )
        {
            System.out.println("element not founded ");
            return ;
        }
        if( arr[n] == key )
        {
            System.out.println( n );
            return ;
        }
        search( arr , n + 1 , key);
    }
    public static void main(String[] args)
    {
        int arr[] = { 1,3,4,5,6,7};
        search( arr , 0 , 5);
        System.out.println(search1(arr,0, 10));

    }
}
