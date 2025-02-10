// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Question Link: https://leetcode.com/problems/contains-duplicate/description/

import java.util.*;
public class Question1{
    static boolean solution(int arr[]){
        HashSet<Integer> st = new HashSet<>();
        boolean ans = false;
        for(int i = 0; i<arr.length; i++){
            if(st.contains(arr[i])){
                ans = true;
            }
            st.add(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        boolean ans = solution(arr);
        System.out.print(ans);
    }
} 