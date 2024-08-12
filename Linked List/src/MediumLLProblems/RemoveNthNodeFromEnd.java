package MediumLLProblems;
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = createLinkedList(arr);

        Node newHead = removeNthFromEnd(head, 2);
        Node temp = newHead;
        while (temp != null){
            System.out.print(temp.data +"->" );
            temp = temp.next;
        }


    }

    public static Node removeNthFromEnd(Node head, int n) {
        Node fast = head;

        for (int i = 0; i < n; i++){
            fast = fast.next;
        }

        Node slow = head;

        if (fast == null) return head.next; // in case of head to be deleted
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }



        slow.next = slow.next.next;
        return head;
    }

    private static Node createLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
