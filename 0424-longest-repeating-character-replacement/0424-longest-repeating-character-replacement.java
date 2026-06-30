class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0, right = 0;
        int maxFreq = 0;
        int ans = 0;

        while (right < s.length()) {

            map.put(s.charAt(right),
                    map.getOrDefault(s.charAt(right), 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));

            if ((right - left + 1) - maxFreq <= k) {
                ans = Math.max(ans, right - left + 1);
            } else {

                map.put(s.charAt(left),
                        map.get(s.charAt(left)) - 1);

                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }

                left++;
            }

            right++;
        }

        return ans;
    }
}