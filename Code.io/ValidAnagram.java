// 242. Valid Anagram
// Solved
// Easy
// Topics
// Companies
// Given two strings s and t, return true if t is an 
// anagram
//  of s, and false otherwise.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false

 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.
 

// Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?







class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];

        for(char c: s.toCharArray()){
            int num = c-'a';
            arr[num]++;
        }

        for(char c: t.toCharArray()){
            int num = c-'a';
            arr[num]--;
        }

    boolean ck = true;

    for(int i=0;i<arr.length;i++){
        if(arr[i] != 0){
        ck = false;
        break;

        } 
            
    }

    if(ck) return true;
    return false;
        
    }
}