package Basic_Data_structure;

import java.util.HashMap ;
import java.util.Map ;
public class L_07__HashMap
{
    public static void main(String[] args)
    {
        Map<Integer , String> map = new HashMap<>() ;
        map.put(1 , "Nitesh") ;
        map.put(2 , "Tejaswii") ;
        map.put(3 , "btech") ;

        map.put( 3 , "Love") ; // value gets overwrite

        System.out.println(map.get(3));
    }

}
