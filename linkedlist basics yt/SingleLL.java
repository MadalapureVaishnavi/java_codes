import java.util.Scanner;

public class SingleLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do you wanted to continue? If yes,press:1");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traversal() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            while (temp != null) {
                System.out.println("Above Linked List element" + temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        SingleLL obj1 = new SingleLL();
        obj1.creation();
        obj1.traversal();
    }
}