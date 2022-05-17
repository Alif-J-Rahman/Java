/**
 * class TreeNode
 * SKELETON
 * Implements a node for use in a binary tree.
 * Only holds int cargo.
 */

public class TreeNode
{

  //instance variables / attributes of a TreeNode:
  int _cargo;        //this node's data
  TreeNode _lt, _rt; //pointers to left, right childs


  /**
   * default constructor
   * Construct a tree node with specified value,
   * with null left and right childs.
   */
  TreeNode( int initValue )
  {
	_cargo = initValue;
	_lt = _rt = null;
  }


  /**
   * overloaded constructor
   * Construct tree node w specified value, left, and right childs.
   */
  TreeNode( int initValue, TreeNode initLeft, TreeNode initRight )
  {
	_cargo = initValue;
  _lt = initLeft;
  _rt = initRight;
  }


  /**
   * Returns the left child of this node.
   */
  TreeNode getLeft()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
	return _lt;
  }


  /**
   * Returns the right child of this node.
   */
  TreeNode getRight()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
	return _rt;
  }


  /**
   * Returns the value stored in this tree node.
   */
  int getValue()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
	return _cargo;
  }


  /**
   * Sets the value of the left child of this node.
   */
  void setLeft( TreeNode theNewLeft )
  {
    _lt = theNewLeft;
  }


  /**
   * Sets the value of the right child of this node.
   */
  void setRight( TreeNode theNewRight )
  {
    _rt = theNewRight;
  }


  /**
   * Sets the value of this tree node.
   */
  void setValue( int theNewValue ) 
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    _cargo = theNewValue;
  }

  public String toString(){
      return "\nthis node has value of " + getValue();
  }

}//end class