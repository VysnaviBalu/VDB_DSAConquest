package Arrays.LeetCode.Medium;

import java.util.Arrays;

public class SortColors_75 {
    public static void sortColors(int[] nums){
        int low = 0; // this index maintains the position of 0s
        int mid = 0; // this holds current position from left to right
        int high = nums.length -1; // this traverses from right to left

        /**
         * the logic is to keep the 0s in the front and 2s at the end of array so
         * traversing from left to right and from right to left
         * swapping 0s and 2s accordingly and leaving 1s to align in the middle at the end
         * Time complexity:- O(n) traversing in both directions without reverse
         * Space complexity:- O(1) only temp int variables and modifying existing nums array
         **/

        while (mid <= high){
            // mid and high cross each other at the end also ever element is checked once
            if(nums[mid] == 0){
                int temp1 = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp1;
                mid++;
                low++;
            } else if (nums[mid] ==1){
                mid++;
            } else if(nums[mid]== 2){
                int temp2 = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp2;
                high--;
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println("Sorted Array: 1");
        System.out.println(Arrays.toString(nums));

        int[] nums1 = {2,0,1};
        sortColors(nums1);
        System.out.println("Sorted Array: 2");
        System.out.println(Arrays.toString(nums1));

    }
}
