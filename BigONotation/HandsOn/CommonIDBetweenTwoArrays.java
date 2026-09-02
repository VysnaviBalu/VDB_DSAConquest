package BigONotation.HandsOn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
public class CommonIDBetweenTwoArrays {

    /**
     * Level 1 complexity - using nested for loop
     * @param arr1
     * @param arr2
     * @return
     */
    public static List<Integer> findCommonIDsLevel1(int arr1[], int arr2[]){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
            for (int j=0; j<arr2.length; j++){
                if((arr1[i] == arr2[j]) && (!arrayList.contains(arr2[j]))) {
                    arrayList.add((arr1[i]));
                }
            }
        }
        return arrayList;
    }

    /**
     * Level 2 Complexity - using HashSet to move contents of array
     * @param args
     */

    public static HashSet<Integer> findCommonIDsLevel2(int arr1[], int arr2[]){
        HashSet<Integer> arr = new HashSet<>();
        HashSet<Integer> commonValues = new HashSet<>();
        for(int n: arr1){arr.add(n);}
        for(int n: arr2){
            if(arr.contains(n)){
                commonValues.add(n);
            }
        }
        return commonValues;
    }

    public static Set<Integer> findCommonIDsHybrid(int[] arr1, int[] arr2) {
        int threshold = 100; // pick a size below which array-scan wins

        if (arr1.length < threshold && arr2.length < threshold) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            // use your Level 1 style approach
            for(int i=0; i<arr1.length; i++){
                for (int j=0; j<arr2.length; j++){
                    if((arr1[i] == arr2[j]) && (!arrayList.contains(arr2[j]))) {
                        arrayList.add((arr1[i]));
                    }
                }
            }
            HashSet<Integer> commonValue = new HashSet<>(arrayList);
            return commonValue;
        } else {
            // use your Level 2 HashSet approach
            HashSet<Integer> arr = new HashSet<>();
            HashSet<Integer> commonValues = new HashSet<>();
            for(int n: arr1){arr.add(n);}
            for(int n: arr2){
                if(arr.contains(n)){
                    commonValues.add(n);
                }
            }
            return commonValues;
        }
    }

    public static void main(String[] args){
        int[] arr1 = {1,1,3};
        int[] arr2 = {1,5,4,3};
        System.out.println(findCommonIDsLevel1(arr1,arr2).toString());
        System.out.println(findCommonIDsLevel2(arr1,arr2).toString());
        System.out.println(findCommonIDsHybrid(arr1,arr2).toString());
    }
}
