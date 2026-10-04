package Sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static int[] mergeTwoArrays(int[] bigArray, int[] smallArray){
        int size = bigArray.length + smallArray.length;
        int[] mergeArray = new int[size];
        int i = 0;
        int j = 0;
        int k =0;
        while (i <bigArray.length && j < smallArray.length){
            if(bigArray[i] <= smallArray[j]){
                mergeArray[k] = bigArray[i];
                i++;
            } else {
                mergeArray[k] = smallArray[j];
                j++;
            }
            k++;
        }

        while (i < bigArray.length){
            mergeArray[k] = bigArray[i];
            i++;
            k++;
        }
        while (j < smallArray.length){
            mergeArray[k] = smallArray[j];
            j++;
            k++;
        }
        return mergeArray;
    }

    public static void displayArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] arr1 = {1,3,7,9,10,15};
        int[] arr2 = {1,2,5,6};
        System.out.println("***** First Array *****");
        displayArray(arr1);
        System.out.println("***** Second Array *****");
        displayArray(arr2);
        int[] result = mergeTwoArrays(arr1, arr2);
        System.out.println("***** Final Merged Array *****");
        displayArray(result);
    }
}
