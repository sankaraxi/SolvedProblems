package MediumLLProblems;
//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
public class DeleteMiddleNodeOfLL {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = createLinkedList(arr);

        Node newHead = deleteMiddleNode(head);
        Node temp = newHead;
        while (temp != null){
            System.out.print(temp.data +"->" );
            temp = temp.next;
        }
    }

    static Node deleteMiddleNode(Node head) {

        if (head == null || head.next == null){
            return null;
        }

        Node slow = head;
        Node fast = head;

        fast = fast.next.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
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
