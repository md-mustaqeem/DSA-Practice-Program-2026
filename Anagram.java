import java.util.Arrays;

public class Anagram {
      public static boolean isAnagram(String s, String t) {

            if (s.length() != t.length()) {
                  return false;
            }

            char[] a = s.toCharArray();
            char[] b = t.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            boolean result = Arrays.equals(a, b);

            return result;
      }
      public static void main(String[] args) {
            String s = "listen";
            String t = "silent";
            System.out.println(isAnagram(s,t));
      }
}
