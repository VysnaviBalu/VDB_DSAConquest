package Search.Local;


public class BinarySearchImplementation {
    int binarySearch_Index(int[] arr, int target){
        if(arr == null || arr.length ==0){
            System.out.println("The Array is empty");
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        boolean isAscending = arr[start] <= arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid]== target){
               return mid;
            }
            if(isAscending){
              if(arr[mid] > target){
                  end = mid -1;
              } else{
                  start = mid +1;
              }
            } else {
                if (arr[mid] < target){
                    end = mid - 1;
                } else {
                    start = mid +1;
                }

            }
        }
        System.out.println("The Target is not in the array");
        return -1;
    }

    public static void main(String[] args){
        BinarySearchImplementation binary = new BinarySearchImplementation();
        int[] arr = {5,6,9,11,25,33};
        int target = 11;

        System.out.println("The Target "+target+ " is found at index "+binary.binarySearch_Index(arr, target));

        int[] arr1 = {55,44,33,22,11,0};
        int target1 = 0;

        System.out.println("The Target "+target1+ " is found at index "+binary.binarySearch_Index(arr1, target1));
    }
}