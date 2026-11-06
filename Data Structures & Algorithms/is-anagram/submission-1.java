class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
       
        //if length of strings not same return false 
       
        if (s.length() != t.length()){
            return false;
        }
        //want to count the number of times each char appears in s 
        for (char y : s.toCharArray()){
            smap.put(y ,smap.getOrDefault(y,0)+1);
        }
        //want to count the number of times each char appears in t
        for (char x: t.toCharArray()){
            tmap.put(x ,tmap.getOrDefault(x,0)+1);
        }
         //if length same check if map count for char for s == count in map of t
         if (smap.equals(tmap)){
            return true;
         }
         return false;

    }
}
