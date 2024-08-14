package DLLProblems;
//https://www.geeksforgeeks.org/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list/

public class DeleteAllOccurencesOfKey {
    public static void main(String[] args) {
        int arr[] = {1,5,2,5,3,4,5};
        Node head = createDoublyLinkedList(arr);
        int target = 5;

        deleteAllOccurOfX(head,target);

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
    }

    public static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp = head;

        while (temp!=null){
            if (temp.data == x){
                if (temp == head){
                    head = head.next;
                }

                Node nextNode = temp.next;
                Node prevNode = temp.prev;

                if(nextNode != null) nextNode.prev = prevNode;
                if(prevNode != null) prevNode.next = nextNode;

                temp = nextNode;
            }else{

                temp = temp.next;
            }

        }
        return head;

    }

   public static Node createDoublyLinkedList(int[] arr){
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
