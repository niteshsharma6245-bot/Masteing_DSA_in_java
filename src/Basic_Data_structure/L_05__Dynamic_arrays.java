package Basic_Data_structure;

import java.util.ArrayList;
import java.util.List ;
public class L_05__Dynamic_arrays
{
    public static void main(String[] args)
    {
        List<Integer> list_name = new ArrayList<>() ;
        list_name.add(5 );
        list_name.add(10);
        list_name.add(15);

        // traversing the dynamic array
        // method 1
        for(int i = 0 ; i < list_name.size() ; i++)
        {
            System.out.println(list_name.get(i));
        }

        System.out.println("-------------");

        // method 2
        for(int x: list_name)
        {
            System.out.println(x);
        }

    }
}
