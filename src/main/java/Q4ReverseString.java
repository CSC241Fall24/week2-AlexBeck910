// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

    public static String reverse(String s) {
      if(s.length() <= 0) {
        return "";
      }
      return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }
}
