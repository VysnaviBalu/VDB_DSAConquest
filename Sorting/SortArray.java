package Sorting;

import java.util.Arrays;

public class SortArray {

    public static int[] sortArray(int[] arr, int start, int mid, int end){
        int[] newArray = new int[arr.length];
        int i = start;
        int j = mid+1;
        int k = start;

        while(i <=mid && j< end){
            if(arr[i]< arr[j]){
                newArray[k] = arr[i];
                i++;
            } else {
                newArray[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<= mid){
            newArray[k] = arr[i];
            i++;
            k++;
        }

        while(j<end){
            newArray[k] = arr[j];
            j++;
            k++;
        }

        for(int itr = start; itr< end; itr++){
            arr[itr] = newArray[itr];
        }
        return arr;
    }


    public static void main(String[] args){
        int[] arr = {1, 3, 7, 9, 10, 15, 1, 2, 5, 6};
        System.out.println("**** Array before Sorting *****");
        System.out.println(Arrays.toString(arr));
        System.out.println("**** Array after Sorting ****");
        int[] result = sortArray(arr, 0, arr.length/2, arr.length);
        System.out.println(Arrays.toString(result));
    }
}
