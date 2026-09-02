package Arrays.Local;

import java.util.Scanner;
public class ArraysImplementationSimple {

    int length;
    int size;
    int[] arr;

    public ArraysImplementationSimple(int[] arr, int length, int size){
        this.arr = arr;
        this.length = length;
        this.size = size;
    }

    /**
     * Display Array
     */
    public void printArray(){
        System.out.print("{");
        for(int a: arr){
            System.out.print(a+",");
        }
        System.out.println("}");
    }

    /**
     * Get Element - Getter
     * @param index
     * @return
     */
    public int getElement(int index){
        int element = arr[index];
        return element;
    }

    /**
     * Update Element - Setters
     * @param index
     * @param element
     */
    public void setElement(int index, int element){
        arr[index] = element;
        printArray();
    }
   public void insertElement(int index, int element){
       if(size >= length) {
           System.out.println("No vacancy within the array");
           throw new ArrayIndexOutOfBoundsException("Index out of bound");
       }
       for(int j= length-1; j>index;j--){
           arr[j] = arr[j-1];
       }
           arr[index]= element;
           size++;
   }

    /**
     * Delete Array
     * @param index
     */
   public void deleteElement(int index){
      for(int k= index; k< length-1; k++){
          arr[k] = arr[k+1];
      }
      size--;
   }

   // Search Array
   public void searchArray(int element){
       for(int i = 0; i < size; i++) {
           if (arr[i] == element) {
               System.out.println(element + " is found at index:" + i);
               return;
           }
       }
       System.out.println(element+ " is not in the array");
   }

public static void main(String[] args){
    // Create an Array - O(1)
    int[] arr = new int[7];
    int size = 0;
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < arr.length-1; i++){
        System.out.println("Please enter a value");
        arr[i] = sc.nextInt();
        size++;
    }

    System.out.println("Length of the array: "+arr.length);
    System.out.println("Size of the array: "+size);

    ArraysImplementationSimple ars = new ArraysImplementationSimple(arr, arr.length, size);
    System.out.println("Fresh Array:- ");
    ars.printArray();
// Access - O(1)
    System.out.println(" The Element at index 4 is : "+arr[4]);
    System.out.println("The Big O Notation to ACCESS an element using constant index:- O(1)");

// Update - O(1)
    ars.setElement(4,18);
    System.out.println("The index 4 has been updated to "+arr[4]);
    System.out.print("Updated Array:- ");
    ars.printArray();
    System.out.println("The Big O Notation to UPDATE an element using constant index:- O(1)");

// Insert - O(n)
    ars.insertElement(2,22);
    System.out.println("Newly Inserted Array:- ");
    ars.printArray();
    System.out.println("The Big O Notation to INSERT an element:- O(n)");
// Delete = O(n)
    ars.deleteElement(4);
    System.out.println("Newly Deleted Array:- ");
    ars.printArray();
    System.out.println("The Big O Notation to DELETE an element:- O(n)");

// Search = O(n)
    ars.searchArray(3);
    System.out.println("The Big O Notation to SEARCH an element:- O(n)");
   }

}
