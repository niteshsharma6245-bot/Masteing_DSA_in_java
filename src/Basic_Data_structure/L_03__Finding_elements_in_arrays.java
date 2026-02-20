package Basic_Data_structure;//Q1 = Find the element
//Q2 = Find the first occurence of that elemenbt
//Q3 = Find the last occurence of that element

import java.util.Arrays ;
import java.util.Scanner ;
public class L_03__Finding_elements_in_arrays {
    public static void main( String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of elments in the array");
        int x = sc.nextInt();
        int[] arr = new int[x] ;

        for( int i=0 ; i<x ; i++)
        {
            arr[i] = sc.nextInt() ;
        }
        System.out.println("array is : " + Arrays.toString(arr)) ;

        System.out.println("enter no. to be found :");
        int key = sc.nextInt() ;

        for( int j = 0 ; j<x ; j++)
        {
            if( arr[j] == key)
            {
                System.out.println("element found at index :" + j);
                break ;  //if we do not use this break then it will show us recuring output if key is more than 1 in array
            }
        }

        /* for finding last occurence
         for( int j = 0 ; j<x ; j++)
        {
            if( arr[j] == key)
            {
                index = j ;

                           }
        }
         */


    }
}
