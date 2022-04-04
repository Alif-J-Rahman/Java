//Froghats: Kevin Cheng, Salaj Rijal, Alif Rahman
//APCS pd8
//HW87 -- The English Do Not Wait In Line for Soup
//2022-04-01f
//time spent: 1h

/***
 * class NodeQueue
 * desc
 **/

public class NodeQueue implements Queue
{
  //instance vars
  private String _cargo;
  private NodeQueue _nextNode;

  // constructor
  public NodeQueue( String value, NodeQueue next )
  {
    _cargo = value;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return _cargo;
  }

  public NodeQueue getNext()
  {
    return _nextNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    String foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public NodeQueue setNext( NodeQueue newNext )
  {
    NodeQueue foo = getNext();
    _nextNode = newNext;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return _cargo;
  }


  //main method for testing
  public static void main( String[] args )
  {

    //Below is an exercise in creating a linked list...

    //Create a node
    NodeQueue first = new NodeQueue( "cat", null );

    //Create a new node after the first
    first.setNext( new NodeQueue( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new NodeQueue( "cow", null ) );

    /* A naive list traversal, has side effects.... ??
       while( first != null ) {
       System.out.println( first );
       first = first.getNext();
       }
    */

    //Q: when head ptr moves to next node in list, what happens to the node it just left?
    //A: garbage collector reclaims that memory

    //  so, better: (w/o moving first)
    /*
    NodeQueue temp = first;
    while( temp != null ) {
      System.out.println( temp );
      temp = temp.getNext();
    }
    */

  }//end main

}//end class NodeQueue
