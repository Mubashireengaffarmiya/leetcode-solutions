import java.util.Arrays;

public class Solution {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        // Typical test case
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(isAnagram(s1, t1));

        // Edge case
        String s2 = "a";
        String t2 = "ab";
        System.out.println(isAnagram(s2, t2));
    }
}