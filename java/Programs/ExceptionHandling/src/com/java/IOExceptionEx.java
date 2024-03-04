package com.java;

import java.io.*;

public class IOExceptionEx {

	public static void main(String[] args) {
		String filePath = "example.txt"; // corrected typo in file path
		try {
			File file = new File(filePath);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line = br.readLine()) != null) { // corrected typo in while loop
				System.out.println(line);
			}
			br.close();
			fr.close();
		}catch(IOException e) { // corrected typo in IOException
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	} 

}

