package DoublyLinkedLists.deletionProblems;

public class deleteTail {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = createDoublyLinkedList(arr);

        head = deleteTail(head);

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
    }

    static Node deleteTail(Node head){
        if (head == null || head.next == null){
            return null;
        }
        Node tail = head;

        while (tail.next != null){
            tail = tail.next; // tail will be at the last node
        }
        Node newTail = tail.prev;
        tail.prev = null;
        newTail.next = null;
        return head;
    }

    static Node createDoublyLinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = prev.next;
        }
        return  head;
    }

}
