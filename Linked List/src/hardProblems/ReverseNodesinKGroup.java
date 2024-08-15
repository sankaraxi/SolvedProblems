package hardProblems;

public class ReverseNodesinKGroup {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        Node head = createLinkedList(arr);

        head = reverseKGroup(head , 3);

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static Node reverseKGroup(Node head, int k) {
        Node temp = head;
        Node prevNode = null;

        while(temp != null){
            Node kthNode = findKthNode(temp,k);

            if(kthNode == null){
                if(prevNode != null) prevNode.next = temp;
                break;
            }

            Node nextNode = kthNode.next;
            kthNode.next = null;
            reverseLL(temp);

            if (temp == head){
                head = kthNode;
            }else{
                prevNode.next = kthNode;
            }

            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }

    public static Node findKthNode(Node temp, int k){
        k-=1;
        while (temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }

    public static Node reverseLL(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node newHead = reverseLL(head.next);

        Node front = head.next;
        front.next = head;

        head.next = null;

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
