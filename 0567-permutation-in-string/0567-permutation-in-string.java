class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        int left = 0, right = 0;
        int k = s1.length();

        while (right < s2.length()) {

            map2.put(s2.charAt(right),
                    map2.getOrDefault(s2.charAt(right), 0) + 1);

            while (right - left + 1 >= k) {

                if (map1.equals(map2)) {
                    return true;
                }

                map2.put(s2.charAt(left),
                        map2.get(s2.charAt(left)) - 1);

                if (map2.get(s2.charAt(left)) == 0) {
                    map2.remove(s2.charAt(left));
                }

                left++;
            }

            right++;
        }

        return false;
    }
}