/* Team Sigma : Kevin Xiao + Mr. Swag, Ariella Katz + Tom, Alif Rahman + Grippy
APCS
HW 27- FOR the Love of Strings
2021-10-28
Time spent: 0.5 hours
DISCO:
String.length() can be used to find the length of a string.
For loops needs three pre-conditions when initializing, first is initializing the varibale, then is the boolean expression for it to run, and then finally
is the change in the initial variable.
String.substring() takes in two integer arguments, m and n, and returns all of the characters of the string between the mth and nth digit of the string.
QCC:
How would we use for loop to calculate sum of arithmetic or geometric series?
*/

public class Rof {

  public static String fenceF (int posts) {
  	String fence = "|";
  	for (int i = posts; i > 1; i -= 1) {
  		fence += "--|";
  		}
  	return fence;
  }

  public static String reverseF (String s) {
  	String p = "";
  	for (int i = s.length(); i > 0; i -= 1) {
  		p += s.substring(i-1,i);
  		}
  	return p;
  }

  public static String reverseR (String s) {
    if (s.length() == 0) {
      return s;
    }
      return s.substring(s.length()-1,s.length()) + reverseR(s.substring(0,s.length()-1));
  }

  public static void main(String[] args){
  	System.out.println(fenceF(3));
  	System.out.println(fenceF(0));
  	System.out.println(fenceF(4));
  	System.out.println(fenceF(-4));
  	System.out.println(fenceF(1));
  	System.out.println(reverseF("hello there"));
  	System.out.println(reverseF("tu madred"));
  	System.out.println(reverseF("23"));
  	System.out.println(reverseF("fr"));
    System.out.println(reverseR("hello there"));
    System.out.println(reverseR("tu madred"));
    System.out.println(reverseR("23"));
    System.out.println(reverseR("fr"));
  }
}
