class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
         char maxChar = ' ';
        int maxCount = 0;

        for (char ch : map.keySet()) {
            if (map.get(ch) > maxCount) {
                maxCount = map.get(ch);
                maxChar = ch;
            }
        }
        return maxCount + k ; 
    }
}
