package Queue.Local;

public class QueueLinkedListImplementation {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        Node front, rear;

    QueueLinkedListImplementation(){
        front = null;
        rear = null;
    }

        boolean isEmpty() { return front==null;}

        void insertTail_Enqueue(int data){
            Node newNode = new Node(data);
            if( front == null){
                front = newNode;
                rear = newNode;
                System.out.println("The inserted Value: "+front.data);
                return;
            }
            rear.next = newNode;
            rear = newNode;
            System.out.println("The inserted Value: "+rear.data);
        }

        int deleteHead_Dequeue(){
            if(!isEmpty()){
                int deletedValue = front.data;
                if(front == rear){
                    System.out.println("Delete Queue: Single value in queue and deleted "+deletedValue);
                    front = null;
                    rear = null;
                    return deletedValue;
                }
                front = front.next;
                System.out.println("Delete Queue: First value deleted "+deletedValue);
                return deletedValue;
            } else {
                System.out.println("Delete Queue: No values to delete in empty queue");
                return -1;
            }
        }

        void displayFirst_Peek(){
            if(!isEmpty()){
                System.out.println("Peek Queue: The First Value is "+front.data);
            } else {
                System.out.println("Peek Queue: No values to view in empty queue");
            }
        }


        public static void main(String[] args){
            QueueLinkedListImplementation queue = new QueueLinkedListImplementation();
            queue.isEmpty();
            queue.displayFirst_Peek();
            queue.deleteHead_Dequeue();
            queue.insertTail_Enqueue(1);
            queue.insertTail_Enqueue(2);
            queue.insertTail_Enqueue(3);
            queue.insertTail_Enqueue(4);
            queue.insertTail_Enqueue(5);
            queue.insertTail_Enqueue(6);
            queue.isEmpty();
            queue.displayFirst_Peek();
            queue.deleteHead_Dequeue();
            queue.displayFirst_Peek();
            queue.deleteHead_Dequeue();
            queue.displayFirst_Peek();
            queue.deleteHead_Dequeue();
            queue.isEmpty();
        }
}
