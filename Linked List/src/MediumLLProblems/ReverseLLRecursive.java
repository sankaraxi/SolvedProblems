package MediumLLProblems;
//https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseLLRecursive {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = createLinkedList(arr);

        Node newHead = reverseLL(head);
        Node temp = newHead;
        while (temp != null){
            System.out.print(temp.data +"->" );
            temp = temp.next;
        }
    }

    static Node reverseLL(Node head) {
        if (head == null || head.next == null){
            return head;
        }

        Node newHead = reverseLL(head.next);

        Node front = head.next;

        front.next = head;
        head.next = null;

        return newHead;
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

