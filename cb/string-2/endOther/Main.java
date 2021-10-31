// https://codingbat.com/prob/p126880

public class Main {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc")); // true
        System.out.println(endOther("AbC", "HiaBc")); // true
        System.out.println(endOther("abc", "abXabc")); // true
    }

    /*
     * Given two strings, return true if either of the strings appears at the
     * very end of the other string, ignoring upper/lower case differences (in
     * other words, the computation should not be "case sensitive"). Note:
     * str.toLowerCase() returns the lowercase version of a string.
     */
    public static boolean endOther(String a, String b) {
      a = a.toLowerCase();
      b = b.toLowerCase();
      int aLen = a.length();
      int bLen = b.length();
      if (aLen >= bLen && a.substring(aLen-bLen).equals(b)) {
        return true;
      }
      if (bLen > aLen && b.substring(bLen-aLen).equals(a)) {
        return true;
      }
      return false;
    }
}
