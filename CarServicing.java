/*
* CarServicing.java
*
*
*/

public class CarServicing{

	//data members
	private String service;
	private String branchLocation;
	private String day;

	//constructor
	public CarServicing(){
		service = "";
		branchLocation = "";
		day = "";
	}

	//set methods
	public void setService(String service){
		this.service = service;
	}
	public void setBranchLocation(String branchLocation){
		this.branchLocation = branchLocation;
	}

	//compute method
	public void compute(){
		if((service.equals("full"))&&(branchLocation.equals("blanchardstown"))){
			day = "Monday";
		}else if((service.equals("full"))&&(branchLocation.equals("stillorgan"))){
			day = "Tuesday";
		}
		if((service.equals("interim"))&&(branchLocation.equals("blanchardstown"))){
			day = "Wednesday";
		}else if((service.equals("interim"))&&(branchLocation.equals("stillorgan"))){
			day = "Thursday";
		}
		if((service.equals("pre-nct"))&&(branchLocation.equals("blanchardstown"))){
			day = "Friday";
		}else if((service.equals("pre-nct"))&&(branchLocation.equals("stillorgan"))){
			day = "Saturday";
		}

	}

	//get methods
	public String getDay(){
		return day;
	}

	public static String wordManipulation(String word){

		StringBuffer strBuff = new StringBuffer();
		String newWord;

		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) == 'a'){
				strBuff.append('@');
			}else if((word.charAt(i) == 'm')||(word.charAt(i) == 'n')||(word.charAt(i) == 'p')||(word.charAt(i) == 'r')){
				//do nothing
			}else{
				strBuff.append(word.charAt(i));
			}
		}

		newWord = strBuff.toString();
		return newWord;
	}

}