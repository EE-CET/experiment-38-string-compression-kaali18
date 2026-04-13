import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            
            if (s == null || s.isEmpty()) {
                System.out.println(s);
                return;
            }
            
            StringBuilder compressed = new StringBuilder();
            int countConsecutive = 0;
            
            for (int i = 0; i < s.length(); i++) {
                countConsecutive++;
                
                if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                    compressed.append(s.charAt(i));
                    compressed.append(countConsecutive);
                    countConsecutive = 0;
                }
            }
            
            if (compressed.length() <= s.length()) {
                System.out.println(compressed.toString());
            } else {
                System.out.println(s);
            }
        }
        scanner.close();
    }
}
