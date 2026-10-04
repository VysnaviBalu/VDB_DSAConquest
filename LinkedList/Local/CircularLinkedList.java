package LinkedList.Local;

public class CircularLinkedList <T> {

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

        Node tail;
        int count=0;

        CircularLinkedList(){
            tail = null;
        }
        void insertHead(T data) {
            Node newNode = new Node(data);
            if (tail == null) {
                newNode.next = newNode;
                tail = newNode;
            } else {
                newNode.next = tail.next;
                tail.next = newNode;
            }
            count++;
        }

    void insertTail(T data) {
        Node newNode = new Node(data);
        if (tail == null) {
            newNode.next = newNode;
            tail = newNode;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    void deleteHead(){
            if(listNullCheck()){
                if(tail.next == tail){
                    System.out.println("List has single node:- deleted");
                    singleNodeDelete();
                    return;
                }
                Node temp = tail;
                temp.next = temp.next.next;
                count--;
            } else{
                System.out.println("Delete :- Operation cannot be done, list empty!");
            }
    }

    void deleteTail(){
        if(listNullCheck()){
            if(tail.next == tail){
                System.out.println("List has single node:- deleted");
                singleNodeDelete();
                return;
            }
            Node temp = tail;
            while(temp.next!= tail){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            count--;
        } else{
            System.out.println("Delete :- Operation cannot be done, list empty!");
        }
    }

        void displayList(){
            if(listNullCheck()) {
                System.out.println();
                System.out.println("******* Traversing From Tail *******");
                Node temp = tail;
                if(temp.next == temp){
                    System.out.print("Single Node: "+temp.data );
                    return;
                } else {
                    do {
                        System.out.print(temp.data + " -> ");
                        temp = temp.next;
                    } while (temp != tail);
                    System.out.print(" Points to tail ");
                }
            } else{
                System.out.println("Display :- Operation cannot be done, list empty!");
            }
        }

        Boolean listNullCheck(){
            return tail != null;
        }

        void singleNodeDelete(){
            tail = null;
            count--;
        }
        public static void main(String[] args){
            CircularLinkedList<Integer> list = new CircularLinkedList<>();
            list.insertHead(1);
            list.deleteHead();
            list.displayList();
            list.insertHead(3);
            list.insertTail(0);
            list.insertHead(1);
            list.insertHead(2);
            list.displayList();
            list.deleteHead();
            list.displayList();
            list.deleteTail();
            list.insertTail(4);
            list.insertTail(5);
            list.displayList();
        }
}
