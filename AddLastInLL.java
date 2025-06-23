class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class AddLastInLL {
    
    public static void printLL(Node head){
        if (head == null) {
            System.out.println("Linked List is Empty!!!");
            return;
        }

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);

        printLL(head);

    }
}
