package Search.Local;

public class BinarySearchRecursion {

     static int  binarySearch_Index(int[] arr, int target){
         if (arr == null || arr.length == 0) {
             System.out.println("The array is empty");
             return -1;
         }
        int start = 0;
        int end = arr.length -1;
        return binarySearchFind_Recursion(arr, target, start, end);
    }

    static int binarySearchFind_Recursion(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end -start)/2;
        if(arr[mid] == target){
            return mid;
        }

        boolean isAsc = arr[start] <= arr[end];
            if(isAsc){
                if(arr[mid] > target){
                    return binarySearchFind_Recursion(arr, target, start, mid-1);
                } else{
                    return binarySearchFind_Recursion(arr, target, mid+1, end);
                }
            }else{
                if(arr[mid] < target){
                    return binarySearchFind_Recursion(arr, target, start, mid-1);
                } else {
                    return binarySearchFind_Recursion(arr, target, mid+1, end);
                }
            }
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,6,7};
        int target1 = 7;
        System.out.println("The Target "+target1+ " is at index "+binarySearch_Index(arr1, target1));

        int[] arr2 = {9,8,7,6,5,4,3,2,1};
        int target2 = 6;
        System.out.println("The Target "+target2+ " is at index "+binarySearch_Index(arr2, target2));

        int[] arr3 = {};
        int target3 = 4;
        System.out.println("The Target "+target3+ " is at index "+binarySearch_Index(arr3, target3));

    }
}
