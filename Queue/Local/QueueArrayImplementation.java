package Queue.Local;

public class QueueArrayImplementation {
    int size;
    int[] queue;
    int top = -1;

    QueueArrayImplementation(){
        size = 10;
        queue = new int[size];
    }

    boolean isEmpty() {
        if(top == -1){
            return true;
        }
        return false;
    }

    void insertLast_push(int data){
        try{
            queue[++top] = data;
            System.out.println("The insert Value: " +queue[top]+ " is inserted in the queue");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The queue is full: "+e.getMessage());
            --top;
        }
    }

    int deleteFirst_pop(){
        if(!isEmpty()){
            int deletedValue = queue[0];
            System.out.println("Queue Delete: " +deletedValue+ " is removed from the queue");
            for(int i = 0; i < queue.length-1; i++){
                queue[i] = queue[i+1];
            }
            queue[top]=0;
            --top;
            return deletedValue;
        }else {
            System.out.println("Queue Delete: No data to remove from empty Array");
            return -1;
        }
    }
    int displayFirst_Peek(){
        if(!isEmpty()){
            return queue[0];
        }else{
            System.out.println("Queue Peek: No data to view from empty Array");
            return -1;
        }
    }

    void viewFullQueue(){
        System.out.println("View full queue:= ");
        if(isEmpty()){
            System.out.println("[ Empty Queue ]");
            return;
        }
        for(int i = 0; i <= top; i ++){
            System.out.print(queue[i]);
        }
        System.out.println();
        System.out.println("********************");
    }

    public static void main(String[] args){
        QueueArrayImplementation queue = new QueueArrayImplementation();
        System.out.println("Is the queue empty: "+queue.isEmpty());
        queue.deleteFirst_pop();
        queue.insertLast_push(1);
        queue.insertLast_push(2);
        queue.insertLast_push(3);
        System.out.println("The First value in the queue: "+queue.displayFirst_Peek());
        queue.insertLast_push(4);
        queue.deleteFirst_pop();
        queue.insertLast_push(5);
        System.out.println("The First value in the queue: "+queue.displayFirst_Peek());
        System.out.println("Is the queue empty: "+queue.isEmpty());
        queue.viewFullQueue();
        queue.displayFirst_Peek();
        queue.insertLast_push(6);
        queue.insertLast_push(7);
        queue.insertLast_push(8);
        queue.insertLast_push(9);
        queue.insertLast_push(10);
        queue.viewFullQueue();
        queue.insertLast_push(11);
        queue.insertLast_push(12);
        queue.deleteFirst_pop();
        queue.viewFullQueue();

    }
}
