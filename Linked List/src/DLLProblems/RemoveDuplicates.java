package DLLProblems;
//https://www.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-pairs-with-given-sum-in-doubly-linked-list
import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,3,3,4};
        Node head = createDoublyLinkedList(arr);
        int target = 5;

//        System.out.println(findPairsWithGivenSum(target,head));
        removeDuplicates(head);

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
    }

   static Node removeDuplicates(Node head){
        // Code Here.

        Node temp = head;

        while(temp != null && temp.next != null){
            Node nextNode = temp.next;

            while (nextNode != null && nextNode.data == temp.data){
                nextNode = nextNode.next;
            }

            temp.next = nextNode;

            if (nextNode != null) nextNode.prev = temp;

            temp = temp.next;
        }

        return head;

    }

    public static Node findTail(Node head){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        return temp;
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
