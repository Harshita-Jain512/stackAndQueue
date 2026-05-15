import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class sliding_Window_Maximum {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // List to store answers
        ArrayList<Integer> arr = new ArrayList<>();

        // Deque stores indices
        Deque<Integer> dq = new LinkedList<>();

        // Traverse array
        for (int i = 0; i < nums.length; i++) {

            // Remove indices out of current window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from back
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);

            // Store answer when first window is formed
            if (i >= k - 1) {
                arr.add(nums[dq.peekFirst()]);
            }
        }

        // Convert ArrayList to int[]
        int[] result = new int[arr.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = arr.get(i);
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {

        sliding_Window_Maximum obj = new sliding_Window_Maximum();

        int[] nums = {4, 0, -1, 3, 5, 3, 6, 8};

        int k = 3;

        int[] ans = obj.maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(ans));
    }
}
