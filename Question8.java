import java.util.Scanner;

public class Question8 {

    static String coded(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coded character: ");
        char ch = sc.next().charAt(0);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            s.append(str.charAt(i));
            s.append(ch);
        }
        sc.close();
        return s.toString();
    }
    static String decoded(String encodedStr) {
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < encodedStr.length(); i += 2) {
            decoded.append(encodedStr.charAt(i));
        }
        return decoded.toString();
    }
    
    public static void main(String[] args) {
        String str = "Tushar";
        
        String encodedString = coded(str);
        System.out.println("Encoded string: " + encodedString);
        String decodedString = decoded(encodedString);
        System.out.println("Decoded string: " + decodedString);
    }
}
