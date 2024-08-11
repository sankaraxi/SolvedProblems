package MediumLLProblems;
//https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseLLIterative {
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
        Node temp = head;
        Node tempPrev = null;

        while (temp != null){
            Node tempNext = temp.next;
            temp.next = tempPrev;
            tempPrev = temp;
            temp = tempNext;
        }
        return tempPrev;
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

