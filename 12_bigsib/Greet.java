// Team With A Vowel: Lior (toothless), Alif (Grippy), Josiah (Hedwig)
// APCS
// HW12 -- On Elder Individuality and the Elimination of Radio Fuzz/instance variables (?)/Accessing/"editing" BigSib by making a "copy"
// 2021-10-06

/*
Discoveries
-static isn't necessary for a function to work
-If a method is static, everything defined inside it is static, and everything used inside it MUST be static
-variables are method specific
-you can access variables by ClassName.MethodName.VariableName
-when we create a method containing helloMsg, an instance variable, we received an error if we us$
-you can define a variable without a method. This was similar to global variables in NetLogo and $
QCC
-What is static?
-What does BigSib mean as a "variable" (in reference to richard) type?
-What is richard?
-What is an instance variable?
-What really is an object
-Can anything take the place of "static" in the method header?
-Was it possible to code this homework without removing "static" from the method header?

*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

    BigSib spaceman = new BigSib();
    spaceman.setHelloMsg("Salutations");

    greeting = spaceman.greet("Dr. Spaceman");
    System.out.println(greeting);

    BigSib fooey = new BigSib();
    fooey.setHelloMsg("Hey ya");

    greeting = fooey.greet("Kong Fooey");
    System.out.println(greeting);

    BigSib mom = new BigSib();
    mom.setHelloMsg("Sup");

    greeting = mom.greet("mom");
    System.out.println(greeting);

  }
}
