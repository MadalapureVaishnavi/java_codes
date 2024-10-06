import java.util.Scanner;

public class Insert_Single_LL {
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
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                System.out.println(
                        "Enter 1 to insert the item at the beginning,2 to insert the item at the end,3 to insert item at particular location");
                m = sc.nextInt();
                switch (m) {
                    // at the beginning of linkedlist
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;
                    // at the end of linkedlist
                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;
                    // at specified location
                    case 3:
                        System.out.println("enter the position of node to be inserted");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
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
