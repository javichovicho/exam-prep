/*
* CarServicingApp.java
*
*
*/
import javax.swing.*;

public class CarServicingApp{
	public static void main(String[] args){
		//declare variables
		String service;
		String branchLocation;
		String day;
		String word;


		//object
		CarServicing myObject = new CarServicing();

		//input
		service = JOptionPane.showInputDialog(null, "Please enter the type of service: full, interim or pre-nct");
		myObject.setService(service);

		branchLocation = JOptionPane.showInputDialog(null, "Please enter the branch location");
		myObject.setBranchLocation(branchLocation);

		//process
		myObject.compute();

		//output
		day = myObject.getDay();
		JOptionPane.showMessageDialog(null, "The day is: " + day);

		word = JOptionPane.showInputDialog(null, "Please enter a word");

		JOptionPane.showMessageDialog(null, myObject.wordManipulation(word));
	}

}
