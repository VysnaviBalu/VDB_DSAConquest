package Day2.Arrays;

//Heights: [1, 8, 6, 2, 5, 4, 8, 3, 7]
//        i (left)                 j (right)
//
//        8 |    ■                       ■
//        7 |    ■                       ■       ■
//        6 |    ■   ■                   ■       ■
//        5 |    ■   ■       ■           ■       ■
//        4 |    ■   ■       ■   ■       ■       ■
//        3 |    ■   ■       ■   ■       ■   ■   ■
//        2 |    ■   ■   ■   ■   ■       ■   ■   ■
//        1 |■   ■   ■   ■   ■   ■   ■   ■   ■   ■
//        ----+-------------------------------------
//        Idx: 0   1   2   3   4   5   6   7   8   9
//
//        |<------------ Width = (j - i) ------>|

//public class ContainerWithWater {
//    private int[] heights;
//    public ContainerWithWater(int[] heights){
//        this.heights = heights;
//    }
//
//    public int maxArea(int[] heights){
//        int left = 0, right = heights.length -1, maxArea = 0;
//
//    }
//
//}
