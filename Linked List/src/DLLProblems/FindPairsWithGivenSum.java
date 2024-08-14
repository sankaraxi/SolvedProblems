package DLLProblems;
//https://www.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-pairs-with-given-sum-in-doubly-linked-list
import java.util.ArrayList;

public class FindPairsWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = createDoublyLinkedList(arr);
        int target = 5;

        System.out.println(findPairsWithGivenSum(target,head));

//        Node temp = head;
//
//        while (temp != null){
//            System.out.print(temp.data + "<->");
//            temp = temp.next;
//        }
    }

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        Node leftNode = head;
        Node rightNode = findTail(head);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        while (leftNode.data < rightNode.data){
            ArrayList<Integer> pairs = new ArrayList<>();
            if (leftNode.data + rightNode.data == target){
                pairs.add(leftNode.data);
                pairs.add(rightNode.data);
                ans.add(pairs);

                leftNode = leftNode.next;
                rightNode = rightNode.prev;
            }else
            if (leftNode.data + rightNode.data < target){
                leftNode = leftNode.next;
            }else{
                rightNode = rightNode.prev;
            }
        }
        return ans;
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
