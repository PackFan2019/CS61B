public class FirstClass {


    //https://sp21.datastructur.es/

//  https://sp21.datastructur.es/
//
//  https://people.eecs.berkeley.edu/~jrs/61b/
//
//  https://people.eecs.berkeley.edu/~jrs/61b/lec/01

//
//    THE LANGUAGE OF OBJECT-ORIENTED PROGRAMMING
//===========================================
//    Object:  An object is a repository of data.  For example, if MyList is a
//    ShoppingList object, MyList might record your shopping list.
//            Class:  A class is a type of object.  Many objects of the same class might
//  exist; for instance, MyList and YourList may both be ShoppingList objects.
//    Method:  A procedure or function that operates on an object or a class.
//    A method is associated with a particular class.  For instance, addItem might
//    be a method that adds an item to any ShoppingList object.  Sometimes a method
//    is associated with a family of classes.  For instance, addItem might operate
//    on any List, of which a ShoppingList is just one type.
//    Inheritance:  A class may inherit properties from a more general class.  For
//    example, the ShoppingList class inherits from the List class the property of
//            storing a sequence of items.
//    Polymorphism:  The ability to have one method call work on several different
//    classes of objects, even if those classes need different implementations of
//    the method call.  For example, one line of code might be able to call the
//  "addItem" method on _every_ kind of List, even though adding an item to a
//    ShoppingList is completely different from adding an item to a ShoppingCart.
//            Object-Oriented:  Each object knows its own class and which methods manipulate
//            objects in that class.  Each ShoppingList and each ShoppingCart knows which
//    implementation of addItem applies to it.
//
//    In this list, the one thing that truly distinguishes object-oriented languages
//    from procedural languages (C, Fortran, Basic, Pascal) is polymorphism.
//
//    Java
//----
//    Java allows you to store data in variables, but first you must _declare_ them
//    and specify their _type_.
//
//    Python:  x = 1       Scheme:  (let ((x 1)) )       Java:  int x;
//    x = 1;
//    This Java declaration does two things.
//            (1)  It allocates a chunk of memory big enough to store an integer, which
//    Java calls type "int".                                               ---
//            (2)  It names the variable (chunk of memory) "x".                       x |1|
//            ---
//    Variables are used not just to store numbers, but also to _reference_ objects.
//    There are two ways to get classes of objects to play with:
//            (1)  Use one defined by somebody else.  Java has tons of pre-defined classes
//    you can use.  Many come in the "Java standard library" provided with every
//    Java compiler.
//            (2)  Define your own.
//
//    For example, Java has a built-in class called String.
//
//    String myString;
//
//    This does _not_ create a String object.  Instead, it declares a variable (chunk
//                                                                                      of memory) that can store a _reference_ to a String object.  I draw it as a
//    box.
//
//           ---
//    myString | |                   <-- This box is a variable (not an object).
//            ---
//
//    Initially, myString doesn't reference anything.  You can make it reference a
//    String object by writing an assignment statement.  But how do we get ahold of
//    an actual String object?  You can create one.
//
//    myString = new String();
//
//    This line performs two distinct steps.  First, the phrase "new String()" is
//    called a _constructor_.  It constructs a brand new String object.  Second, the
//    assignment "=" causes myString to _reference_ the object.  You can think of
//this as myString pointing to the object.
//
//            ---     ------
//    myString |.+---->|    | a String object
//           ---     ------
//
//    Unlike Scheme and Python, Java programs must be compiled before you can run
//    them.  _Compilation_ converts your written code to a machine-readable bytecode.
//    The advantage is a faster program than one written in Scheme.  The disadvantage
//    is that you have to wait for it to compile.
//
//            Python                      Java
//             ------                      ----
//    Python program (.py)         Java program (.java)
//            |                           |
//            | python                    | javac
//    v                           v
//    Answer                  .class files
//                                           |
//                                                   | java
//            v
//    Answer
//
//    Postscript:  Anatomy of a Small Java Program (for discussion section)
//--------------------------------------------
//    Assume the following code is in a file called HelloWorld.java:
//
//    class HelloWorld {
//        public static void main (String[] args) {
//            System.out.println("Hello, world");
//        }
//    }
//
//    The classes are "HelloWorld", "String", and "System".
//    The objects are "args", "System.out", and the string "Hello, world".
//            (Actually, the first two of these are _references_ to objects.)
//    The methods are "main" and "println".  The println method prints its parameter,
//    and the main method prints the string "Hello, world".
//
//    You don't have the knowledge to completely understand this code yet, but don't
//    worry about it.  We'll take the first two lines on faith as the standard way to
//    start a Java program.  They'll become clear in the coming weeks.
//
//    Let's look at the innermost line first; it does all the action.  "out"
//    references an object whose class is PrintStream.  A PrintStream is a path by
//    which characters can be output by a program.  The characters that are sent
//    through "out" find their way to your computer screen.
//
//    System is a class which happens to contain the variable out (among many other
//            variables).  We have to write "System.out" to address the output stream,
//    because other classes might have variables called "out" too, with their own
//    meanings.
//
//"println" is a method (procedure) of the class PrintStream.  Hence, we can
//    invoke "println" from any PrintStream object, including System.out.  "println"
//    takes one parameter, which can be a string.
//
//"main" is a method in the "HelloWorld" class.  The HelloWorld class knows how
//            to do the "main" operation, just like the PrintStream class knows how to do the
//"println" operation.
//                                                  ------------------------
//                                                          ------------------   ----------------------   |                      |
//                                                          |                |   |                    |   |                      |
//                                                          |        ---     |   |  println (method)  |   |                      |
//            |    out |.+-----+-->|                    |   |                      |
//            |        ---     |   |                    |   |    main (method)     |
//            --System (class)--   --An object of class--   |                      |
//    PrintStream         |                      |
//            ---HelloWorld (class)---
//
//    The classes System and PrintStream are all automatically provided for you by
//    any Java compiler.  Somebody has programmed them for you, so that you don't
//    have to figure out for yourself how to send characters to the terminal.


}


