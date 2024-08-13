package MediumLLProblems;
//https://leetcode.com/problems/sort-list/
public class SortALinkedList {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        Node head = createLinkedList(arr);
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data +"->" );
            temp = temp.next;
        }
        System.out.println();
        Node result = sortList(head);
        while (result != null){
            System.out.print(result.data +"->" );
            result = result.next;
        }
    }

    public static Node createLinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node sortList(Node head) {
        if (head == null || head.next == null){
            return head;
        }

        Node middle = findMiddle(head);

        Node leftNode = head;
        Node rightNode = middle.next;

        middle.next = null;

        leftNode = sortList(leftNode);
        rightNode = sortList(rightNode);

        return mergeLL(leftNode, rightNode);
    }

    public static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head.next; // to return M1 (middle element)

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node mergeLL(Node leftHead, Node rightHead){
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        while (leftHead != null && rightHead != null){
            if(leftHead.data <= rightHead.data){
                temp.next = leftHead;
                leftHead = leftHead.next;
            }else{
                temp.next = rightHead;
                rightHead = rightHead.next;
            }
            temp = temp.next;
        }

        if (leftHead != null){
            temp.next = leftHead;
        } else {
            temp.next = rightHead;
        }

        return dummyNode.next;
    }
}
