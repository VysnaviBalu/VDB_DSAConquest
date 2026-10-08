package Sorting;

import java.util.Arrays;

public class QuickSortImplementation {

    public static void quickSort(int[] arr, int low, int high){
     // recursive method
        if(low < high){
            int pivot = arrayPartition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    public static int arrayPartition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j=  high;

        while(i<j){
            while(i <= high && arr[i] <= pivot){
                i++;
            }
            while(j >= low && arr[j] > pivot){
                j--;
            }
            if(i<j){
                swap(arr, i, j);
            }
        }
        swap(arr,j,low);
        return j;
    }

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main (String[] args){
        int[] arr = {5,3,2,6,1,8,0,10};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}