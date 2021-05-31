package com.kubg.controller;

public class test {
	
	public static void main(String[] args) {
		
		Loop1 :
		for(int i=97; i<=122; i++) {
			char chrI = (char)i;
			for(int j=97; j<=122; j++) {
				char chrJ= (char)j;
				for(int k=97; k<=122; k++) {
					char chrK = (char)k;
					for(int l=97; l<=122; l++) {
						char chrL = (char)l;
						
						String str = ""+chrI+chrJ+chrK+chrL;
						System.out.println(str);
						
						if(str.equals("moon")) {
							break Loop1;
						}
					}
				}
			}
		} // Loop1
		
	}
}
