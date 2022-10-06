package com.yash.training.Array;

import java.util.Arrays;

public class Program8 {

	public static void main(String[] args) {

		String name = "yashtechnology";
		char ch[] = name.toCharArray();
		char vowel[] = new char[name.length()];
		char consonant[] = new char[name.length()];
		int k = 0;
		int t=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				vowel[k] = ch[i];
				k++;
			}
			else if ((ch[i] >= 'a' && ch[i] <= 'z')) {
					consonant[t] = ch[i];
					t++;
				 }
		}
		System.out.println("Vowel : " + Arrays.toString(vowel));
		System.out.println("Consonant : " + Arrays.toString(consonant));

	}

}
