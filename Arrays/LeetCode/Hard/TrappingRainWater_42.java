package Arrays.LeetCode.Hard;

public class TrappingRainWater_42 {
    public static int trapWater(int[] height){
        int left = 0; // traversing from left to right
        int right = height.length -1; // traversing from right to left

        int leftMax = 0;  // left maximum height variable
        int rightMax = 0; // right maximum height variable
        int water = 0;  //  rain water trapped

        while ( left < right)  {  // traversing from min to max index of the array)
            if (height[left] < height[right]) { // this step is to capture which side has a comparitively bigger height to traverse the flow from that direction
                if (height[left] >= leftMax) { // compare which is bigger in left currently
                    leftMax = height[left]; // swap to new left big value
                } else {
                    water += leftMax - height[left]; // calculate the water trapped with current left
                }
              left ++; //  only decrement outside leftMax and height[left] comparison
            } else  {
               if(height[right] >= rightMax){
                   rightMax = height[right];
               } else {
                   water += rightMax - height[right];
               }
               right -- ; // only decrement outside rightMax and height[right] comparison
           }
        }
        return water;
    }

    public static void main(String[] args){
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Water trapped:- "+trapWater(height1));

        int[] height2 = {4,2,0,3,2,5};
        System.out.println("Water trapped:- "+trapWater(height2));

    }
}
