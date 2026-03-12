package Recursion;

public class L_23_Maze_Runner
{
    static void mazeRunner( int stRow , int stCol , int endCol , int endRow , String res ) {
        if (stRow > endRow || stCol > endCol) {
            return;
        }
        if (stRow == endRow && stCol == endCol) {
            System.out.println(res);
            return;
        }
        mazeRunner(stRow+1 , stCol ,endCol , endRow , res+"H");
        mazeRunner(stRow , stCol+1 ,endCol , endRow , res+"V");
    }

        static int mazeRunner( int stRow , int stCol , int endCol , int endRow  )
        {
            if( stRow > endRow || stCol > endCol )
            {
                return 0 ;
            }
            if( stRow == endRow && stCol == endCol)
            {
                return 1;
            }
        int o1 = mazeRunner( stRow+1, stCol , endCol , endRow  );
        int o2 = mazeRunner( stRow, stCol+1 , endCol , endRow );
        return o1+o2 ;
    }
    public static void main(String[] args)
    {
        mazeRunner( 0,0,2,2,"");
        System.out.println( mazeRunner(0,0,2,2));


    }
}
