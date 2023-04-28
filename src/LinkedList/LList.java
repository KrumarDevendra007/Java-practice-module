package LinkedList;


class LList {
     Node head;
     class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    // function for add node in front(Add-first)
     public void addFrist(int val)
     {
         Node new_node = new Node(val);
         if(head==null){
             head = new_node;
             return;
         }
         new_node.next = head;
         head = new_node;
     }
     public void printList()
     {
         //if(head==null) return;
         Node temp = head;
         while(temp != null)
         {
             System.out.print(temp.data + "->");
             temp = temp.next;
         }
         System.out.println("Null");
     }

    public static void main(String[] args)
    {
          LList list = new LList();
          list.addFrist(25);
          list.addFrist(20);
          list.addFrist(15);
          list.printList();

    }
}
