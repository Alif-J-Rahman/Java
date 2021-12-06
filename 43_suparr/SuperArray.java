// Clyde "Thluffy" Sinclair
// APCS pd0
// HW43 -- encapsulation (basic SuperArray functionality)
// 2021-12-07t

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[]{0,1,2,3,4,5,6,7,8,9};
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String ans = "[" + _data[0];
    for (int i = 1; i < _data.length; i++) {
      ans += ", " + _data[i];
    }
    return ans + "]";
  }


  //double capacity of SuperArray
  private void expand()
  {
    SuperArray con = new SuperArray();
    con._data = _data;
    _data = new int[20];
    for (int i = 0; i < 10; i++) {
      _data[i] = con.get(i);
    }
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int oldVal = get(index);
    _data[index] = newVal;
    return oldVal;
  }


  //main method for testing
  public static void main( String[] args )
  {

      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);
      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
      
  }//end main()


}//end class
