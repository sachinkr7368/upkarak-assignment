import java.io.*;
import java.util.*;

class Main
{
  static int largest (int[]array, int n)
  {
    Arrays.sort (array);
    return array[n - 1];
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int array[] = new int[n];
    for (int i = 0; i < n; i++)
      {
	array[i] = sc.nextInt ();
      }

    System.out.println (largest (array, n));
  }
}

// time complexity O(nlogn);
// space complexity O(1);
