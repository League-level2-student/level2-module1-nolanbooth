package _00_intro_to_array_lists;
import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//2. Add five Strings to your list
		list.add("Lukas");
		list.add("Nolan");
		list.add("Matej");
		list.add("Rishi");
		list.add("Dylan");
		for(int i = 0; i < 40; i++) {
			numbers.add(i+1);
		}
		int max;
		int min;
		max = Integer.MAX_VALUE;
		min = Integer.MIN_VALUE;
		/*3. Print all the Strings using a standard for-loop*/
		for(int i = 0; i < list.size(); i++) {
			String h = list.get(i);
			System.out.println(i + " ... " + h);
			}
		//4. Print all the Strings using a for-each loop
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println();
		for(Integer h : numbers) {
			System.out.println(h);
		}
//		System.out.println(min);
	//	System.out.println(max);
		//5. Print only the even numbered elements in the list.
		for(Integer l : numbers) {
			
			if(l%2 == 0) {
				System.out.println(l);
			}
		}
		//6. Print all the Strings in reverse order.
		for(int i = numbers.size()-1;i >= 0; i++) {
			System.out.println(i);
		}
		//7. Print only the Strings that have the letter 'e' in them.
	
	
	}
}
