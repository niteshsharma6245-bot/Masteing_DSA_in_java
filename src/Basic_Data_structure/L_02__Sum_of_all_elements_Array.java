package Basic_Data_structure;

import java.util.Arrays ;
import java.util.Scanner ;
public class L_02__Sum_of_all_elements_Array {
    public static void main( String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("enter number of elments in the array");
        int x = sc.nextInt();
        int[] arr = new int[x] ;

        for( int i=0 ; i<x ; i++)
        {
            arr[i] = sc.nextInt() ;
        }
        System.out.println("array is : " + Arrays.toString(arr)) ;

        int sum = 0 ;
        for( int j=0 ; j<x ; j++)
        {
            sum = sum + arr[j] ;
        }

        System.out.println("Sum opf all elements of array is :" + sum );
    }
}
