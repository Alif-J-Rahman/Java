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

public class Greet{
 public static void main(String[] args) {
  String greeting;
  String greeting1;
  String greeting2;
  String greeting3;

  BigSib richard = new BigSib("Word Up");
//richard.setHelloMsg("Word up"); we don't need this because of constructor method added to BigSib.java
  greeting = richard.greet("freshman");
  System.out.println(greeting);

  BigSib robert = new BigSib("Salutations");
  greeting1 = robert.greet("Dr. Spaceman");
  System.out.println(greeting1);

  BigSib raymond = new BigSib("Hey ya");
  greeting2 = raymond.greet("Kong Fooey");
  System.out.println(greeting2);

  BigSib russel = new BigSib("Sup");
  greeting3 = russel.greet("mom");
  System.out.println(greeting3);

 }
}
