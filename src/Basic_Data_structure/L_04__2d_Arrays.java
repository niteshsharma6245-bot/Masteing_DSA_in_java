package Basic_Data_structure;

import java.util.Arrays;

public class L_04__2d_Arrays {
    public static void main( String[] args)
    {
        // method 1
        int[] arr1 = new int[]{1,2,3} ;
        int[] arr2 = new int[]{4,5,6} ;

        int[][] arr  = new int[][]{arr1 , arr2 } ;
        System.out.println(Arrays.toString(arr));// return the address of both the arrays
        System.out.println(Arrays.toString(arr[0])); // returning first element of 2d array

        //method 2
        char[][] Arr = new char[][]{{'a','b','c'},{'d','e','f'}} ;
        System.out.println(Arrays.toString(Arr));
        System.out.println(Arrays.toString(Arr[0]));

        // now our task is to print the character b in output
        //  method 1
        char[] a = Arr[0] ;
        System.out.println(a[1]);

        // method 2
        System.out.println(Arr[0][1]);
    }

}
