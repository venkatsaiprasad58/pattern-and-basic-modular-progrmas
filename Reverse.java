package com.ojas.assignment2;

public class Reverse {
	public static void main(String[] args) {
		String str = "Ojas innovative technologies";
		for(int i =str.length();i>0;i--) {
			System.out.print(str.charAt(i-1));
		}
	}
}
