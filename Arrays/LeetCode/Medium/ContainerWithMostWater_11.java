package Arrays.LeetCode.Medium;

public class ContainerWithMostWater_11 {

    public static int maxArea(int[] height) {
        int left = 0; // left pointer for traverse
        int right = height.length -1; // right pointer for traverse

        int maxArea = 0 ; // Biggest area of water contained

        while ( left < right){

            int length = right - left; // distance between the indexes

            // calculate the current area based on the indexes and breadth
            int currentArea = Math.min(height[left], height[right]) * length;

            // Keep the current Max Area , saved to be returned at the end
            maxArea = Math.max(maxArea, currentArea);
            if (height[left] < height[right]){
                // left is small,  move rightwards to find the next biggest height[left];
                left ++;
            } else {
                right --;
                // right is small,  move leftwards to find the next biggest height[right];
            }
        }
        return maxArea;
    }

    public static void main(String[] args){
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        System.out.println("Area containing the most water:- "+maxArea(height1));
        int[] height2 = {1,1};
        System.out.println("Area containing the most water:- "+maxArea(height2));
    }
}
