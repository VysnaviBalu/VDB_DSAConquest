package Sorting;
import java.util.Arrays;

public class BubbleSortImplementation {

    void bubbleSort(int[] arr){
        for(int count = 0; count < arr.length -1; count++){
            boolean swapped = false;
            for(int i = 0; i < arr.length-1-count; i++){
                if(arr[i] > arr[i+1]){
                   int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    void displayArray(int[] arr){
        System.out.println("View contents of the array:- "+Arrays.toString(arr));
    }

    public static void main(String[] args){
        BubbleSortImplementation bubbleSort = new BubbleSortImplementation();
        int[] arr = {5,2,10,1,0};
        bubbleSort.displayArray(arr);
        bubbleSort.bubbleSort(arr);
        bubbleSort.displayArray(arr);
    }
}
