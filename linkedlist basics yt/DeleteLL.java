class DeleteLL {
    Node head; // Head of the list

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to delete the first node
    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    // Method to delete the last node
    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // Method to delete a node at a specific position (0-based index)
    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position not found.");
            return;
        }

        Node next = temp.next.next;
        temp.next = next;
    }

    // Method to print the linked list
    void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println();
    }

    // Method to insert a new node at the end
    public void append(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
    }

    public static void main(String[] args) {
        DeleteLL list = new DeleteLL();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("Created Linked list is:");
        list.printList();

        list.deleteFirst(); // Delete the first node
        System.out.println("Linked List after Deletion of first node:");
        list.printList();

        list.deleteLast(); // Delete the last node
        System.out.println("Linked List after Deletion of last node:");
        list.printList();

        list.deleteAtPosition(2); // Delete node at position 2 (0-based index)
        System.out.println("Linked List after Deletion at position 2:");
        list.printList();
    }
}
