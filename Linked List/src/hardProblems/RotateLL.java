package hardProblems;
//https://leetcode.com/problems/rotate-list/description/
public class RotateLL {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = createLinkedList(arr);

        head = rotateLL(head , 2);

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    static Node rotateLL(Node head, int n){
        Node newHead = head;

        Node tempPrev = head;
        for (int i = 0; i < n; i++) {


            while(tempPrev.next.next != null){
                tempPrev = tempPrev.next;
            }

            Node RotateNode = tempPrev.next;

            RotateNode.next = newHead;

            newHead = RotateNode;

            tempPrev.next = null;
        }
        return newHead;
    }
    static Node createLinkedList(int[] arr){
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
