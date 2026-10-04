package Sorting;

import java.util.Arrays;
public class SelectionSortImplementation {
    static void selectionSort(int[] arr){

        for(int count = 0 ; count < arr.length; count++){
            int index_min =count;
            for(int i = count+1; i < arr.length; i++){
                if(arr[i] < arr[index_min]){
                    index_min = i;
                }
            }
            int temp = arr[count];
            arr[count] = arr[index_min];
            arr[index_min] = temp;
        }
    }

    static void displayArray(int[] arr){
        System.out.println("The contents of the Array: "+Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] arr = {5,2,11,1,7};
        System.out.println("Before Sorting");
        displayArray(arr);
        selectionSort(arr);
        System.out.println("After Sorting");
        displayArray(arr);
    }
}
