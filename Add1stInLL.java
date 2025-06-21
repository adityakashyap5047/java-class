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

    public static Node add1st(Node head, int data){

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }
        else{
            newNode.next = head;
            return newNode;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);

        printLL(head);
        printLL(add1st(head, 0));

        Node temp = null;
        temp = add1st(temp, 10);
        temp = add1st(temp, 15);
        temp = add1st(temp, 20);
        temp = add1st(temp, 30);
        temp = add1st(temp, 40);

        printLL(temp);
    }

}
