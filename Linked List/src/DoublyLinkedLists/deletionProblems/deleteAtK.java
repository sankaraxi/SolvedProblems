package DoublyLinkedLists.deletionProblems;

public class deleteAtK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = createDoublyLinkedList(arr);

        head = deleteAtK(head , 5);

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
    }

    static Node deleteAtK(Node head ,int k){
        if (head == null || head.next == null){
            return null;
        }
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            if(count == k){
                break;
            }
            temp = temp.next;
        }
        Node tempPrev = temp.prev;
        Node tempNext = temp.next;

        if(tempPrev == null && tempNext == null){
            return null;
        }else if(tempPrev == null){
            head = tempNext;
            tempNext.prev = null;
            temp.next = null;
            return head;
        }else if(tempNext == null){
            Node tail = head;
            while (tail.next != null){
                tail = tail.next; // tail will be at the last node
            }
            tail = tempPrev;
            tail.next = null;
            temp.prev = null;
            return head;
        }

        tempPrev.next = tempNext;
        tempNext.prev = tempPrev;
        temp.next = null;
        temp.prev = null;
        return head;
    }

    static Node createDoublyLinkedList(int[] arr){
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
