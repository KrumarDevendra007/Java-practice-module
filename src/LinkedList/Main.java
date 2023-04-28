package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        lnk.head = new Node(1);
//        Node n2 = new Node(2);
//        Node n3 = new Node(3);
//        Node n4 = new Node(4);
        list.head = new Node(10);
        list.printList();

        list.addFirst(50);
        list.printList();
        list.addFirst(40);
        list.printList();
        list.addFirst(30);
        list.printList();
        list.addFirst(20);
        list.printList();
        //list.addFirst(10);
        list.addLast(60);
        list.printList();

    }

}
