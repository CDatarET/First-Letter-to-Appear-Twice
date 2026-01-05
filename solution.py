class Solution:
    def repeatedCharacter(self, s):
        d = {}
        for c in s:
            if c in d: return c
            else: d[c] = 1
