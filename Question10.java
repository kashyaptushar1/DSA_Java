import java.util.Arrays;

public class Question10 {
    static boolean solution(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");
        char ch[] = str.toCharArray();
        int l = 0;
        int r = ch.length - 1;
        while (l < r) {
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        String rev = new String(ch);
        return str.equals(rev);
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean ans = solution(str);
        System.out.println(ans);
    }
}