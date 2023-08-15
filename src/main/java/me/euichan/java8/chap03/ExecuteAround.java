package me.euichan.java8.chap03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteAround {

	public static void main(String[] args) throws IOException {
		// String oneLine = processFile((BufferedReader br) -> br.readLine());

		// 요구사항
		// String twoLine = processFile((BufferedReader br) -> br.readLine() + br.readLine());
	}

	public static String processFile() throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
			return br.readLine();
		}
	}
}
