package Stack.Local;

public class StackNode <T>{
    T data;
    StackNode next;

    StackNode(T data){
        this.data = data;
        this.next = null;
    }
}
