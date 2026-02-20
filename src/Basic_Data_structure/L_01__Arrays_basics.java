package Basic_Data_structure;

import java.util.Arrays ;
import java.util.Scanner ;
public class L_01__Arrays_basics {
    public static void main ( String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        // Method 1
        int[] num = new int[5] ;
        num[0] = 2 ;
        num[1] = 3 ;
        num[2] = 3 ;
        num[3] = 4 ;
        num[4] = 5 ;

        System.out.println(num[1]);

        // Method 2
        int[] go = new int[]{1,4,7,9,5,6,7,} ;

        System.out.println( go.length);

        //Method 3


        System.out.println("enter number of elments in the array");
        int x = sc.nextInt();
        int[] arr = new int[x] ;

        for( int i=0 ; i<x ; i++)
        {
            arr[i] = sc.nextInt() ;
        }
        System.out.println(arr) ;

        /*

        this will give  us the location iof the first
         element of the array not the actual element of the array
        therefore we will use Arrays.tostrings(array name ) command
         for using this you would have to import java.util.Arrays ;

         */

        System.out.println( Arrays.toString(arr));

        /*

        we can also print array using for loop just like we entered the element in it
        for( int i=0 ; i<x ; i++)
        {
            sout(arr);
        }

         */


    }
}
