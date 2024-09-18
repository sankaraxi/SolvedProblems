package monotonicStack;
//https://leetcode.com/problems/trapping-rain-water/
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
//        int[] arr = {2,1,0,5,3};
//        int[] arr = {1,11,2,10};
        System.out.println(trap(arr));
    }

//    brute
//    public static int trap(int[] height) {
//        int[] prefixMax = prefixMax(height);
//        int[] suffixMax = suffixMax(height);
//
//        int total = 0;
//        for (int i = 0; i < height.length; i++){
//            int leftMax = prefixMax[i];
//            int rightMax = suffixMax[i];
//
//            if (height[i] < leftMax && height[i] < rightMax){
//                total += Math.min(leftMax,rightMax) - height[i];
//            }
//        }
//        return total;
//    }

    public static int trap(int[] height) {

        int leftMax = 0;
        int rightMax = 0;
        int total = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (leftMax > height[left]) {
                    total += leftMax - height[left];
                } else {
                    leftMax = height[left];
                }
                left = left + 1;
            } else {
                if (rightMax > height[right]) {
                    total += rightMax - height[right];
                } else {
                    rightMax = height[right];
                }
                right = right - 1;
            }
        }
        return total;
    }

    public static int[] prefixMax(int[] height){
        int[] prefix = new int[height.length];

        prefix[0] = height[0];

        for (int i = 1; i < height.length; i++){
            prefix[i] = Math.max(prefix[i-1],height[i]);
        }

        return prefix;
    }

    public static int[] suffixMax(int[] height){
        int[] suffix = new int[height.length];

        suffix[height.length-1] = height[height.length-1];

        for (int i = height.length - 2; i >= 0; i--){
            suffix[i] = Math.max(suffix[i+1],height[i]);
        }

        return suffix;
    }
}
