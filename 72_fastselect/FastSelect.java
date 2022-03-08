// Computer Attackers: Salaj Rijal, Alif Rahman
// APCS pd8
// HW72 -- So So Fast
// 2022-03-08
// Time spent: .5 hrs

public class FastSelect {

    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o )
    {
      int tmp = o[x];
      o[x] = o[y];
      o[y] = tmp;
    }
  
    //print input array 
    public static void printArr( int[] a )
    {
      for ( int o : a )
        System.out.print( o + " " );
      System.out.println();
    }
  
    //shuffle elements of input array
    public static void shuffle( int[] d )
    {
      int tmp;
      int swapPos;
      for( int i = 0; i < d.length; i++ ) {
        tmp = d[i];
        swapPos = i + (int)( (d.length - i) * Math.random() );
        swap( i, swapPos, d );
      }
    }
  
    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal )
    {
      int[] retArr = new int[s];
      for( int i = 0; i < retArr.length; i++ )
        retArr[i] = (int)( maxVal * Math.random() );
      return retArr;
    }
    //--------------^  HELPER METHODS  ^--------------
  
    public static int partition( int arr[], int start, int end, int pivot)
    {
      int valueOfPivot = arr[pivot];
  
      swap( pivot, end, arr);
      int s = start;
  
      for( int i = start; i < end; i++ ) {
        if ( arr[i] <= valueOfPivot) {
          swap( i, s, arr );
          s++;}
      }
      swap(s,end,arr);
  
      return s;
    }//end mysterion
  
    public static int find( int arr[], int y) {
          int start = 0;
          int end = arr.length-1;
          int pivot = (start+end)/2;
          y--;
          System.out.println(start + " and pivot: " + pivot + " and end:" + end);
          pivot = partition( arr, start, end, pivot);

          while( pivot != y ){
          System.out.println(start + " and pivot: " + pivot + " and end:" + end);
          if( pivot < y ){
            start = pivot;
            pivot =  (start+end)/2;
          }
          else{
            end = pivot;
            pivot = (start+end)/2;
          }
                  pivot = partition( arr, start, end, pivot);
        }
          
          return arr[y];
    }
  
      public static void main(String[] args) {
        int[] arr = new int[]{ 1, 2, 3, 4, 5, 6};
        System.out.println( find(arr, 6) );
        int[] arr1 = new int[]{ 9823, 47, 326, 920, 7436, 234};
        System.out.println( find(arr1, 6) );
      }
  
  } // end of class FastSelect