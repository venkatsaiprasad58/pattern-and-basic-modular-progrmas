package com.ojas.patternPrograms;

public class Pattern9 {

	public static void main(String[] args) {

		String str = "";
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						str += "0 ";
					} else {
						str += "1 ";
					}
				} else {
					if (j % 2 == 0) {
						str += "1 ";
					} else {
						str += "0 ";
					}

				}

			}
			str += "\r";
		}

		System.out.println(str);
	}

}
//output :
//	0 1 0 1 0 1 0 
//	1 0 1 0 1 0 1 
//	0 1 0 1 0 1 0 
//	1 0 1 0 1 0 1 
//	0 1 0 1 0 1 0 
//	1 0 1 0 1 0 1 
//	0 1 0 1 0 1 0 
//
