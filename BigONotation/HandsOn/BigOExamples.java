package BigONotation.HandsOn;

public class BigOExamples {
    private int arr[];
    /**
     * O(1)
     * Always get the 1st element irrespective of number of inputs
     * sorted or unsorted
     */

    public BigOExamples(int arr[]){  // Get 1st element - O(1)
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException(
                    "Array cannot be empty");
        }
        this.arr = arr;
    }
    public  int getFirstElement(){
        return arr[0]; // Always one step regardless of the size
    }

    /**
     * O(log n) - Find the target's position and return the position
     * @param target
     * @return n
     * Questions to ask / Discussion with interviewer
     * 1. Are inputs are sorted
     * 2. if not, can I sort them to implement Algo with best time complexity
     * 3. I would try the solution with simple array to avoid over engineering
     */
    public  int binarySearch(int target){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = (left + right) /2;
            if(target == arr[mid]){return mid;}
            if (target < arr[mid]) {
                right = mid -1;
            }else {
                left = mid +1;
            }
        }
        return -1;
    }

    public int linearSearch(int target){
        for(int i= 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public void searchStatus(int index){
        if(index == -1){
            System.out.println("Target not found");
        }else {
            System.out.println("The target is in position: "+index);
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 9, 11};
        BigOExamples big = new BigOExamples(arr);
        System.out.println("The first value is "+big.getFirstElement());
        big.searchStatus(big.binarySearch(5));
        big.searchStatus(big.binarySearch(1));
        big.searchStatus(big.binarySearch(11));
        big.searchStatus(big.binarySearch(12));
        big.searchStatus(big.linearSearch(11));
    }
}
