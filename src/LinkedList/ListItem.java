package LinkedList;

public class ListItem {
    private String item;

    public ListItem() {
        this.item = "";
    }

    public ListItem(String item) {
        this.item = item;
    }

    public void printList() {
        System.out.println(this.item);
    }
}
