package Queue.Local;

public class CircularQueueImplementation {
    int size;
    int[] queue;
    int front = -1;
    int rear = -1;
    CircularQueueImplementation(){
        size = 10;
        queue = new int[size];
    }

    boolean isEmpty(){ return front == -1;}
    boolean isFull(){
        return (rear +1 )% size == front;}

    void insertLast_Queued(int data){
        if( isFull()){
            System.out.println("Quest Insert: The queue is full");
            return;
        }

        if(isEmpty()){
            front = 0;
        }
        rear = (rear +1) % size;
        queue[rear] =data;
        System.out.println("Queue Insert: "+data+ " is insert at index "+rear);
    }

    int deleteFirst_Dequeue(){
        if(isEmpty()){
            System.out.println("Queue Delete: No value in empty queue to delete");
            return -1;
        }
        int deletedValue = queue[front];
        System.out.println("Queue Delete: "+ queue[front]+ " is deleted");
        if(front == rear){
           front = -1;
           rear = -1;
        } else{
            front = (front + 1) %size;
        }
        return deletedValue;
    }

    int displayFirst_Peek(){
        if(isEmpty()){
            System.out.println("Peek First: No value to peek in empty queue");
            return -1;
        }
        return queue[front];
    }

    void viewFullQueue(){
        System.out.println("View all active values in the queue");
        if(isEmpty()){
            System.out.println("[Empty Queue]");
            return;
        }
        int temp = front;
        while(true){
            System.out.print(queue[temp]);
            if(temp== rear) break;
            temp = (temp +1)%size;
        }
        System.out.println();
        System.out.println("**********");
    }

    public static void main(String[] args){
        CircularQueueImplementation queue = new CircularQueueImplementation();
        System.out.println("Is the queue empty: "+queue.isEmpty());
        queue.deleteFirst_Dequeue();
        queue.insertLast_Queued(1);
        queue.insertLast_Queued(2);
        queue.insertLast_Queued(3);
        System.out.println("The First value in the queue: "+queue.displayFirst_Peek());
        queue.insertLast_Queued(4);
        queue.deleteFirst_Dequeue();
        queue.insertLast_Queued(5);
        System.out.println("The First value in the queue: "+queue.displayFirst_Peek());
        System.out.println("Is the queue empty: "+queue.isEmpty());
        queue.viewFullQueue();
        queue.displayFirst_Peek();
        queue.insertLast_Queued(6);
        queue.insertLast_Queued(7);
        queue.insertLast_Queued(8);
        queue.insertLast_Queued(9);
        queue.insertLast_Queued(10);
        queue.viewFullQueue();
        queue.insertLast_Queued(11);
        queue.insertLast_Queued(12);
        queue.deleteFirst_Dequeue();
        queue.viewFullQueue();
    }
}
