class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Add1stInLL {

    public static void printLL(Node head){
        if (head == null) {
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
