package com.ojas.patternPrograms;

public class Pattern2 {
	public static void main(String[] args) {

		String str = "";
		for (int i = 7; i >= 1; i--) {
			for (int j = 7; j >= i; j--) {
				str += j + " ";
			}
			str += "\n";
		}

		System.out.println(str);
	}
}
//Output :
	//7 
	//7 6 
	//7 6 5 
	//7 6 5 4 
	//7 6 5 4 3 
	//7 6 5 4 3 2 
	//7 6 5 4 3 2 1 
