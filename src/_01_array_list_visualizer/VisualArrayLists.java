package _01_array_list_visualizer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.Timer;

import _01_array_list_visualizer.data.ArrayList;

public class VisualArrayLists implements ActionListener {
	Timer timer;
	JFrame frame = new JFrame();
	Timer exp;
	ArrayList<String> alist = new ArrayList<String>();

	public void addThingsToList() {
		// 1. Add a bunch of items to our list (4 or 5 should be enough!)
		alist.add("0 - zero");
		alist.add("1 - one");
		alist.add("2 - two");
		alist.add("3 - three");
		alist.add("4 - four");
		exp = new Timer(10 / 1, this);
		exp.start();

		// 2. Set one item in our list to be something different
		// I did that later

		for (int i = 0; i < alist.size(); i++) {
			String h = alist.get(i);
			System.out.println(h);
		}

		// 3. Remove something from our list

		
			alist.set(0, "corrupted");
			alist.set(1, "corrupted");
			alist.set(2, "corrupted");
			alist.set(3, "corrupted");
			alist.set(4, "corrupted");
			alist.set(0, "0 - zero");
			alist.set(1, "1 - one");
			alist.set(2, "2 - two");
			alist.set(3, "3 - three");
			alist.set(4, "4 - four");
			alist.remove(0);
			alist.remove(0);
			alist.remove(0);
			alist.remove(0);
			alist.remove(0);
			alist.add("0 - zero");
			alist.add("1 - one");
			alist.add("2 - two");
			alist.add("3 - three");
			alist.add("4 - four");

		

		// 4. Print the size of our list
System.out.println(alist.size());
		// 5. Check if our list contains a specific thing of your choice
		// and print whether it is in the list or not.
	if(alist.contains("4 - four")) {
		System.out.println("The number four is on the list.");
	}else {
		System.out.println("no");
	}
		// 6. Get a specific item from our list and print it out
	System.out.println(alist.get(1));
		// 7. Clear our  of all items
	//alist.clear();
		// 8. Print the size of our list again
	System.out.println(alist.size());
	}

	/*
	 * \ ------------CHANGE ANYTHING BELOW THIS
	 * LINE--------------------------------- \
	 */
	public static void main(String[] args) {
		VisualArrayLists vcc = new VisualArrayLists();
		vcc.setup();
	}

	void setup() {
		timer = new Timer(1 / 1, this);
		timer.start();
		frame.setVisible(true);
		frame.setTitle("LEAGUE ArrayList Visualizer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(alist.displayPanel);
		frame.pack();
		addThingsToList();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		alist.draw();
	}
}
