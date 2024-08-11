package MediumLLProblems;

public class MiddleNodeOfLL {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = createLinkedList(arr);

        Node middle = middleNode(head);
        Node temp = middle;
        while (temp != null){
            System.out.print(temp.data +"->" );
            temp = temp.next;
        }
    }

    static Node middleNode(Node head) {

        if (head == null || head.next == null){
            return head;
        }
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
