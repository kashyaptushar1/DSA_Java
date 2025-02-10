import java.util.*;

public class Question4 {
    static List<List<String>> solution(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : str) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars); 
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = solution(str);
        System.out.println(ans);
    }
}
