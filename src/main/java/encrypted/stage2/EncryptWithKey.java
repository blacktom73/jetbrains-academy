package main.java.encrypted.stage2;

import java.util.Arrays;


public class EncryptWithKey {

	public static void main(String[] args) {
		System.out.println(encrypt(">welcome to hyperskill", 5));
	}

	public static String encrypt(String originalMessage, int key) {
		char[] abcLowerToSeek = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] abcUpperToSeek = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char ch : originalMessage.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				int index = Arrays.binarySearch(abcUpperToSeek, ch);
				sb.append(calculateNewIndexPosition(key, abcUpperToSeek, index));
			} else if (Character.isLowerCase(ch)) {
				int index = Arrays.binarySearch(abcLowerToSeek, ch);
				sb.append(calculateNewIndexPosition(key, abcLowerToSeek, index));
			} else if (ch == '>') {
				continue;
			} else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	private static char calculateNewIndexPosition(int key, char[] abcToSeek, int index) {
		if (key + index >= abcToSeek.length) {
			int shift = (key + index) % abcToSeek.length;
			return abcToSeek[shift];
		}
		return abcToSeek[index + key];
	}
}
