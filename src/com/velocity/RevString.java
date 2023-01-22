package com.velocity;

public class RevString {

	public static void main(String[] args) {
		String str = "hello all";
		char ch [] =str.toCharArray();
		for(int i=ch.length-1; i>0; i--) {
			System.out.print(ch[i]);
		}

	}

}
