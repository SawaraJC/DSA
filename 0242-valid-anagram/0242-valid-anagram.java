class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> sMap = freqMap(s);
        HashMap<Character, Integer> tMap = freqMap(t);

        return sMap.equals(tMap);
    }

    public HashMap<Character, Integer> freqMap(String s){
        HashMap<Character, Integer> hmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hmap.merge(ch, 1, Integer::sum);
        }

        return hmap;
    }
}