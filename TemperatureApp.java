/*
* TemperatureApp.java
*
*
*/
import javax.swing.*;

public class TemperatureApp{
	public static void main(String[] args){

		//variables
		double[] average;
		double[][] myArray = new double[3][7];
		//double[][] myArray = {{1,2,3,4,5,6,7},{7,6,5,4,3,2,1},{1,2,3,4,3,2,1}};
		//double[][] myArray = {{7,5,6,7,8,3,4},{1,4,6,10,3,5,6},{-2,-4,0,3,8,7,12}};

		//object
		Temperature myObject = new Temperature();

		//input
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 7; j++){
				myArray[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter temperature"));
			}
		}
		myObject.setMyArray(myArray);

		//process
		myObject.compute();

		//output
		average = myObject.getAverage();
		for(int i = 0; i < 3; i++){
			System.out.println(average[i]);
		}

	}
}