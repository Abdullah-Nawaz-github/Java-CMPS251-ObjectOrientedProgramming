package ArrayList;

import java.util.ArrayList;

public class ArrayListCollection {
	public static void main(String[] args) {
		
		// create a new ArrayList of Strings with an initial capacity of 10
		
		ArrayList<String> items = new ArrayList<String>();
		items.add("red"); // append an item to the list
		items.add(0, "yellow"); // insert the value at index 0
		// header
		
		System.out.print("Display list contents with counter-controlled loop:");
		
		// display the colors in the list
		for (int i = 0; i < items.size(); i++)
			System.out.printf(" %s", items.get(i));
		
		// display colors using foreach in the display method
		display(items, "\nDisplay list contents with enhanced for statement:");
		
		items.add("green"); // add "green" to the end of the list
		items.add("yellow"); // add "yellow" to the end of the list
		
		display(items, "List with two new elements:");
		
		items.remove("yellow"); // remove the first "yellow"
		display(items, "Remove first instance of yellow:");
		
		items.remove(1); // remove item at index 1
		display(items, "Remove second list element (green):");
		
		// check if a value is in the List
		System.out.printf("\"red\" is %sin the list\n", items.contains("red") ? "" : "not ");
		
		// display number of elements in the List
		System.out.printf("Size: %s\n", items.size());
		
		System.out.println(getRepeatCount(items,"red"));
	} // end main
		// display the ArrayList's elements on the console

	public static void display(ArrayList<String> items, String header) {
		System.out.print(header); // display header
		// display each element in items
		for (String item : items)
			System.out.printf(" %s", item);
		System.out.println(); // display end of line
	} // end method display
	
//	Add a static method getRepeatCount(List<String> string, String value). Let the method return how
//	many times that string value exists in the list or return 0 otherwise. Test the method by finding how
//	many RED’s are in the items list of the main method.
	public static int getRepeatCount(ArrayList<String> string, String value) {
		int count=0;
		for(String s:string) {
			if (s.equalsIgnoreCase(value)) {
				count++;
			}
		}
		return count;
		
	}
} // end class ArrayListCollection