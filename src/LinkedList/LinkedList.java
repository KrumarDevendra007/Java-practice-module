package LinkedList;

class LinkedList {
    Node head;

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
    public void addLast(int vlu)
    {
        Node newNode = new Node(vlu);
        if(head==null)
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
