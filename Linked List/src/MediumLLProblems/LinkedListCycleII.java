package MediumLLProblems;
//https://leetcode.com/problems/linked-list-cycle-ii/
public class LinkedListCycleII {
    public static void main(String[] args) {

    }
    public class Solution {
        public Node detectCycle(Node head) {
            Node slow = head;
            Node fast = head;


            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                    slow = head;
                    while(slow != fast){
                        slow = slow.next;
                        fast = fast.next;
                    }
                    return slow ;
                }
            }
            return null;
        }
    }
}
