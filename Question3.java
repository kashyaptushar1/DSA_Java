// Question Link: https://leetcode.com/problems/two-sum/description/

import java.util.*;
public class Question3{
    // First type of question only check 
    static boolean solution(int arr[] , int t){
        int n = arr.length;
        boolean ans = false;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] + arr[j] == t){
                    ans = true;
                }
            }
        }
        return ans;
    }
    // Second type of this question , where we return array index.
    static int[] solution2(int arr[] , int t){
        int ans[] = new int[2];
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int sum = arr[l] + arr[r];
            if(sum == t){
                ans[0] = l;
                ans[1] = r;
                return ans;
             }
             else if(sum < t){
                l++ ;
             }else{
                r-- ;
             }

        }

        return ans;
    }
    static int[] solution3(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
    public static void main(String[] args){
        int arr[] = {2,5,4,8,9};
        int t = 9;
        int ans[] = solution3(arr, t);

        for(int val : ans){
            System.out.println(val +" ");
        }

    }
}