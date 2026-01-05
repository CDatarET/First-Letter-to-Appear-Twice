class Solution {
    public char repeatedCharacter(String s) {
        int[] map = new int[26];
        for(int i = 0; i < s.length(); i++){
            if(++map[s.charAt(i) - 'a'] == 2) return(s.charAt(i));
        }

        return(' ');
    }
}
