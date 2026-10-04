package LinkedList.Local;

public class PolyLinkedList {

    PolyNode head = null;

    void insertHead(int coeff, int expo){
        PolyNode newNode = new PolyNode(coeff, expo);
        newNode.next = head;
        head = newNode;
    }

    void insertLast(int coeff, int expo){
        if(head == null){
            insertHead(coeff, expo);
            return;
        }
        PolyNode temp = head;
        PolyNode newNode = new PolyNode(coeff, expo);
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display(){
        System.out.println("******* Linked List *******");
        PolyNode temp = head;
        while(temp.next != null){
            System.out.print(temp.coeff+"x^"+temp.expo+" + ");
            temp = temp.next;
        }
        System.out.print(temp.coeff+"x^"+temp.expo);
        System.out.println();
    }
}
