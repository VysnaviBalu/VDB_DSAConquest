package Stack.Local;

public class StackArrayImplementation {
    int size;
    int[] stack;
    int top =-1;

    StackArrayImplementation(){
        size = 10;
        stack = new int[size];
    }

    void insertLast_push(int data){
        try{
            stack[++top] = data;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stack Overflow: Cannot push " + data + ". Stack is full."); //
            --top;
            return;
        }

    }

    int deleteLast_pop(){
        if (nullCheck_isEmpty()){
            System.out.println("Stack Underflow: No data to remove from empty Array");
            return -1;
        }
        return stack[top--];
    }

    int displayLast_peek(){
        if (nullCheck_isEmpty()){
            System.out.println("Peek: No data to view from empty Array");
            return -1;
        }
        return stack[top];
    }

    boolean nullCheck_isEmpty(){
        if(top == -1){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        StackArrayImplementation stack = new StackArrayImplementation();
        System.out.println("Is the array empty: " +stack.nullCheck_isEmpty());
        stack.deleteLast_pop();
        stack.displayLast_peek();
        stack.insertLast_push(1);
        stack.insertLast_push(2);
        stack.insertLast_push(3);
        stack.insertLast_push(4);
        stack.insertLast_push(5);
        stack.insertLast_push(6);
        System.out.println("The top is: " +stack.displayLast_peek());
        stack.deleteLast_pop();
        System.out.println("The top is: " +stack.displayLast_peek());
        stack.insertLast_push(7);
        stack.insertLast_push(8);
        stack.insertLast_push(9);
        stack.insertLast_push(10);
        stack.insertLast_push(11);
        stack.insertLast_push(12);
        System.out.println("The top is: " +stack.displayLast_peek());
        System.out.println("Is the array empty: " +stack.nullCheck_isEmpty());
    }

}
