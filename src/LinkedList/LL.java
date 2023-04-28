package LinkedList;

public class LL {
    Node head;
    class Node
    {
        int data;
        Node next;

       Node(int val)
       {
           data = val;
           next = null;
       }
    }
    public void addFirst(int val)
    {
        Node newNode = new Node(val);
        if(head==null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printList()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args)
    {
        LL list = new LL();
        list.addFirst(50);
        list.printList();
        list.addFirst(40);
        list.printList();
        list.addFirst(30);
        list.printList();
        list.addFirst(20);
        list.printList();
        list.addFirst(10);
        list.printList();
    }
}