package Arrays.LeetCode.Easy;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        System.out.println("Merged Sorted Arrays: 1");
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));

        int[] nums3 = {1};
        int m1 = 1;
        int[] nums4 = { };
        int n1 = 0;
        System.out.println("Merged Sorted Arrays: 2");
        merge(nums3,m1,nums4,n1);
        System.out.println(Arrays.toString(nums3));

        int[] nums5 = {0};
        int m2 = 0;
        int[] nums6 = {1};
        int n2 = 1;
        System.out.println("Merged Sorted Arrays: 3");
        merge(nums5,m2,nums6,n2);
        System.out.println(Arrays.toString(nums5));
    }
}
