package Arrays.Local;

public class DynamicArrayImplementation {

    int[] arr;
    int capacity;
    int size;

    public DynamicArrayImplementation(int capacity){
        arr = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }

    boolean insert (int index, int element){
        if(index < 0 || index > size){
            System.out.println("Invalid Index");
            return false;
        } else if (size >= capacity){
            resize();
        }
        for(int i = size; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = element;
        size++;
        return true;
    }

    int get(int index){
        if(index >0 || index >=size){
            System.out.println("Invalid Index");
            return 9999;
        }
        System.out.println("The value from GET method: "+arr[index]);
        return arr[index];
    }

    void set(int index, int element){
        System.out.println("The value from SET method: "+element);
        arr[index]= element;
    }

    boolean delete(int index){
        if(index <0 || index >= size){
            System.out.println("Invalid Index");
            return false;
        }
        for(int i = index; i< size; i++){
            arr[i] = arr[i+1];
        }
        size--;
        return true;
    }
    int search(int element){
        for(int i = 0; i <size; i++){
            if (arr[i]== element){
                System.out.println(element+ " is at index: "+i);
                return i;
            }
        }
        System.out.println("Element not in array");
        return -1;
    }
    void display(){
        for(int a: arr){
            System.out.print(a+ " ");
        }
        System.out.println(" ");
    }

    void resize(){
        capacity = 2* capacity;
        int[] newArr = new int[capacity];
        for(int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public static void main(String[] args){
        DynamicArrayImplementation ars = new DynamicArrayImplementation(5);
        ars.insert(0,5);
        ars.insert(1,4);
        ars.insert(2,6);
        ars.insert(3,7);
        ars.insert(4,9);
        ars.insert(5,10);
        ars.display();
        ars.get(0);
        ars.set(2,78);
        ars.search(11);
        ars.search(7);
        ars.delete(1);
        ars.display();
    }
}
