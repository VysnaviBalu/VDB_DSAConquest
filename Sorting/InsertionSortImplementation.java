package Sorting;
import java.util.Arrays;
public class InsertionSortImplementation {

    static void insertionSort(int[] arr){
          int i;
        for(int count = 1 ; count < arr.length; count++){
            int temp = arr[count];
            System.out.println("Temp: "+temp);
            for(i = count - 1; i >=0 && arr[i] > temp ; i--){
                    arr[i+1] = arr[i];
            }
            arr[i+1] = temp;
        }
    }

    static void displayArray(int[] arr){
        System.out.println("View the values of the array "+Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] arr = {5,7,1,2,0};
        System.out.println("Before Sorting");
        displayArray(arr);
        insertionSort(arr);
        System.out.println("After Sorting");
        displayArray(arr);
    }
}
