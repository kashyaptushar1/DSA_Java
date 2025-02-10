// Given two strings s and t, return true if t is an 
// anagram
//  of s, and false otherwise.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Question2 Link:https://leetcode.com/problems/valid-anagram/description/

import java.util.Arrays;

public class Question2{
    static boolean solution(String s, String t){
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean ans = solution(s,t);
        System.out.println(ans);
    }
}