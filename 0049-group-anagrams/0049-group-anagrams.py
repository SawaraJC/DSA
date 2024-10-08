class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list) #map charCount to list of anagrams

        for s in strs:
            count = [0] * 26  #a.......z
            for c in s:
                count[ord(c)-ord('a')] += 1  #using ascii values

            res[tuple(count)].append(s)

        return res.values()

        
        