// Task 4-> Remove Leading Zeroes from string 

import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
	Scanner scanner = new Scanner (System.in);

	  System.out.print ("Enter the string: ");
	String str = scanner.nextLine ();

	int num = Integer.parseInt (str);
	  str = Integer.toString (num);

	  System.out.println ("String after removing leading zeros is: " + str);

	  scanner.close ();
  }
}
