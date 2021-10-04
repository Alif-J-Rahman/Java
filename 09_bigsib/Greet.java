// Team With A Vowel: Lior (toothless), Alif (Grippy), Josiah (Hedwig)
// APCS
// HW09 -- What Are BigSibs Good For?/Calling methods from other classes/Calling the BigSib method greet from the Greet class
// 2021-10-03

/*
DISCOVERIES
-You can reference another classes methods (IN THE SAME DIRECTORY) by using ClassName.MethodName(Args)
-You can reference the current class's methods (although unnecessary) as ClassName.MethodName(Args)
-You cannot reference classes in other directories by providing file paths from the current directory
-Null... Not sure what it is, found on intertrash
-Main method is hard to reference from a different class because you must have String[] input
-If foo is a String[] and System.out.println(foo) yields <hoodyhah>, using <hoodyhah> to reference foo fails
 (Even tried removing [Ljava.lang.String;)
 I believe racket allows you to reference things by their "code" names, is this another difference between compiled and interpreted languages?
-You can reference classes with just their .class files
-You can't pull files ignored by .gitignore with a standard pull command from github

UNRESOLVED QUESTIONS
-Null?
-Why is main so hard to reference? I tried inputting {""} and {"foo"} to be a String[] but it didn't work
 My theory about this is that {""} isn't imediately recognized as String[], since arrays are a bit wack in java
-How does java recognize "foo" as a string but not {"foo"} as String[]?
 (Essentially what allows java to recognize the types of undefined literals)
-printing foo (see below) yields: [Ljava.lang.String;@7cef4e59 . Why can't I use this to reference foo?
*/

public class Greet {
	public static void main(String[] args){
		BigSib.greet("Jacob");
		BigSib.greet("Amir");
		BigSib.greet("Josiah");

		/*
		The purpose of this comment is to document my attempts at calling class Queso (see below) even though Queso.java isn't in 09_bigsib

		Queso.main(null);
		Calling Queso.main gave me ALOT of trouble, ended up intertrashing to find null.

		String[] foo={"abcd"};
		Queso.main(foo);
		This worked, since foo is a String[]
		*/
	}

	public static void greet(String name) {
		System.out.println("Josiah gives you a warm welcome, "+name);
	}
}

/*
Queso.java:

public class Queso {
	public static void main(String[] args){
		System.out.println("No hablo queso");
	}
	public static void queso(){
		System.out.println("No hablo queso");
	}
}
*/
