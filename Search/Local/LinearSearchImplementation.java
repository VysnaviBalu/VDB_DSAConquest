package Search.Local;

import java.util.Arrays;

public class LinearSearchImplementation {

    static int find(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
     return -1;
    }

    static boolean contains(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    static int find(String str, char target){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }

    static boolean contains(String str, char target){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    static int[] find(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j= 0; j< arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static boolean contains(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }


        public static void main(String[] args){
            int[] arr = {1,2,6,4,8,6,7};
            int arrTarget = 7;
            int arrTarget2 = 9;

            String str = "Badass Coder";
            char strTarget = 'a';
            char strTarget2 = 'V';

            int[][] arr2D = {
                    {1,2},
                    {4,5,6},
                    {0}
            };
            int arr2DTarget = 6;
            int arr2DTarget2 = 10;

            System.out.println(LinearSearchImplementation.find(arr, arrTarget));
            System.out.println(LinearSearchImplementation.contains(arr, arrTarget2));

            System.out.println(LinearSearchImplementation.find(str, strTarget));
            System.out.println(LinearSearchImplementation.contains(str, strTarget2));

            System.out.println(Arrays.toString(LinearSearchImplementation.find(arr2D, arr2DTarget)));
            System.out.println(LinearSearchImplementation.contains(arr2D, arr2DTarget2));
        }

}
