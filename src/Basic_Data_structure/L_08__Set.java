package Basic_Data_structure;// import java.util.Map ;
import java.util.HashSet;
import java.util.Set ;

public class L_08__Set
{
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<>() ;
        set.add(1) ;
        set.add(2) ;
        set.add(3) ;
        set.add(1) ;

        System.out.println(set) ;

        // converting arrays to set , it will remove all duplicates values of the set

        Set<Integer> set1 = new HashSet<>() ;
        int [] arr = new int[]{1,2,2,2,3,3,4,4,5,5} ;
        for( int i = 0 ; i<arr.length ; i++)
        {
            // set.add(i) it will not print acc to the array
            set1.add(arr[i]) ;
        }
        System.out.println(set1) ;

        // we cannot use get function with set dsa for this uh have to  convert this into array..

        Integer[] conv_array = set1.toArray(new Integer[0]);

        System.out.println(Arrays.toString(conv_array));


    }
}
