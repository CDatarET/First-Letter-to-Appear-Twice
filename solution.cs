public class Solution {
    public char RepeatedCharacter(string s) {
        int[] map = new int[26];
        for(int i = 0; i < s.Length; i++){
            if(++map[s[i] - 'a'] == 2) return(s[i]);
        }

        return(' ');
    }
}
