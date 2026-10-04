package Stack.Local;

public class StackLinkedListImplementation<T> {
    StackNode top = null;

    void insertHead_Push(int data){
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Insert Top:- "+data+ " inserted in Stack");
        System.out.println(" ***************************");
    }

    void deleteHead_pop(){
        if(!isEmpty()){
            System.out.println("Delete Top:- "+top.data+ " deleted from Stack");
            top = top.next;
            return;
        } else{
            System.out.println("Delete Top:- Operation cannot be done, Stack empty!");
        }
        System.out.println(" ***************************");
    }

    void displayTop_Peek(){
        if(!isEmpty()){
            System.out.println(("Peek Top: "+top.data+ " is the latest"));
        } else{
            System.out.println("Peek Top:- Operation cannot be done, Stack empty!");
        }
        System.out.println(" ***************************");
    }

    boolean isEmpty(){ return top == null;}

    public static void main(String[] args){
            StackLinkedListImplementation<Integer> stack = new StackLinkedListImplementation();
            System.out.println("Is the Stack Empty: " +stack.isEmpty());
            stack.deleteHead_pop();
            stack.displayTop_Peek();
            stack.insertHead_Push(1);
            stack.insertHead_Push(3);
            stack.displayTop_Peek();
            stack.insertHead_Push(5);
            stack.displayTop_Peek();
            stack.deleteHead_pop();
            System.out.println("Is the Stack Empty: " +stack.isEmpty());
    }
}
