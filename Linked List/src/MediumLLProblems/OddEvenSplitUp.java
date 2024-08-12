package MediumLLProblems;
//https://leetcode.com/problems/odd-even-linked-list/
public class OddEvenSplitUp {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = createLinkedList(arr);
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data +"->" );
            temp = temp.next;
        }
        System.out.println();
        Node result = oddEvenList(head);
        while (result != null){
            System.out.print(result.data +"->" );
            result = result.next;
        }
    }

    public static Node oddEvenList(Node head) {
        if (head == null || head.next == null) return head;
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        while (even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
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
