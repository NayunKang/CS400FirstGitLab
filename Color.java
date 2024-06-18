//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title: Lab week 3
// Course: CS 400 Summer 2024
//
// Author: Nayun Kang
// Email: nkang39@wisc.edu
// Lecturer: Jiazhen Zhou
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// NONE
//
//////////////////////// ASSISTANCE/HELP CITATIONS ////////////////////////////
//
//NONE
//
///////////////////////////////////////////////////////////////////////////////

/*
 *	Color class
 */
public class Color{
	private String color;

	//Constructor
	public Color(String iniColor){
		if(isColorValid(iniColor)){
			this.color = iniColor;
		}
		else{
			System.out.println("Failed to initalize the color");
		}
	}

	//Getter
	public String getColor(){
		return this.color;
	}

	/* The method for changing the color
	 * TODO: Revise the code so that it return true only if the input color is valid
	 * 	and different from the exisitng color before making the change
	 */
	public boolean  changeColor(String newColor){
		
	if (isColorValid(newColor) && !newColor.equals(this.color)) {
            this.color = newColor;
            return true;
        }
        return false;
	}

	public boolean isColorValid(String inputColor){
		String [] validColor = {"red","orange","yellow","green", "cyan", "blue","purple"};
		for(int i=0; i<validColor.length; i++){
			if(inputColor.equals(validColor[i])){
				return true;
			}
		}
		
		//Failed to find a match, the color is invalid
		return false;
	}
}
