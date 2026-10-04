package Sorting;

import java.util.Arrays;

public class MergeSortImplementation {
    int[] arr;
    public static void sortArray(int[] arr, int start, int mid, int end){
      int[] newArray = new int[arr.length];
      int i = start;
      int j= mid;
      int k = start;

      while(i <mid && j< end){
          if(arr[i]< arr[j]){
              newArray[k] = arr[i];
              i++;
          } else {
              newArray[k] = arr[j];
              j++;
          }
          k++;
      }

      while(i< mid){
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
    }

    public static void mergeSort(int[] arr, int start, int end){
        int mid = (start+end)/2;
        if (end - start == 1) {
            return;
        }
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        sortArray(arr, start, mid, end);
    }

    public static void main(String[] args){
        int[] arr = {1,5,3,0,9,6};
        System.out.println("**** Array before Sorting *****");
        System.out.println(Arrays.toString(arr));
        System.out.println("**** Array after Sorting ****");
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
