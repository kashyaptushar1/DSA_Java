import java.util.*;
public class Question9{
      public static int solution(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int longestStreak = 0;
        for (int num : numSet) {
            // Only start a sequence if 'num' is the first number.
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                
                // Count consecutive numbers.
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
    }
    public static void main(String[] args){
        int arr[] = {100,4,200,1,3,2};
        int ans = solution(arr);
        System.out.print(ans);
    }
}