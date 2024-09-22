package monotonicStack;
//https://leetcode.com/problems/asteroid-collision/
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = {5, 10, -5};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++){


            if (asteroids[i] > 0){
                st.push(asteroids[i]);
            }else{
                while (!st.empty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])){
                    st.pop();
                }

                if(!st.empty() && st.peek() == Math.abs(asteroids[i])) st.pop();
                else if (st.empty() || st.peek() < 0) st.push(asteroids[i]);
            }

        }

        int size = st.size();
        int[] ans = new int[size];

        for (int i = size-1; i >=0 ; i--){
            ans[i] = st.pop();
        }
        return ans;
    } // Time complexity: O(N) + O(N) = O(2N) = O(N)
    // Space complexity: O(N) used for stack and O(N) used for the answer array = O(2N) = O(N)
}
