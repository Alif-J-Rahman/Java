// Team With A Vowel: Lior (toothless), Alif (Grippy), Josiah (Hedwig)
// APCS
// HW10 -- Refactor Big Sib One/function types and return/Rewriting void BigSib.greet() to return a String
// 2021-10-04

/*
DISCOVERIES
-Your function type (void, int, String, double, etc) dictates the type it is treated as.
-You cannot print a void
-Tested out the idea that a java function needs a main only if it will be executable
 (BigSib.greet(<name>) runs despite not having a main, and BigSib compiles without a main, but java BigSib throws a runtime error)
-Git will push everything in the directory (not just the current one, but everything in the root directory (idk if thats correct notation))
-***HYPOTHESIS*** object types are necessary to help compilation and creation of class files understand what variables are being used as inputs in what functions
 Furthermore, the "tightness" of java is related to the fact that it is a compiled language
UNRESOLVED QUESTIONS
-Can a .class file be reverse engineered into the original .java file? (Not super related)
-What exactly is a void type? Is it just no return?
*/

public class Greet {
  public static void main(String[] args) {
    System.out.println(BigSib.greet("Crosby"));
    System.out.println(BigSib.greet("Stills"));
    System.out.println(BigSib.greet("Nash"));
  }
}
