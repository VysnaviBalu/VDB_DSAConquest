package LinkedList.Local;

public class PolyAddLinkedList {

    static PolyLinkedList p;

    static void polyAddition(PolyNode p1, PolyNode p2){
        p = new PolyLinkedList();
        while(p1 != null &&  p2 != null){
            if(p1.expo == p2.expo){
                p.insertLast(p1.coeff + p2.coeff, p1.expo);
                p1 = p1.next;
                p2 = p2.next;
            } else if (p1.expo > p2.expo){
                p.insertLast(p1.coeff,p1.expo);
                p1 = p1.next;
            } else if (p2.expo > p1.expo){
                p.insertLast(p2.coeff, p2.expo);
                p2 = p2.next;
            }
        }
        while (p1 != null){
            p.insertLast(p1.coeff, p1.expo);
            p1 = p1.next;
        }
        while (p2 != null){
            p.insertLast(p2.coeff, p2.expo);
            p2 = p2.next;
        }
    }

    public static void main(String[] args){
        PolyLinkedList p1 = new PolyLinkedList(); // 4x2 + 5x + 2
        PolyLinkedList p2 = new PolyLinkedList(); // 5x3 + 3x2 + 2x + 1

        p1.insertLast(4,2);
        p1.insertLast(5,1);
        p1.insertLast(2,0);
        p1.display();

        p2.insertLast(5,3);
        p2.insertLast(3,2);
        p2.insertLast(2,1);
        p2.insertLast(1,0);
        p2.display();

        polyAddition(p1.head, p2.head);
        p.display();
    }

}
