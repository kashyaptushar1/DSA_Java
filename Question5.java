import java.util.*;

public class Question5 {
    static int[] solution(int[] arr, int k) {
        int n = arr.length;
        // Step 1: Build the frequency map
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Create buckets where index represents frequency
        // The maximum frequency possible is n, so we need n + 1 buckets.
        List<Integer>[] buckets = new ArrayList[n + 1];
        for (int num : map.keySet()) {
            int count = map.get(num);  // Get frequency for num
            if (buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(num);
        }
        
        // Step 3: Collect the top k frequent elements
        int[] res = new int[k];
        int j = 0;
        for (int i = buckets.length - 1; i >= 0 && j < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    res[j] = num;
                    j++;
                    if (j == k) break;
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] ans = solution(arr, k);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
