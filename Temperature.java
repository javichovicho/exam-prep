/*
* Temperature.java
*
*
*/
public class Temperature{

	//data members
	private double average[];
	private double[][] myArray;
	private double sum;

	//constructor
	public Temperature(){
		average = new double[3];
		myArray = new double[3][7];
		sum = 0;
	}

	//set methods
	public void setMyArray(double[][] myArray){
		this.myArray = myArray;
	}

	//compute method
	public void compute(){
		for(int i = 0; i < 3; i++){
			sum = 0;
			for(int j = 0; j < 7; j++){
				sum += myArray[i][j];
			}
			average[i] = sum / 7;
		}
	}

	//get methods
	public double[] getAverage(){
		return average;
	}

}