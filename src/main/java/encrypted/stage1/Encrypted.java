package main.java.encrypted.stage1;

import java.util.Arrays;


public class Encrypted {

	public static void main(String[] args) {
		System.out.println(encrypt("we found a treasure!"));
	}

	private static String encrypt(String originalMessage) {
		char[] abcLowerToSeek = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] abcUpperToSeek = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char ch : originalMessage.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				int index = Arrays.binarySearch(abcUpperToSeek, ch);
				sb.append(abcLowerToSeek[abcLowerToSeek.length - index - 1]);
			} else if (Character.isLowerCase(ch)) {
				int index = Arrays.binarySearch(abcLowerToSeek, ch);
				sb.append(abcLowerToSeek[abcLowerToSeek.length - index - 1]);
			} else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
