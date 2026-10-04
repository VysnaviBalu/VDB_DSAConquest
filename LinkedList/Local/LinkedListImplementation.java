package LinkedList.Local;

public class LinkedListImplementation {
    Node head = null;
    int count;

    void insertHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        count++;
        System.out.println("Insert Head:- "+data+ " inserted in LinkedList");
        System.out.println(" ***************************");
    }

    void insertTail(int data){
        if(head == null){
            insertHead(data);
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = newNode;
        count++;
        System.out.println("Insert Tail:- "+data+ " inserted in LinkedList");
        System.out.println(" ***************************");
    }

    void insertAt(int index, int data){
        if(index <0){
            System.out.println("Invalid Insert:- Negative index");
            System.out.println(" ***************************");
            return;
        }
        if(index > count){
            System.out.println("Invalid Insert:- Index greater than list");
            System.out.println(" ***************************");
            return;
        }
        if(head == null || index ==0){
            insertHead(data);
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        for(int i = 0; i < index -1 ; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        count++;
        System.out.println("Insert Middle:- "+data+ " inserted in LinkedList at "+index);
        System.out.println(" ***************************");
    }

    void deleteHead(){
       if(listNullCheck()){
           System.out.println("Delete Head: "+head.data+ " deleted");
           head = head.next;
           count--;
       } else{
           System.out.println("Delete Head:- Operation cannot be done, list empty!");
       }
        System.out.println(" ***************************");
    }

    void deleteTail(){
        if(listNullCheck()) {
            Node temp = head;
            if (temp.next != null) {
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                System.out.println("Delete Tail: " + temp.next.data + " deleted");
                temp.next = null;
                count--;
            } else{
                deleteHead();
                return;
            }
        }else{
            System.out.println("Delete Tail:- Operation cannot be done, list empty!");
        }
        System.out.println(" ***************************");
    }

    void deleteValue(int data){
        if(listNullCheck()){
           if(head.data == data){
               head = head.next;
               count--;
               return;
           }
           Node temp = head;
           while(temp.next!= null && temp.next.data != data){
               temp = temp.next;
           }
           if(temp.next == null){
               System.out.println("Delete Invalid:- "+data+" is not in the the list");
               return;
           }
            System.out.println("Delete:- "+data+" is deleted from the list");
            temp.next = temp.next.next;
            count--;
        } else{
            System.out.println("Delete :- Operation cannot be done, list empty!");
        }
        System.out.println(" ***************************");
    }

    void deleteElement(int index){
        if(listNullCheck()){
            if(index < 0){
                System.out.println("Invalid Delete :- Negative index");
                System.out.println(" ***************************");
                return;
            } else if(index >= count){
                System.out.println("Invalid Delete:- Index greater than the list");
                System.out.println(" ***************************");
                return;
            } else if(index == 0){
                deleteHead();
                return;
            }
            Node temp = head;
            for(int i=0;i< index -1; i++){
                temp = temp.next;
            }
            System.out.println("Delete Element: "+temp.next.data+ " at index: "+index+ " is deleted");
            temp.next = temp.next.next;
            count--;
        } else{
            System.out.println("Delete :- Operation cannot be done, list empty!");
        }
        System.out.println(" ***************************");
    }

    void displayList(){
        if(listNullCheck()) {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print(temp.data + " -> ");
            System.out.println("null");
        } else{
            System.out.println("Display :- Operation cannot be done, list empty!");
        }
        System.out.println(" ***************************");
    }
    void searchList(int data){
        if(listNullCheck()) {
            Node temp = head;
            while (temp.next != null) {
                if (temp.data == data) {
                    System.out.println(data + " is present in the list");
                    return;
                }
                temp = temp.next;
            }
            if(temp.data == data){
                System.out.println(data + " is present in the list");
                return;
            }
            System.out.println(data + " is not present in the list");
        } else{
            System.out.println("Search Data:- " +data+ " - Operation cannot be done, list empty!");
        }
        System.out.println(" ***************************");
    }

    void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current!= null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        System.out.println("Reversed Linked List");
    }

    boolean listNullCheck(){
        return head != null;
    }
    public static void main(String[] args){
        LinkedListImplementation list = new LinkedListImplementation();
        System.out.println(" ************** Started *************");
        list.searchList(5);
        list.deleteHead();
        list.deleteTail();
        list.insertTail(10);
        list.insertHead(1);
        list.insertTail(2);
        list.insertTail(4);
        list.insertAt(1,5);
        list.insertAt(6,6);
        list.searchList(6);
        list.displayList();
        list.insertHead(9);
        list.insertTail(7);
        list.insertTail(8);
        list.insertHead(11);
        list.insertAt(6,6);
        list.insertAt(3,3);
        list.displayList();
        list.searchList(2);
        list.searchList(6);
        list.displayList();
        list.deleteHead();
        list.deleteTail();
        list.deleteValue(2);
        list.deleteElement(2);
        list.insertAt(0,0);
        System.out.println("Number of elements in the list "+list.count);
        list.deleteElement(list.count);
        list.displayList();
        list.deleteElement(0);
        list.searchList(7);
        list.searchList(8);
        list.displayList();
        list.reverse();
        list.displayList();
    }
}
