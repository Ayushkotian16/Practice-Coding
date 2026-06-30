class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];

        int left = 0, right = 0, idx = 0;

        while (right < nums.length) {

            while (!dq.isEmpty() && nums[right] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }

            dq.offerLast(right);

            if (dq.peekFirst() <= right - k) {
                dq.pollFirst();
            }

            if (right >= k - 1) {
                ans[idx++] = nums[dq.peekFirst()];
            }

            right++;
        }

        return ans;
    }
}