package MediumLLProblems;
//https://www.geeksforgeeks.org/problems/find-length-of-loop/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-length-of-loop
public class LengthOfCycleLL {
    public static void main(String[] args) {


    }
    class Solution {
        // Function to find the length of a loop in the linked list.
        public int countNodesinLoop(Node head) {
            // Add your code here.
            Node slow = head;
            Node fast = head;
            int count = 0;
            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast){
                    return findLength(slow,fast);
                }

            }
            return 0;
        }

        public int findLength (Node slow, Node fast){
            slow = slow.next;
            int count = 1;;
            while(slow != fast){
                count++;
                slow = slow.next;
            }
            return count;
        }
    }
}
