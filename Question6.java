// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.
// Example 1:
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

// Question Link: https://leetcode.com/problems/product-of-array-except-self/description/

public class Question6{
    static int[] solution(int arr[]){
        int n = arr.length;
        int pre[] = new int[n];
        pre[0] = 1;
        for(int i=1; i<n; i++){
            pre[i] = pre[i-1]*arr[i-1];
        }
        int post[] = new int[n];
        post[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            post[i] = post[i+1]*arr[i+1];
        }
        int res[] = new int[n];
        for(int i = 0; i<n; i++){
            res[i] = pre[i]*post[i];
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int ans[] = solution(arr);
        for(int a:ans){
            System.out.print(a +" ");
        }
    }
}