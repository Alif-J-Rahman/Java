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

public class BigSib {
 String helloMsg; //declares instance variable helloMsg (of type String)

 public BigSib(String msg) {
  helloMsg = msg; //sets "Word up" as the default helloMsg whenever there is a new instance of BigSib
 }

 public String greet(String name) { //not static because it uses an instance variable
  return(helloMsg + " " + name); //this output will be printed by Greet.java
 }
}
