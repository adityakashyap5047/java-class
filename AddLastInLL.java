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

    public static Node addLastInLL(Node head, int data){

        Node newNode = new Node(data);
        Node temp = head;

        if (temp == null) {
            return newNode;
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);

        printLL(head);
        head = addLastInLL(head, 20);
        printLL(head);

        Node temp = null;
        printLL(temp);
        temp = addLastInLL(temp, 2);
        temp = addLastInLL(temp, 4);
        temp = addLastInLL(temp, 6);
        temp = addLastInLL(temp, 8);
        printLL(temp);
    }
}