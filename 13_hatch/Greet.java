/*
Excellent Apples: Ariella Katz, Tom, Alif Rahman, Grippy
APCS
HW13 -- Constructor methods
*/

/*
DISCO:
Constructor methods let us choose what the default value of an instance variable is.
QCC:
How does the computer know to invoke the constructor method whenever a new instance of BigSib is created?
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
