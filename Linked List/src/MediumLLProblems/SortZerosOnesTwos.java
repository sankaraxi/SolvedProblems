package MediumLLProblems;
//https://www.naukri.com/code360/problems/sort-linked-list-of-0s-1s-2s_1071937?count=25&search=&sort_entity=order&sort_order=ASC&leftPanelTabValue=PROBLEM&page=1
public class SortZerosOnesTwos {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,0,1,2};
        Node head = convertArrayToLinkedList(arr);
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data +"->" );
            temp = temp.next;
        }
        System.out.println();
        head = sortList(head);
        temp = head;
        while (temp != null){
            System.out.print(temp.data +"->" );
            temp = temp.next;
        }
    }

    public static Node sortList(Node head) {
        // Write your code here

        if (head == null || head.next == null) return head;

        Node zeroHead = new Node(-1);
        Node zeroEnd = zeroHead;

        Node oneHead = new Node(-1);
        Node oneEnd = oneHead;

        Node twoHead = new Node(-1);
        Node twoEnd = twoHead;


        Node temp = head;
        while(temp != null){
            if(temp.data == 0){
                zeroEnd.next = temp;
                zeroEnd = zeroEnd.next;
            }else if(temp.data == 1){
                oneEnd.next = temp;
                oneEnd = oneEnd.next;
            }else{
                twoEnd.next = temp;
                twoEnd = twoEnd.next;
            }
            temp = temp.next;
        }

        zeroEnd.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        oneEnd.next = twoHead.next;
        twoEnd.next = null;
        return zeroHead.next;
    }

    public static Node convertArrayToLinkedList(int[] arr){
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
