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
  public String greet(String name){
        String value = (helloMsg + " " +  name);
        return(value);
	}
  String helloMsg;
  public void setHelloMsg(String msg){
	helloMsg = msg;
	}
}
