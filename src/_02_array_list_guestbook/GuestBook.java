package _02_array_list_guestbook;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GuestBook implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton addName = new JButton();
	JButton viewName = new JButton();
	JButton Human = new JButton();
	int h = 0;
	String nameslist;
	ArrayList<String> names  = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Handers
	// Guest #2: Sandy Summers
	// Guest #3: Greg Sanders
	// Guest #4: Downy Boners
	// Newline 
	
	public void run() {
		names.add("Bob Handers");
		names.add("Sandy Summers");
		names.add("Greg Sanders");
		names.add("Downy Boners");
		nameslist = names.get(0) + "\n" + names.get(1) + "\n" +names.get(2) + "\n" +names.get(3);
		frame.add(panel);
		panel.add(viewName);
		panel.add(addName);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addName.addActionListener(this);
		viewName.addActionListener(this);
		Human.addActionListener(this);
		addName.setText("add name");
		viewName.setText("view names");
		Human.setText("T E R M I N A T E   H U M A N");
		frame.pack();
		
	
	}

	@Override
	public void actionPerformed(ActionEvent eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee) {
		if(eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee.getSource() == viewName) {
			JOptionPane.showMessageDialog(null, nameslist);
			
		System.out.println("viewed names");
		
		}if(eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee.getSource() == addName) {
			JOptionPane.showMessageDialog(null, "Loading... Getting List...");
			String hh = JOptionPane.showInputDialog("What name you want to add?");
			names.add(hh);
		nameslist = nameslist + "\n" + hh;
		}
		
		}
	}


